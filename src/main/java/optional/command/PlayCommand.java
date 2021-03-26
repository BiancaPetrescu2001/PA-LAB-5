package optional.command;

import optional.items.Item;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * the class representing the command play
 */
public class PlayCommand extends Command{
    private Item item;

    public PlayCommand(Item item) throws IOException {
        this.item = item;
        Desktop desktop = Desktop.getDesktop();
        File catalogFile = new File(item.getLocation());
        desktop.open(catalogFile);
    }
}
