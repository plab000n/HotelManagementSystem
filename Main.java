import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {

        // create 5 rooms
        for (int i = 1; i <= 5; i++) {
            rooms.add(new Room(i));
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hotel Management System ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Checkout Room");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                viewRooms();
            } 
            else if (choice == 2) {
                System.out.print("Enter room number: ");
                int rn = sc.nextInt();
                rooms.get(rn - 1).bookRoom();
            } 
            else if (choice == 3) {
                System.out.print("Enter room number: ");
                int rn = sc.nextInt();
                rooms.get(rn - 1).checkout();
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }

    static void viewRooms() {
        for (Room r : rooms) {
            System.out.println("Room " + r.roomNumber + 
                " | " + (r.isBooked ? "Booked" : "Available"));
        }
    }
}
