package Day08;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class fuelPassQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<fuelQueue> fuel_list = new ArrayDeque<>() {};

        while (true) {

            System.out.println("Fuel Queue");

            System.out.println("Press 1 to Add a Vehicle");
            System.out.println("Press 2 to get Highest priority Vehicle");

            String choice = sc.nextLine();

            switch (choice){
                case "1":

                    System.out.println("User Pressed 1");

                    System.out.println("Enter your vehicle id : ");
                    int vehicleId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter your priority : ");
                    int priority = Integer.parseInt(sc.nextLine());

                    fuelQueue vehicle = new fuelQueue(vehicleId , priority);
                    fuel_list.offer(vehicle);

                    break;

                case "2":

                    fuelQueue higherPriorityVehicle = fuel_list.poll();
                    if (higherPriorityVehicle != null) {
                        System.out.println("passenger Name - " + higherPriorityVehicle.ticketId + "Points - " + higherPriorityVehicle.priority);
                    }else {
                        System.out.println("No passenger in queue");
                    }

            }
        }
    }
}
