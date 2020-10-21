
package interfaceexercise;


public class Book extends Goods  implements HasShippingCost{
    String author;

    public Book(String author,String name, double price, String description) {
        super(name, price, description);
        this.author=author;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Author:"+author);
    }

    @Override
    public double calculateCost(double distance) {
        return (distance*costPerMile);
    }
    
}
