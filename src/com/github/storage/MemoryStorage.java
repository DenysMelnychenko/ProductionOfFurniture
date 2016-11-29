package com.github.storage;

import com.github.model.Furniture;
import java.util.List;
import java.util.ArrayList;

public class MemoryStorage {

    private static List<Furniture> holder = new ArrayList<>();

    public static void add(Furniture furniture) {
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

    public static Furniture getByName(String name) {
        Furniture result = null;
        for (Furniture furniture : holder) {
            if (furniture.getTypeOfProduct().equals(name)) {
                result = furniture;
            }
        }
        return result;
    }

    public static List<Furniture> getAll() {

        return holder;
    }

    public static void changeTypeById(int id, String newName) {

        for (Furniture fur : holder) {
            if (fur.getId() == id) {
                fur.setTypeOfMaterial(newName);
            }
        }
    }

    public static void deleteById(int id) {

        for (Furniture furniture : holder) {
            if (furniture.getId() == id) {
                holder.remove(furniture);
            }
        }
    }
}
