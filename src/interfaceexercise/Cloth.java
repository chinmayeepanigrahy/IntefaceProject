
package interfaceexercise;

public class  Cloth extends Goods implements HasShippingCost {
    int size;

    public Cloth( int size,String name, double price, String description) {
        super(name, price, description);
        this.size=size;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Size:"+size);
       
    }
   
 

    @Override
    public double calculateCost(double distance) {
       return (distance*costPerMile/2);
    }
    
}
