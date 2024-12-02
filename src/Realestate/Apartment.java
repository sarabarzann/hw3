
package Realestate;

public class Apartment extends Property {
    private int floor;
    private boolean parking_lot;

    public Apartment(int floor, boolean parking_lot, double area, int nofrooms, String neighborhood, double price) {
        super(area, nofrooms, neighborhood, price);
        this.floor = floor;
        this.parking_lot = parking_lot;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Floor: " + floor);
        System.out.println("Has Parking: " +parking_lot);
    }

   
    
}
