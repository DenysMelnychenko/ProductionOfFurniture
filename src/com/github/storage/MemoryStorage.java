package com.github.storage;

import com.github.model.Furniture;

import java.util.ArrayList;

/**
 * Created by aspir on 08.11.2016.
 */
public class MemoryStorage {
    ArrayList<Furniture> holder = new ArrayList<>();

    public void add() {
        Furniture furniture = new Furniture("Furniture", "Wood");
        holder.add(furniture);
    }

    public Furniture read(int id) {   // getAll - всю коллекцию
        Furniture result = null;
        for (Furniture furniture : holder) {
            if (furniture.getId() == id) {
                result = furniture;
            }
        }
        return result;
    }

    public Furniture read(String name) {
        Furniture result = null;
        for (Furniture furniture : holder) {
            if (furniture.getTypeOfProduct() == name) {
                result = furniture;
            }
        }
        return result;
    }

    public void print() {
        for (Furniture furniture : holder) {
            System.out.println(furniture.toString());
        }
    }

    public void changeName(int id, String newName) {

        Furniture oldName = holder.get(id);

        oldName.setTypeOfProduct(newName);

    }

    public void deleteById(int id) {
        for (Furniture furniture : holder) {
            if (furniture.getId() == id) {
                holder.remove(id);
            }
        }
    }
}
