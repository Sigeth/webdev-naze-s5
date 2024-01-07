package fr.isen.naze.services.impl;

import fr.isen.naze.models.Availability;
import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;
import fr.isen.naze.models.ServiceLevel;
import fr.isen.naze.services.OrderService;
import jakarta.enterprise.context.ApplicationScoped;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.ForbiddenException;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class OrderServiceImpl implements OrderService {
    private void updateAvailability(List<Availability> oldAvailabilities, List<Availability> newAvailabilities) {
        for (int i=0; i < newAvailabilities.size() && i < oldAvailabilities.size(); i++) {
            Availability o1 = oldAvailabilities.get(i);
            Availability o2 = newAvailabilities.get(i);

            if (o1.id_day == o2.id_day) {
                o1.day = o2.day;
                o1.morning = o2.morning;
                o1.afternoon = o2.afternoon;
            }
        }


    }

    private boolean checkAvailabilitiesEquals(List<Availability> a1, List<Availability> a2) {
        if (a1.size() != a2.size()) {
            return false;
        }
        for (int i=0; i < a1.size(); i++) {
            Availability o1 = a1.get(i);
            Availability o2 = a2.get(i);
            if (o1.id_day != o2.id_day ||
                o1.day != o2.day ||
                o1.morning != o2.morning ||
                o1.afternoon != o2.afternoon
            ){
                return false;
            }
        }
        return true;
    }
    @Override
    public OrderVM getOrderById(int id_order) {
        return OrderVM.findById(id_order);
    } //Renvoie l'order de la BDD en fonction de son ID

    @Override
    public OrderVM updateOrderById(int id_order, OrderVM newOrder) {
        OrderVM entityOrder = OrderVM.findById(id_order); //récupération de l'order dans la bdd en fonction de son ID
        if (entityOrder == null ) { //Si on trouve pas d'order on renvoie une erreur
            throw new NotFoundException();
        }

        if (!entityOrder.contact_order.equals(newOrder.contact_order)) {
            updateContactByOrderId(entityOrder.id_order, newOrder.contact_order);
        }

        if (!entityOrder.service_order.equals(newOrder.service_order)) {
            List<ServiceLevel> serviceLevels = ServiceLevel.listAll();
            if (newOrder.service_order.id_service >= serviceLevels.size()) {
                throw new BadRequestException();
            } else {
                entityOrder.service_order = serviceLevels.get(newOrder.service_order.id_service);
            }
        }
        //Update des attributs de entityOrder
        entityOrder.id_order = newOrder.id_order;
        entityOrder.carbon = newOrder.carbon;
        entityOrder.license = newOrder.license;
        entityOrder.location = newOrder.location;
        entityOrder.price = newOrder.price;
        entityOrder.solution_name = newOrder.solution_name;
        entityOrder.solution_description = newOrder.solution_description;
        // Project order cannot be changed. User should create a new order for a new project

        return newOrder;
    }

    @Override //Création d'une nouvelle Order
    public OrderVM addOrder(OrderVM newOrder) {
        newOrder.persist();
        return newOrder;
    }

    @Override //Récupération du contact en fonction de son orderid
    public Contact getContactByOrderId(final int id_order) {
        OrderVM order = OrderVM.findById(id_order); //Récupération de l'order en fonction de l'ID
        return order.contact_order; //Retourne le contact de l'order.
    }

    @Override
    public Contact addContactByOrderId(final int id_order, final Contact newContact) {
        newContact.persist();
        OrderVM entityOrder = OrderVM.findById(id_order);
        if (entityOrder == null ) {
            throw new NotFoundException();
        }
        entityOrder.contact_order = newContact;
        return newContact;
    }

    @Override
    public Contact updateContactByOrderId(int id_order, Contact newContact) {
        OrderVM entityOrder = OrderVM.findById(id_order);
        if (entityOrder == null ) {
            throw new NotFoundException();
        } //Retourne une erreur si On ne trouve pas d'order dans la BDD
        Contact entityContact = entityOrder.contact_order;
        if (entityContact == null) {
            throw new NotFoundException();
        }
        //Mise à jour des attributs de entityContact
        entityContact.id_contact = newContact.id_contact;
        entityContact.first_name = newContact.first_name;
        entityContact.last_name = newContact.last_name;
        entityContact.email = newContact.email;
        entityContact.address = newContact.address;
        entityContact.post_code = newContact.post_code;
        entityContact.city = newContact.city;
        entityContact.country = newContact.country;
        entityContact.phone = newContact.phone;
        if (!checkAvailabilitiesEquals(entityContact.availabilities, newContact.availabilities)) {
            updateAvailability(entityContact.availabilities, newContact.availabilities);
        }

        return newContact;
    }
}

