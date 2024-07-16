package com.labs.spring.rest.controller;

import com.labs.spring.rest.model.Order;
import com.labs.spring.rest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    // CREATE       POST /orders
    // LIST ALL     GET /orders
    // VIEW         GET /orders/{id}
    // UPDATE       PUT /orders/{id}
    // DELETE       DELETE /orders/{id}


    @PostMapping(path="/orders")
    public ResponseEntity<String> create(@RequestBody Order order) throws URISyntaxException {
        int id = orderService.create(order);

        if(id > 0) {
            URI uri = new URI("http://localhost:8080/order-rest-api/orders/" + id);
            return ResponseEntity.created(uri).body("Order created successfully");
        } else {
            return ResponseEntity.internalServerError().body("Order creation failed.");
        }

    }

    @GetMapping(path="/orders")
    public Collection<Order> getAll() {
        return orderService.viewAll();
    }

    @GetMapping(path="/orders/{id}")
    public Order get(@PathVariable int id) {
        return orderService.view(id);
    }
    
    @PutMapping(path="/orders/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Order order) {
        boolean flag = orderService.update(id, order);
        String msg = flag ? "Order updated successfully" : "Order updation failed";

        return ResponseEntity.ok(msg);
    }

    @DeleteMapping(path="/orders/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        boolean flag = orderService.delete(id);
        String msg = flag ? "Order deleted successfully" : "Order deletion failed";

        return  ResponseEntity.ok(msg);
    }

}
