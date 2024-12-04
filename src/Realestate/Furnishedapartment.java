
package Realestate;
import java.util.Scanner;
public class Furnishedapartment extends Apartment {
    private int Furniture_quality;
  public Furnishedapartment() {
        super();
    }
    public Furnishedapartment(int Furniture_quality, int floor, boolean parking_lot, double area, int nofrooms, String neighborhood, double price) {
        super(floor, parking_lot, area, nofrooms, neighborhood, price);
        this.Furniture_quality = Furniture_quality;
    }
      @Override
 public void input(){
     super.input();
          Scanner scanner = new Scanner(System.in);
       System.out.print("Enter Furniture Quality (1 to 5): ");
                  this.Furniture_quality   = scanner.nextInt();
                    
 }
    
       @Override
    public void display(){
             System.out.println("Type of property: Furnished apartment\n-----------------------------");
        super.display();
      
        switch(Furniture_quality){
            case 1:
                System.out.println("The furniture quality is the Best!");
                break;
            case 2:
                 System.out.println("The furniture quality is high medium!");
                 break;
            case 3:
                 System.out.println("The furniture quality is medium!");
                 break;
            case 4:
                 System.out.println("The furniture quality is low medium!");
                 break;
            case 5:
                 System.out.println("The furniture quality is the worst!");
                 break;
                 default:
            System.out.println("Invalid!");
            break; 
                 
                
        }
            
    }
    
}
