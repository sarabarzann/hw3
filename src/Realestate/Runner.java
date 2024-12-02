
package Realestate;

import java.util.Scanner;
public class Runner {
    
 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Realestate realestate = new Realestate();
       
        while (true) {
         
            
            System.out.println("1. Add Property");
            System.out.println("2. Remove Property");
            System.out.println("3. Display Properties");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
          
                System.out.println("Choose Property Type:");
                System.out.println("1. Villa");
                System.out.println("2. Apartment");
                System.out.println("3. Furnished Apartment");
                System.out.print("Enter choice: ");
                int type = scanner.nextInt();

                System.out.print("Enter Area: ");
                double area = scanner.nextDouble();
                System.out.print("Enter Number of Rooms: ");
                int nofrooms = scanner.nextInt();
                System.out.print("Enter Neighborhood: ");
      
                String neighborhood = scanner.next();
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();

                if (type == 1) { 
                    System.out.print("Has Swimming Pool (true/false): ");
                    boolean swimming_pool = scanner.nextBoolean();
                    System.out.print("Enter Number of Adjacent Streets: ");
                    int adjacent_streets = scanner.nextInt();
                    realestate.addProperty(new Villa(swimming_pool, adjacent_streets, area, nofrooms, neighborhood, price));

                } else if (type == 2) { 
                    System.out.print("Enter Floor Number: ");
                    int floor = scanner.nextInt();
                    System.out.print("Has Parking Lot (true/false): ");
                    boolean parking_lot = scanner.nextBoolean();
                    realestate.addProperty(new Apartment(floor, parking_lot, area, nofrooms, neighborhood, price));

                } else if (type == 3) { 
                    System.out.print("Enter Floor Number: ");
                    int floor = scanner.nextInt();
                    System.out.print("Has Parking Lot (true/false): ");
                    boolean parking_lot = scanner.nextBoolean();
                    System.out.print("Enter Furniture Quality (1 to 5): ");
                    int furniture_quality = scanner.nextInt();
                   
                    realestate.addProperty(new Furnishedapartment(furniture_quality, floor, parking_lot, area, nofrooms, neighborhood, price));

                } else {
                    System.out.println("Invalid Property Type.");
                }

            } else if (choice == 2) {
               
                System.out.print("Enter Property Index to Remove: ");
                int index = scanner.nextInt();
                realestate.removeproperty(index);

            } else if (choice == 3) {
          
                realestate.displayProperties();

            } else if (choice == 4) {
          
                System.out.println("You have exited the program!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        
    }
}

    

