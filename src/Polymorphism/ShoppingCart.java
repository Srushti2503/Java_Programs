package Polymorphism;

public class ShoppingCart {

    void AddItem(String itemName){
        System.out.println(itemName +" "+ "Added to the cart..");
    }

    void AddItem(String itemName,int quantity){
        System.out.println(quantity +" "+ itemName+"s added to the cart..");
    }

    void AddItem(String itemName,int quantity,double price){
        double totalCost=quantity*price;
        System.out.println(quantity+" "+ itemName+"added to the cart. Total Price:"+totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart sc= new ShoppingCart();
        sc.AddItem("T-Shirt");
        sc.AddItem("Shoes " ,2);
        sc.AddItem("Sunglasses",3,99.99);
    }
}
