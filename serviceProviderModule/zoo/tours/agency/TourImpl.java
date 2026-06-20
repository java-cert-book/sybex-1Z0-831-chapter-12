package zoo.tours.agency;

import module zoo.tours.api;

public class TourImpl implements Tour {

    public String name() {
        return "Behind the Scenes";
    }
    public int length() {
        return 120;
    }
    public Souvenir getSouvenir() {
        return new Souvenir("stuffed animal");
    }
}
