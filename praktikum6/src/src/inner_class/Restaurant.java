package src.inner_class;

public class Restaurant {

    private String restaurantName;
    private String address;
    private String phone;

    private static int totalRestaurants = 0;

    public Restaurant(String restaurantsName, String address, String phone){

        this.restaurantName = restaurantsName;
        this.address = address;
        this.phone = phone;
        totalRestaurants++;
        System.out.println("Restaurant '" + restaurantsName + "'created!");
    }

    public void displayRestaurantInfo(){
        System.out.println("\n=== Info Restoran ===");
        System.out.println("Nama    :" + restaurantName);
        System.out.println("Alamat  :" + address);
        System.out.println( "Telepon    :" + phone);
    }

    public Order createOrder(String customerName){
        return new  Order(customerName);
    }

    public class Order {
        private String customerName;
        private String[] items;
        private int[] quantities;
        private double totalPrice;
    }

    public Order(String customerName){
        this.customerName = customerName;
        this.items = new  String[10];
        this.quantities = new int[10];
        this.totalPrice = 0.0;
    }

    public void addItem(String itemName, int quantity, double price){
        for (int i = 0; i < items.length; i++){
            if(items[i] == null){
                items[i] = itemName;
                quantities[i] = quantity;
                totalPrice += (price * quantity);
                break;
            }
        }
    }

    public void displayOder(){
        System.out.println("\n=== ORDER DETAILs ===");
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Address:" + address);
        System.out.println("Phone:" + phone);
        System.out.println("Customer:" + customerName);
        System.out.println("Total Restaurant:" + totalRestaurants);

        System.out.println("n=== Items Order ===");
        for (int i = 0; i < items.length; i++);{
            if(items[i] != null){
                System.out.println("- " + items[i] + " x" + quantities[i]);
            }
        }

        System.out.println("=================");
        System.out.println("TOTAL: Rp" + totalPrice);
        System.out.println("Thank you for ordering from" + restaurantName + "!");
    }

    public void processOrder(){
        System.out.println("\nProcessing order for" + customerName + "at" + restaurantName);
        System.out.println("Contact: " + phone);
        System.out.println("Delivery to provided address...");
    }
}