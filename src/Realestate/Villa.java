
package Realestate;

public class Villa extends Property {
    
    private boolean swimming_pool;
    private int adjacent_streets;

    public Villa(boolean swimming_pool, int adjacent_streets, double area, int nofrooms, String neighborhood, double price) {
        super(area, nofrooms, neighborhood, price);
        this.swimming_pool = swimming_pool;
        this.adjacent_streets = adjacent_streets;
    }

     
  @Override
    public void display() {
        super.display();
        System.out.println("Has Swimming Pool: " +swimming_pool );
        System.out.println("Adjacent Streets: " + adjacent_streets);

    
    }
}

