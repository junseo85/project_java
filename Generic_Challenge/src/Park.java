public class Park extends Point {
    private double longitude;
    private double latitude;

    public Park(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    @Override
    public void render() {
        System.out.print(" as POINT "  + (longitude + ", " + latitude));
    }
}

