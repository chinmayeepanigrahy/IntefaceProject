
package interfaceexercise;

class  Goods {
    String name;
    double price;
    String description;
//  here it is showing inheritance not polymorphism.in inheritance sub classes can use super class method or if they want they can use own implementations and method   
    public  void showInfo(){
      
        System.out.println("Name:"+name+"Price:"+price+"Description:"+description);
        
    }

    public Goods(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

}