package ru.skypro.course2.aliyev.store.service;

import java.util.List;
import java.util.Set;

public interface OrderService {
    void add(Integer... items);
    Set<Integer> get();
}
