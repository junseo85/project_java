package lpa;

public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.0722, -112.0840"),
                new Park("Yosemite", "37.8333, -119.5833")

        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi", "41.7000, -93.0900", "45.7500, -100.5000", "40.7128, -74.0060"),
                new River("Missouri", "47.5981, -101.9986", "40.7128, -74.0060"),

        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colorado", "39.7392, -104.9903", "39.7392, -104.9903", "39.7392, -104.9903"),
                new River("Delaware", "39.7392, -75.5000", "39.7392, -75.5000", "39.7392, -75.5000")
        );
        riverLayer.renderLayer();
    }
}
