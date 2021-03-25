package optional.command;


import java.io.Serializable;
import java.util.ArrayList;

public abstract class Command implements Serializable {
    protected String name;

    public Command() {
    }

    public Command(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
