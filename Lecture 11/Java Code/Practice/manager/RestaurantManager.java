package manager;

import models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    static List<Restaurant> restaurantList = new ArrayList<>();
    private static RestaurantManager instance = null;

    private RestaurantManager() {
        // private constructor
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurantList.add(r);
    }


    public static List<Restaurant> searchByLocation(String search){
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant r : restaurantList) {
            String rl = r.getLocation().toLowerCase();
            if(rl.equals(search)){
                result.add(r);
            }
        }
        return result;
    }
}