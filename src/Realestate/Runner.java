
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

              
           Property property = null;
                if (type == 1) { 
                   
              property = new Villa();

                } else if (type == 2) { 
                   
             property = new Apartment();

                } else if (type == 3) { 
                    
                    property = new Furnishedapartment();
                   

                } else {
                    System.out.println("Invalid Property Type.");
                    continue;
                }
                 property.input();
                realestate.addProperty(property);
            } else if (choice == 2) {
                
                realestate.removeproperty();

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

    

