public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int totalCost;
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays*1000;
    }
    public void display(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Car Model: "+carModel);
        System.out.println("Rental Days: "+rentalDays);
        System.out.println("Total cost fo rent: "+totalCost);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Mohit", "Etios", 5);
        c.display();
    }
}
