public class Earth {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double kmToMiles = 0.621371;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMiles3);
    }
}