
package Realestate;
import java.util.Scanner;
public class Property {
    private double area;
    private int nofrooms;
    private String neighborhood;
    private double price;
     public Property() {
    }

    public Property(double area, int nofrooms, String neighborhood, double price) {
        this.area = area;
        this.nofrooms = nofrooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }
    
     public void input(){
            Scanner scanner = new Scanner(System.in);
          
            
                System.out.print("Enter Area: ");
                this.area= scanner.nextDouble();
                System.out.print("Enter Number of Rooms: ");
               this.nofrooms = scanner.nextInt();
                System.out.print("Enter Neighborhood: ");
      
             this.neighborhood= scanner.next();
                System.out.print("Enter Price: ");
                 this.price = scanner.nextDouble();
    }
    public void display(){
        
        System.out.println("Property Area: " + area + " m2");
        System.out.println("Number of Rooms: "+nofrooms);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price: $" + price);
    }
    
    
    
   
    
    
}
