
package Realestate;
import java.util.Scanner;
public class Apartment extends Property {
    private int floor;
    private boolean parking_lot;
    public Apartment(){
           super();
    }
   
    public Apartment(int floor, boolean parking_lot, double area, int nofrooms, String neighborhood, double price) {
        super(area, nofrooms, neighborhood, price);
        this.floor = floor;
        this.parking_lot = parking_lot;
    }
      @Override
    public void input(){
         super.input();
         Scanner scanner = new Scanner(System.in);
                            System.out.print("Enter Floor Number: ");
                 this.floor = scanner.nextInt();
                    System.out.print("Has Parking Lot (true/false): ");
                   this.parking_lot= scanner.nextBoolean();
                    
    }
    @Override
    public void display(){
             System.out.println("Type of property: Apartment\n-----------------------------");
        super.display();
        System.out.println("Floor: " + floor);
        System.out.println("Has Parking: " +parking_lot);
    }

   
    
}
