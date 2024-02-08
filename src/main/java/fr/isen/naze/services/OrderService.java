package fr.isen.naze.services;

import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;


//création de l'interface OrderService
public interface OrderService {
    OrderVM getOrderById(final int id_order);

    OrderVM updateOrderById(final int id_order, final OrderVM newOrder);

    OrderVM addOrder(final OrderVM newOrder);

    Contact getContactByOrderId(final int id_order);

    Contact addContactByOrderId(final int id_order, final Contact newContact);

    Contact updateContactByOrderId(final int id_order, final Contact newContact);
}
