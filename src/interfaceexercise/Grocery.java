
package interfaceexercise;

public class Grocery extends Goods {
double weight;

    public Grocery( double weight,String name, double price, String description) {
        super(name, price, description);
        this.weight=weight;
    }

    @Override
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Weight:"+weight);
    }
  
}
