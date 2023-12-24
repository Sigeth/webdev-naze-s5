package fr.isen.naze.services;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.Order;

@objid ("9117d67b-ce6a-4c7c-a888-2e38365a0d2e")
public interface OrderService {
    @objid ("c12751d6-a393-479e-a87d-0c0312b67b2a")
    Order getOrderById(final int id_order);

    @objid ("81d406ab-96fa-4487-89a8-80bfe85028e6")
    void updateOrderById(final int id_order, final Order newOrder);

    @objid ("31477cbe-25ab-4a4c-be7e-85edbd2c63bd")
    Order addOrder(final Order newOrder);

}
