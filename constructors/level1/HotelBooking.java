public class HotelBooking {
    String guestName;
    String roomType; 
    int nights;

    public HotelBooking() {
        this.guestName = "unknown";
        this.roomType = "unknown";
        this.nights = 0;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    
    public HotelBooking(HotelBooking hotel){
       this.guestName=hotel.guestName;
       this.roomType=hotel.roomType;
       this.nights=hotel.nights;
    }
    
    public void display(){
        System.out.println("Name of guest: "+guestName);
        System.out.println("Room type: "+roomType);
        System.out.println("No. of nights: "+nights);
    }
    
    public static void main(String[] args) {
        HotelBooking d = new HotelBooking();
        System.out.println("Default Value");
        d.display();
        System.out.println("--------------------------------------");
        HotelBooking p = new HotelBooking("Mohit", "delux", 2);
        System.out.println("Guest");
        p.display();
        System.out.println("--------------------------------------");        
        HotelBooking c = new HotelBooking(p);
        System.out.println("Copied details of guest");
        c.display();
        
    }
}
