package com.github.storage;

import com.github.model.Furniture;
import java.util.List;
import java.util.ArrayList;

public class MemoryStorage {

    private List<Furniture> holder = new ArrayList<>();

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

    public List<Furniture> getAll() {

        return this.holder;
    }

    public void changeTypeById(int id, String newName) {

        for (Furniture fur : holder) {
            if (fur.getId() == id) {
                fur.setTypeOfMaterial(newName);
            }
        }
    }

    public void deleteById(int id) {

        for (Furniture furniture : holder) {
            if (furniture.getId() == id) {
                holder.remove(furniture);
            }
        }
    }
}
