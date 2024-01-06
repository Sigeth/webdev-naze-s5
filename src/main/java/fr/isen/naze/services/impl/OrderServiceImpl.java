package fr.isen.naze.services.impl;

import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;
import fr.isen.naze.services.OrderService;
import jakarta.enterprise.context.ApplicationScoped;

import java.net.URI;

import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderVM getOrd0erById(int id_order) {
        return OrderVM.findById(id_order);
    }

    @Override
    public void updateOrderById(int id_order, OrderVM newOrder) {
        OrderVM entityOrder=OrderVM.findById(id_order);
        if (entityOrder == null ) {
            throw new NotFoundException();
        }
        entityOrder.contact_order = newOrder.contact_order;
        entityOrder.service_order = newOrder.service_order;
        entityOrder.project_order = newOrder.project_order;
        entityOrder.carbon = newOrder.carbon;
        entityOrder.license = newOrder.license;
        entityOrder.location = newOrder.location;
        entityOrder.price = newOrder.price;
        entityOrder.solution_name = newOrder.solution_name;
        entityOrder.solution_description = newOrder.solution_description;
        entityOrder.id_order = newOrder.id_order;
    }

    @Override
    public OrderVM addOrder(OrderVM newOrder) {
        newOrder.persist();
        return newOrder;
    }

    @Override
    public Contact getContactByOrderId(final int orderID) {
        return null;
    }

    @Override
    public Contact addContactByOrderId(final int id_order, final Contact new_contact) {
        return null;
    }

    @Override
    public Contact updateContactByOrderId(int orderID, Contact newContact) {
        return null;
    }
}

