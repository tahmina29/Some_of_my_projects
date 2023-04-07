package Classes;
import java.lang.*;
import Interfaces.*;


public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
	private FoodItem fooditems[] = new FoodItem [10];
	
	public void setName(String name){this.name = name;}
	public void setRid(String rid){this.rid = rid;}

	
	public String getName(){return name;}
	public String getRid(){return rid;}
	
public boolean insertFoodItem(FoodItem f1)
	{
		boolean flag = false;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = f1;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeFoodItem(FoodItem f1)
	{
		boolean flag = false;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == f1)
			{
				fooditems[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllFoodItems()
	{
		for(int i =0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				fooditems[i].showInfo();
			}
		}
	}
	public FoodItem searchFoodItem(String fid)
	{
		FoodItem f1 = null;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				if(fooditems[i].getFid().equals(fid))
				{
					f1 = fooditems[i];
					break;
				}
			}
		}
		return f1;
	}
}	