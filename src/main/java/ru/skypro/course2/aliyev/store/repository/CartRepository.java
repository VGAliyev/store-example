package ru.skypro.course2.aliyev.store.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Repository
@SessionScope
public class CartRepository {
    Set<Integer> itemList = new HashSet<>();

    public void create(Integer... items) {
        Collections.addAll(itemList, items);
    }

    public Set<Integer> readAll() {
        return itemList;
    }
}
