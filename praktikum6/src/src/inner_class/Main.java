package src.inner_class;

public class Main {

    public static void  main(String[] args) {
        System.out.println("=== RESTAURANT ORDER SYSTEM ===");

        Restaurant pizzaHut= new  Restaurant("Pizza Hut", "Jl. Sudirman No.123","021-555-1234");
        Restaurant KFC = new Restaurant("KFC","Jl. Thamrin No.456","021-555-5678");
    
    pizzaHut.displayRestaurantInfo();
    KFC.displayRestaurantInfo();

    Restaurant.Order order1 = pizzaHut.createOrder("Rina");  
    }
} 