package fr.isen.naze.services;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;

@objid ("9bade41b-32ef-4e82-80cd-d82ff0e54450")
public interface ContactService {
    @objid ("4f8a0eea-e76c-45e6-b0d4-e43b049358f2")
    Contact getContactByOrderId(final int id_order);

    @objid ("92c5279d-9e43-4c4b-97a4-98824d9ce91d")
    Contact addContactByOrderId(final int id_order, final Contact new_contact);

    @objid ("24a9cc49-32cf-40b8-8b3e-a41869a83405")
    Contact updateContactByOrderId(final int id_order, final OrderVM newContact);

}
