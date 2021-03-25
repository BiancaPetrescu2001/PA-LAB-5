package optional.catalog;

import optional.items.Item;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * a class that implements methods regarding the items in the catalog, such as displaying them and finding one by its id
 */
public class Catalog implements Serializable{
    private String name;
    private String path;
    private ArrayList<Item> items = new ArrayList<>();

    public Catalog(String name, String path, ArrayList<Item> items) {
        this.name = name;
        this.path = path;
        this.items = items;
    }

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public Catalog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    /**
     *
     * @param id = the id of the item to be found
     * @return returns the item || null if there is no item with the specified id
     */
    public Item findById(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }
        return null;
    }

    /**
     * displays the items in the catalog
     */
    public void list() {
        for (Item item : items)
            System.out.println(item);
    }

}
