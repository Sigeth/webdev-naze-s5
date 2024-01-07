package fr.isen.naze.services;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;
import jakarta.persistence.criteria.Order;
import jakarta.ws.rs.core.Response;

@objid ("9117d67b-ce6a-4c7c-a888-2e38365a0d2e")

//création de l'interface OrderService
public interface OrderService {
    @objid ("c12751d6-a393-479e-a87d-0c0312b67b2a")
    OrderVM getOrderById(final int id_order);

    @objid ("81d406ab-96fa-4487-89a8-80bfe85028e6")
    OrderVM updateOrderById(final int id_order, final OrderVM newOrder);

    @objid ("31477cbe-25ab-4a4c-be7e-85edbd2c63bd")
    OrderVM addOrder(final OrderVM newOrder);

    @objid ("d9c57465-ae9d-42e2-b60b-557be07dbbd3")
    Contact getContactByOrderId(final int id_order);

    @objid ("00d9528e-f1ed-4271-a6d6-c0615a7903c8")
    Contact addContactByOrderId(final int id_order, final Contact newContact);

    @objid ("4670e032-81b0-4e1e-9445-bddaa0a5e26e")
    Contact updateContactByOrderId(final int id_order, final Contact newContact);
}
