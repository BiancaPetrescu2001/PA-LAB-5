package optional.command;

import optional.catalog.Catalog;
import optional.items.Item;

import java.util.ArrayList;

public class AddCommand extends Command{
    private Catalog catalog;
    private Item item;

    public AddCommand(Catalog catalog, Item item) {
        this.catalog = catalog;
        this.item = item;
        ArrayList<Item> items = new ArrayList<>();
        items = catalog.getItems();
        items.add(item);
        catalog.setItems(items);
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
