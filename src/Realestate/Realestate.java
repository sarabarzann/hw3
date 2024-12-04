
package Realestate;
import java.util.Scanner;
public class Realestate {
    private Property [] properties;
    private int count=0;
      public Realestate() {
        properties = new Property[100];
      
    }
          public void addProperty(Property property) {
        if (count < 100) {
            properties[count++] = property;
        } else {
            System.out.println("Property limit reached.");
        }
    }
    public void removeproperty(){
          Scanner scanner = new Scanner(System.in);
           System.out.print("Enter Property Index to Remove: ");
                int index = scanner.nextInt();
       if (index >= 0 && index < count) {
        for (int i = index; i < count - 1; i++) {
            properties[i] = properties[i + 1];
        }
        properties[--count] = null;
    } else {
        System.out.println("Invalid index.");
    }
    }
   
   public void displayProperties() {
    for (int i = 0; i < count; i++) {
        if (properties[i] != null) {
            properties[i].display(); 
            System.out.println();  
        }
    }
}
    }




    

