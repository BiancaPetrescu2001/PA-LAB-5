package compulsory.catalog;

import compulsory.items.Item;

import java.io.*;
import java.awt.*;

/**
 * this class implements 3 useful methods:
 * save - saves the catalog to an external file
 * load - loads the catalog from an external file
 * play - shows/displays/plays the items in the catalog
 */
public class CatalogUtil {
    public static void save(Catalog itemList)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(itemList.getPath()))) {
            oos.writeObject(itemList);
        }
    }

    public static Catalog load(String path) throws InvalidCatalogException {
        try {
            FileInputStream fi = new FileInputStream(new File(path));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Catalog catalog = (Catalog) oi.readObject();
            oi.close();
            fi.close();
            return catalog;
        } catch (FileNotFoundException e) {
            throw new InvalidCatalogException(e);
        } catch (IOException e) {
            throw new InvalidCatalogException(e);
        } catch (ClassNotFoundException e) {
            throw new InvalidCatalogException(e);
        }

    }

    public static void play(Item item) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File catalogFile = new File(item.getLocation());
        desktop.open(catalogFile);
    }
}
