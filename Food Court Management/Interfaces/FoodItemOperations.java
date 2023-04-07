package Interfaces;
import java.lang.*;
import Classes.FoodItem;

public interface FoodItemOperations
{
	boolean insertFoodItem(FoodItem f);
	boolean removeFoodItem(FoodItem f);
	FoodItem searchFoodItem(String fid);
	void showAllFoodItems();
}

