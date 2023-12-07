package ru.skypro.course2.aliyev.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.course2.aliyev.store.service.OrderService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("add")
    public void add(@RequestParam Integer... items) {
        orderService.add(items);
    }

    @RequestMapping("get")
    public Set<Integer> get() {
        return orderService.get();
    }
}
