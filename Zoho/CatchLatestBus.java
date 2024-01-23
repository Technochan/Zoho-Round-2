package Zohoexc;
import java.util.Arrays;
public class CatchLatestBus {
	public class CatchLatestBus {
	    public static void main(String[] args) {
	        int[] buses = {1, 3, 5, 7, 9};
	        int[] passengers = {2, 4, 6, 8};

	        int optimalArrivalTime = findOptimalArrivalTime(buses, passengers);
	        System.out.println("Optimal Arrival Time: " + optimalArrivalTime);
	    }

	    public static int findOptimalArrivalTime(int[] buses, int[] passengers) {
	        Arrays.sort(buses);
	        Arrays.sort(passengers);

	        int n = buses.length;
	        int m = passengers.length;

	        int busPointer = n - 1;
	        int passengerPointer = m - 1;

	        while (busPointer >= 0 && passengerPointer >= 0) {
	            if (passengers[passengerPointer] > buses[busPointer]) {
	                return passengers[passengerPointer];
	            }
	            passengerPointer--;
	        }

	        // If no suitable arrival time found, return the earliest bus departure time
	        return buses[0];
	    }
	}

}
