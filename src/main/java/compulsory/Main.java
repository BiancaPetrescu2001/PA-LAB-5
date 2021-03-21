package compulsory;

import compulsory.catalog.Catalog;
import compulsory.catalog.CatalogUtil;
import compulsory.catalog.InvalidCatalogException;
import compulsory.items.Image;
import compulsory.items.InvalidItemException;
import compulsory.items.Song;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String args[]) throws IOException, InvalidCatalogException, InvalidItemException {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    /**
     * a function that creates and saves the catalog
     * @throws IOException
     * @throws InvalidItemException
     */
    private void testCreateSave() throws IOException, InvalidItemException {
        Catalog catalog =
                new Catalog("My Items", "D:\\catalog\\catalog.ser");
        Song song1 = new Song(67, "Hollywood hills", "D:\\catalog\\song1.mp3");
        song1.setSinger("Sunrise avenue");
        song1.setDurationInMinutes(3);
        Image image1 = new Image(23, "My photo", "D:\\catalog\\caption.jpg");
        image1.setDate(LocalDate.of(2020, 02, 05));
        image1.setSize(1);
        catalog.add(song1);
        catalog.add(image1);
        CatalogUtil.save(catalog);
        catalog.list();
    }

    /**
     * a function that loads, plays different items and finds items by their ID
     * @throws InvalidCatalogException
     * @throws IOException
     */
    private void testLoadView() throws InvalidCatalogException, IOException {
        Catalog catalog = CatalogUtil.load("D:\\catalog\\catalog.ser");
        CatalogUtil.play(catalog.getItems().get(1));
        System.out.println(catalog.findById(67));
    }
}
