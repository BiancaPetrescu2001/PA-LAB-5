package optional.items;

import java.time.LocalDate;

public class Image extends Item {
    private LocalDate date;
    private int size;

    public Image(int id, String name, String location) {
        super(id, name, location);
    }

    public LocalDate getDate() {
        return date;
    }

    /**
     *
     * @param date : the date the photo was taken
     * @throws InvalidItemException : a photo can not be taken in the future
     */
    public void setDate(LocalDate date) throws InvalidItemException {
        if (date.getYear() > 2021) {
            throw new InvalidItemException("Poza nu poate fi facuta in viitor!");
        } else {

            this.date = date;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
