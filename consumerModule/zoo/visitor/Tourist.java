package zoo.visitor;

import module java.base;
import module zoo.tours.api;
import module zoo.tours.reservations;

public class Tourist {

    void main() {
        Tour tour = TourFinder.findSingleTour();
        IO.println("Single tour: " + tour);

        List<Tour> tours = TourFinder.findAllTours();
        IO.println("# tours: " + tours.size());
    }
}
