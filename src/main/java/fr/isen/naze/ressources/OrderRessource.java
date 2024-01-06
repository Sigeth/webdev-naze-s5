package fr.isen.naze.ressources;

import fr.isen.naze.models.Contact;
import fr.isen.naze.models.OrderVM;
import fr.isen.naze.services.impl.OrderServiceImpl;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/order")
@Produces(MediaType.APPLICATION_JSON)
public class OrderRessource {
    @Inject
    OrderServiceImpl orderService;
    public OrderRessource() {
        this.orderService = new OrderServiceImpl();
    }

    @Path("/{orderID}")
    @GET
    public OrderVM getOrderById(final int orderID) {
        return this.orderService.getOrderById(orderID);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public OrderVM addOrder(OrderVM newOrder) {
      return this.orderService.addOrder(newOrder);
    }

    @Path("/{orderID}")
    @PUT
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public OrderVM updateOrderById(int orderID, OrderVM newOrder) {
        return this.orderService.updateOrderById(orderID, newOrder);
    }

    @Path("/{orderID}/contact")
    @GET
    public Contact getContactByOrderId(final int orderID) {
        return this.orderService.getContactByOrderId(orderID);
    }

    @Path("/{orderID}/contact")
    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Contact addContactByOrderId(final int orderID, Contact newContact) {
        return this.orderService.addContactByOrderId(orderID, newContact);
    }

    @Path("/{orderID}/contact")
    @PUT
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Contact updateContactByOrderId(final int orderID, Contact newContact) {
        return this.orderService.updateContactByOrderId(orderID, newContact);
    }
}
