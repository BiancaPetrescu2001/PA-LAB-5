package optional;

import freemarker.template.TemplateException;
import optional.catalog.Catalog;
import optional.catalog.CatalogUtil;
import optional.catalog.InvalidCatalogException;
import optional.command.*;
import optional.items.Image;
import optional.items.InvalidItemException;
import optional.items.Song;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String args[]) throws IOException, InvalidCatalogException, InvalidItemException, InvalidCommandSpecificationException, TemplateException {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    /**
     * a function that creates and saves the catalog
     *
     * @throws IOException
     * @throws InvalidItemException
     */
    private void testCreateSave() throws IOException, InvalidItemException, InvalidCommandSpecificationException, InvalidCatalogException {
        Catalog catalog =
                new Catalog("My Items", "D:\\catalog\\catalog.ser");
        Song song1 = new Song(67, "Hollywood hills", "D:\\catalog\\song1.mp3");
        song1.setSinger("Sunrise avenue");
        song1.setDurationInMinutes(3);
        Image image1 = new Image(23, "My photo", "D:\\catalog\\caption.jpg");
        image1.setDate(LocalDate.of(2020, 02, 05));
        image1.setSize(1);
        ReadCommand.read();
        ReadCommand.read();
        //AddCommand firstAdd = new AddCommand(catalog,song1);
        //AddCommand secondAdd = new AddCommand(catalog,image1);
        ReadCommand.read();
        //SaveCommand firstSave = new SaveCommand(catalog);
        ReadCommand.read();
        //ListCommand firstList = new ListCommand(catalog);
    }

    /**
     * a function that loads, plays different items and finds items by their ID
     *
     * @throws InvalidCatalogException
     * @throws IOException
     */
    private void testLoadView() throws InvalidCatalogException, IOException, InvalidCommandSpecificationException, TemplateException {
        Catalog catalog = ReadCommand.read();
        ReadCommand.read();
        //PlayCommand firstplay = new PlayCommand(catalog.getItems().get(1));
        System.out.println(catalog.findById(67));
        ReportCommand.configureFreeMarker();
        ReportCommand letsReport = new ReportCommand();
        letsReport.run();
    }
}
