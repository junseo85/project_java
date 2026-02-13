public class River extends Line{
    private double longitude;
    private double latitude;

    public River(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    @Override
    public void render() {
        System.out.print(" as LINE "  + (longitude + ", " + latitude));
    }
}
