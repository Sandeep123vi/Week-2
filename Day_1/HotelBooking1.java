public class HotelBooking1 {
    public static void main(String[] args) {
        // create an object for HotelBooking class for calling of default constructor
        HotelBooking hotel = new HotelBooking();
        // create an object for HotelBooking class for calling of parameterized
        // constructor
        HotelBooking hotel2 = new HotelBooking("Pranav", "Non-Ac", 2);
        // create an object for HotelBooking class for calling of copy constructor
        HotelBooking hotel3 = new HotelBooking(hotel);
        System.out.println("The guest name is:" + hotel3.guestName);
        System.out.println("The room type is:" + hotel3.roomType);
        System.out.println("The nights are:" + hotel3.nights);
    }
}

class HotelBooking { // Attributes
     String guestName;
     String roomType;
     int nights;
    // create a Default constructor
    public HotelBooking() {
        guestName = "Sandeep";
        roomType = "With Ac";
        nights = 2;
        System.out.println("This is default constructor calling..");
        System.out.println("guestname is :" + guestName);
        System.out.println("Room type is :" + roomType);
        System.out.println("nights are :" + nights);
    }

    // create a parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("This is parameterized constructor calling..");
        System.out.println("guest name is :" + guestName);
        System.out.println("roomtype is :" + roomType);
        System.out.println("nights   are :" + nights);

    }

    // create a copy constructor
    public HotelBooking(HotelBooking hotel1) {
        this.guestName = hotel1.guestName;
        this.roomType = hotel1.roomType;
        this.nights = hotel1.nights;
        System.out.println("This is Copy constructor calling..");

    }

}
