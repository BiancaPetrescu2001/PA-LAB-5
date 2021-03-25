package optional.command;

import optional.catalog.Catalog;
import optional.catalog.InvalidCatalogException;

import java.io.*;

public class LoadCommand extends Command{
    private String path;

    public LoadCommand() {
    }

    public LoadCommand(String path) throws InvalidCatalogException {
        this.path = path;
        LoadCatalog(path);
    }
    public Catalog LoadCatalog(String path) throws InvalidCatalogException{
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
}
