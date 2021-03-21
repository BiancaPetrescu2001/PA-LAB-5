package compulsory.items;

public class Song extends Item {
    private int durationInMinutes;
    private String singer;

    public Song(int id, String name, String location) {
        super(id, name, location);
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     *
     * @param durationInMinutes : the length in minutes of a song
     * @throws InvalidItemException : songs in the catalog can not be longer than 25 minutes
     */
    public void setDurationInMinutes(int durationInMinutes) throws InvalidItemException {
        if (durationInMinutes >= 25) {
            throw new InvalidItemException("Cantecul e prea lung!");
        } else {
            this.durationInMinutes = durationInMinutes;
        }
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
