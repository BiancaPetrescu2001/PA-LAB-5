package optional.command;
import optional.catalog.Catalog;
import optional.catalog.InvalidCatalogException;
import optional.items.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadCommand {
    public static Catalog read() throws IOException, InvalidCommandSpecificationException, InvalidCatalogException{
        {
            System.out.println("Enter command: ");
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String command = reader.readLine();
            return execute(command);
        }
    }
    public static Catalog execute(String command) throws InvalidCommandSpecificationException, IOException, InvalidCatalogException {
        if(command.equalsIgnoreCase("ADD"))
        {
            System.out.println("Enter catalog ID: ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String catalogID = reader.readLine();
            int ID=Integer.parseInt(catalogID);
            Catalog catalog=Catalog.listOfCatalogs.get(ID);
            System.out.println("Enter item ID: ");
            BufferedReader reader2 = new BufferedReader(
                    new InputStreamReader(System.in));
            String itemID = reader.readLine();
            int IDofItem=Integer.parseInt(itemID);
            Item item = Item.listOfAllItems.get(IDofItem);
            AddCommand letsAdd = new AddCommand(catalog, item);
            System.out.println("S-a executat comanda");
        }
        else if(command.equalsIgnoreCase("save"))
        {
            System.out.println("Enter catalog ID: ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String catalogID = reader.readLine();
            int ID=Integer.parseInt(catalogID);
            Catalog catalog=Catalog.listOfCatalogs.get(ID);
            SaveCommand letsSave = new SaveCommand(catalog);
            System.out.println("S-a executat comanda");
        }
        else if(command.equalsIgnoreCase("list"))
        {
            System.out.println("Enter catalog ID: ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String catalogID = reader.readLine();
            int ID=Integer.parseInt(catalogID);
            Catalog catalog=Catalog.listOfCatalogs.get(ID);
            ListCommand letsList = new ListCommand(catalog);
            System.out.println("S-a executat comanda");
        }
        else if(command.equalsIgnoreCase("load"))
        {
            System.out.println("Enter catalog path: ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String catalogPath = reader.readLine();
            LoadCommand firstLoad = new LoadCommand();
            Catalog catalog = firstLoad.LoadCatalog(catalogPath);
            System.out.println("S-a executat comanda");
            return catalog;
        }
        else if(command.equalsIgnoreCase("play"))
        {
            System.out.println("Enter item ID: ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String itemID = reader.readLine();
            int IDofItem=Integer.parseInt(itemID);
            Item item = Item.listOfAllItems.get(IDofItem);
            PlayCommand letsPlay = new PlayCommand(item);
            System.out.println("S-a executat comanda");
        }
        else{
            throw new InvalidCommandSpecificationException("No such command exists");
        }
        return null;
    }
}
