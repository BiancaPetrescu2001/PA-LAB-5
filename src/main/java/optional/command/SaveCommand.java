package optional.command;
import optional.catalog.Catalog;
import optional.items.Item;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveCommand extends Command{

    private Catalog catalog;

    public SaveCommand(Catalog catalog)
            throws IOException {
        this.catalog = catalog;
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
}
