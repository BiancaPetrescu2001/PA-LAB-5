package compulsory.items;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

public abstract class Item implements Serializable {
    protected int id;
    protected String name;
    protected String location;

    public Item(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    public Item(String name, String path) throws InvalidItemException {
        try {
            FileInputStream fi = new FileInputStream(path);
            this.name = name;
            this.location = path;
        } catch (FileNotFoundException e) {
            throw new InvalidItemException("The path does not exist!");
        }
    }
}
