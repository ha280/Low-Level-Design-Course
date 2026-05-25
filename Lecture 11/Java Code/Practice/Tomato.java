import manager.RestaurantManager;
import models.MenuItem;
import models.Restaurant;

public class Tomato {

    public Tomato(){
        initialize();
    }

    public static void initialize() {
        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.addMenuItem(new MenuItem( "Chole Bhature", 120));
        restaurant1.addMenuItem(new MenuItem( "Samosa", 15));

        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.addMenuItem(new MenuItem( "Raj Kachori", 80));
        restaurant2.addMenuItem(new MenuItem( "Pav Bhaji", 100));
        restaurant2.addMenuItem(new MenuItem( "Dhokla", 50));

        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Chennai");
        restaurant3.addMenuItem(new MenuItem( "Masala Dosa", 90));
        restaurant3.addMenuItem(new MenuItem( "Idli Vada", 60));
        restaurant3.addMenuItem(new MenuItem( "Filter Coffee", 30));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }
}