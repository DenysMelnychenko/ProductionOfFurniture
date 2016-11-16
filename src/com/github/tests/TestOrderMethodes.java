package com.github.tests;

import com.github.model.Furniture;
import com.github.model.Order;
import com.github.views.Menu;

/**
 * Created by aspir on 06.11.2016.
 */


public class TestOrderMethodes {
    public static void main(String[] args) {
        Order order = new Order();
        Menu menu = new Menu();
        menu.showMainMenu();
        Furniture table = new Furniture("table");
        for (int i = 0; i < 5; i++) {
            order.add(table);
        }


        order.printOrder();
    }
}
