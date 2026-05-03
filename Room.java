public class Room {
    int roomNumber;
    boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully!");
        } else {
            System.out.println("Room already booked!");
        }
    }

    public void checkout() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Room " + roomNumber + " checked out!");
        } else {
            System.out.println("Room is already empty!");
        }
    }
}
