
package Realestate;

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
    public void removeproperty(int index){
    if (index >= 0 && index < count){
        properties[index] = null;
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




    

