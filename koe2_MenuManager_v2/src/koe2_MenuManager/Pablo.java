package koe2_MenuManager;

import java.util.Scanner;
import java.io.*;

public class Pablo {
    public static double convert(double lat1, double lat2, double lng1, double lng2) {
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(lat2-lat1);
        double dLng = Math.toRadians(lng2-lng1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +  Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        float dist = (float) (earthRadius * c);

        return dist;
    }

    public static void main(String[] args) {
        File file;

        try {
        file = new File("pablo.dat");
        Scanner scan = new Scanner(file);
        int size = scan.nextInt();

        while (scan.hasNextDouble()) {
            double lat1 = scan.nextDouble();
            double lng1 = scan.nextDouble();
            double lat2 = scan.nextDouble();
            double lng2 = scan.nextDouble();

            double meters = convert(lat1, lat2, lng1, lng2);

            System.out.println("The distance between (" + lat1 + ", " + lng1 + ") and (" + lat2 + ", " + lng2 + ") is " + (int) (meters + 0.5) + " meters.");
        } 
        scan.close();
            
        } catch (Exception a) {
            
        }
    }
}