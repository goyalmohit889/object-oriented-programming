
public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee = 100000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner name: "+ownerName);
        System.out.println("Vehicle type: "+vehicleType);
    }
    public static void updateRegistrationFee() {
        System.out.println("Registration Fee: "+registrationFee);
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Mohit", "Car");
        v.displayVehicleDetails();
        Vehicle.updateRegistrationFee();
    }

}
