package com.github.model; /**
 * Created by aspir on 04.11.2016.
 */

import com.github.model.Furniture;

import java.util.*;

public class Order {
   private ArrayList<Furniture> products = new ArrayList<>();

    public void add(Furniture product) {

        products.add(product);
    }

    public int get(int id) {
        return products.get(id).getId();
    }

    public void set(Furniture product) {
        products.set((int) product.getId(), product);
    }
    public void changeName(int id, String newName) {
        Furniture oldName  = products.get(id);
        oldName.setTypeOfProduct(newName);
    }

    public void printOrder() {
        for (Furniture product : products) {
            System.out.println(product.getTypeOfProduct());
        }
    }
}
