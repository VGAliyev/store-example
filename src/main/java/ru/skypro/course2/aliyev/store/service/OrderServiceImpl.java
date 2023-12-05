package ru.skypro.course2.aliyev.store.service;

import org.springframework.stereotype.Service;
import ru.skypro.course2.aliyev.store.repository.CartRepository;

import java.util.List;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService{
    private final CartRepository cartRepository;

    public OrderServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public void add(Integer... items) {
        cartRepository.create(items);
    }

    @Override
    public Set<Integer> get() {
        return cartRepository.readAll();
    }
}
