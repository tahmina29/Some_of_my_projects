package Interfaces;
import Classes.Restaurant;
import java.lang.*;

public interface RestaurantOperations
{
	boolean insertRestaurant(Restaurant r);
	boolean removeRestaurant(Restaurant r);
	Restaurant searchRestaurant(String rid);
	void showAllRestaurants();
}

