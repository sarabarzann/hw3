
package Realestate;
import java.util.Scanner;
public class Villa extends Property {
    
    private boolean swimming_pool;
    private int adjacent_streets;
  public Villa() {
        super();
    }
    public Villa(boolean swimming_pool, int adjacent_streets, double area, int nofrooms, String neighborhood, double price) {
        super(area, nofrooms, neighborhood, price);
        this.swimming_pool = swimming_pool;
        this.adjacent_streets = adjacent_streets;
    }
      @Override
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
           System.out.print("Has Swimming Pool (true/false): ");
                       this.swimming_pool = scanner.nextBoolean();
                    System.out.print("Enter Number of Adjacent Streets: ");
                        this.adjacent_streets = scanner.nextInt();
    }

     
  @Override
    public void display() {
             System.out.println("Type of property: Villa\n-----------------------------");
        super.display();
        System.out.println("Has Swimming Pool: " +swimming_pool );
        System.out.println("Adjacent Streets: " + adjacent_streets);

    
    }
}

