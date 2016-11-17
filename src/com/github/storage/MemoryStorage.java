package com.github.storage;

import com.github.model.Furniture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aspir on 08.11.2016.
 */
public class MemoryStorage {
    private ArrayList<Furniture> holder = new ArrayList<>();

    public void add(Furniture furniture) {
        holder.add(furniture);
    }

    public Furniture getById(int id) {
        Furniture result = null;
        for (Furniture furniture : holder) {
            if (furniture.getId() == id) {
                result = furniture;
            }
        }
        return result;
    }

    public Furniture getByName(String name) {
        Furniture result = null;
        for (Furniture furniture : holder) {
            if (furniture.getTypeOfProduct().equals(name)) {
                result = furniture;
            }
        }
        return result;
    }

    public ArrayList<Furniture> getAll() {
        return new ArrayList<Furniture>(holder);

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
