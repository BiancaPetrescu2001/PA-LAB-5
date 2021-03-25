package optional.command;

import optional.catalog.Catalog;
import optional.items.Item;

import java.util.ArrayList;

public class ListCommand extends Command{
    private Catalog catalog;

    public ListCommand(Catalog catalog) {
        this.catalog = catalog;
        ArrayList<Item> items = new ArrayList<>();
        items = catalog.getItems();
        for (Item item : items)
            System.out.println(item);
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
