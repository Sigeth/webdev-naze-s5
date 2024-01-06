package fr.isen.naze.services.impl;

import fr.isen.naze.models.Availability;
import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;
import fr.isen.naze.models.ServiceLevel;
import fr.isen.naze.services.OrderService;
import jakarta.enterprise.context.ApplicationScoped;

import java.net.URI;
import java.util.List;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.ForbiddenException;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderVM getOrderById(int id_order) {
        return OrderVM.findById(id_order);
    }

    @Override
    public OrderVM updateOrderById(int id_order, OrderVM newOrder) {
        OrderVM entityOrder = OrderVM.findById(id_order);
        if (entityOrder == null ) {
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

    @Override
    public OrderVM addOrder(OrderVM newOrder) {
        newOrder.persist();
        return newOrder;
    }

    @Override
    public Contact getContactByOrderId(final int id_order) {
        OrderVM order = OrderVM.findById(id_order);
        return order.contact_order;
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
        }
        Contact entityContact = entityOrder.contact_order;
        if (entityContact == null) {
            throw new NotFoundException();
        }

        entityContact.id_contact = newContact.id_contact;
        entityContact.first_name = newContact.first_name;
        entityContact.last_name = newContact.last_name;
        entityContact.email = newContact.email;
        entityContact.address = newContact.address;
        entityContact.post_code = newContact.post_code;
        entityContact.city = newContact.city;
        entityContact.country = newContact.country;
        entityContact.phone = newContact.phone;
        if (!entityContact.availabilities.equals(newContact.availabilities)) {

        }

        return newContact;
    }
}

