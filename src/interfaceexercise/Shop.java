
package interfaceexercise;


public class Shop {


    public static void main(String[] args) {
      Book book1 = new Book("Chinmayee", "novel", 500, "Horror story");
      book1.showInfo();
      
      Cloth cloth1 = new Cloth(36,"Kurti", 400,"It is a cotton kurti");
      cloth1.showInfo();
      
      Grocery grocery1 = new Grocery(45, "Wheat flour", 56, "It is a flour");
      grocery1.showInfo();
      
      
        System.out.println("Price is:"+book1.price);
        System.out.println("Shipping cost for book "+book1.name+" is: "+book1.calculateCost(5));
        System.out.println("Shipping cost for cloth "+cloth1.name+" is:"+cloth1.calculateCost(4));
        System.out.println("Total cost for cloth is: "+ (cloth1.price+cloth1.calculateCost(4)));
        System.out.println("total book cost is:"+(book1.price+book1.calculateCost(5)));
      
    }
    
}
