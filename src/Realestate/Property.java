
package Realestate;

public class Property {
    private double area;
    private int nofrooms;
    private String neighborhood;
    private double price;

    public Property(double area, int nofrooms, String neighborhood, double price) {
        this.area = area;
        this.nofrooms = nofrooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }
    public void display(){
        System.out.println("Property Area: " + area + " m2");
        System.out.println("Number of Rooms: "+nofrooms);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price: $" + price);
    }
    
    
    
   
    
    
}
