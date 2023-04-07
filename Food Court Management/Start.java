import java.lang.*;
import java.util.Scanner;
import Classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("---------------------------------------------");
		System.out.println("WELCOME TO ABCD FOOD COURT");				
		System.out.println("---------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What Do You Want To Do: \n");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant Food Item Management");
			System.out.println("\t4. Food Item Quantity Add-Sell");
			System.out.println("\t5. Exit \n");
			System.out.println("---------------------------------------------"); 
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------------------------");
			
			switch(choice)
			{
				case 1:
				
					System.out.println("---------------------------------------------");
					System.out.println("Employee Management");
					System.out.println("---------------------------------------------");
					
					System.out.println("You Have The Following Options: \n");				 
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search An Employee");
					System.out.println("\t5. Go Back \n");
					
					System.out.print("Enter Your Prefered Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("---------------------------------------------");
							System.out.println("Insert An Employee");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: "); 									
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(fc.insertEmployee(e1)){ System.out.println("Employee Inserted With ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not Be Insertd......");}
							
							break;
							
						case 2:
						
							System.out.println("---------------------------------------------");
							System.out.println("Remove An Employee");
							System.out.println("----------------------------------------------");
							
							System.out.print("Enter An Employee ID To Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.searchEmployee(empId2);
							                                                                                 
							if(e2 != null)
							{
								if(fc.removeEmployee(e2)){ System.out.println("Employee Removed With ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not Be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
						
							System.out.println("---------------------------------------------");
							System.out.println("See All Employees");           
							System.out.println("---------------------------------------------");
							
							fc.showAllEmployees();
							
							break;
							
							
							
						case 4:
							
							System.out.println("---------------------------------------------");
							System.out.println("Search An Employee");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter An Employee ID To Search: ");
							String empId3 = sc.next();
							
							Employee e3 = fc.searchEmployee(empId3);
																							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
						
						case 5:
						
							System.out.println("---------------------------------------------");
							System.out.println("You Choose To Go Back.......");                      
							System.out.println("---------------------------------------------");
						
							break;
							
						default:
						
							System.out.println("---------------------------------------------");                    
							System.out.println("Invalid Option............");
							break;
						
					}
					
					break;
				
				case 2: 
				
					System.out.println("---------------------------------------------");
					System.out.println("Restaurant Management");
					System.out.println("---------------------------------------------");
				
					System.out.println("You Have The Following Options: \n");                        
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove Existing Restaurant");
					System.out.println("\t3. Show All Restaurants");
					System.out.println("\t4. Search A Restaurant");
					System.out.println("\t5. Go Back \n");
					
					System.out.print("Enter Your Prefered Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------------------");
							System.out.println("Insert New Restaurant");
							System.out.println("---------------------------------------------");
						
							System.out.print("Enter Restaurant's ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant's Name: ");
							String name1 = sc.next();											   
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							if(fc.insertRestaurant(r1)){System.out.println("Restaurant Inserted With ID: "+r1.getRid());}
							else{System.out.println("Restaurant Can Not Be Inserted");}
							
							break;
							
						case 2:
						
							System.out.println("---------------------------------------------");
							System.out.println("Remove A Restaurant");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter A Restaurant ID To Remove: ");                     
							String rid2 = sc.next();
							
							Restaurant r2 = fc.searchRestaurant(rid2);                                   
							
							if(r2 != null)
							{
								if(fc.removeRestaurant(r2)){ System.out.println("Restaurant Removed With ID: "+r2.getRid());}
								else{System.out.println("Restaurant Can Not Be Removed......");}
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							break;
							
						
						case 3:
							
							System.out.println("---------------------------------------------");
							System.out.println("See All Restaurants");                 
							System.out.println("---------------------------------------------"); 
							
							fc.showAllRestaurants();
							
							break;
							
							
						case 4:
							
							System.out.println("---------------------------------------------");
							System.out.println("Search A Restaurant");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							Restaurant r3 = fc.searchRestaurant(rid3);
							
							if(r3 != null)                                        
							{
								System.out.println("Restaurant Found");
								System.out.println("Restaurant Name: "+r3.getName());
								System.out.println("Restaurant ID: "+r3.getRid());
								
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							
							break;
							
						case 5:
						
							System.out.println("---------------------------------------------");
							System.out.println("You Choose To Go Back.......");                                            
							System.out.println("---------------------------------------------");
							break;
							
						default:
						
							System.out.println("Invalid Option............");                           
							break;
					}
					
					break;
				
				case 3:
				
					System.out.println("---------------------------------------------");
					System.out.println("Restaurant Food Item Management");
					System.out.println("---------------------------------------------");
					
					System.out.println("You Have Following Options: \n");
					System.out.println("\t1. Insert New Food Item");
					System.out.println("\t2. Remove Existing Food Item");										
					System.out.println("\t3. Show All Food Items");
					System.out.println("\t4. Search A Food Item");
					System.out.println("\t5. Go Back \n");
					
					System.out.print("Enter Your Prefered Option: ");
					int option3 = sc.nextInt();
				
				switch(option3)
					{
						
						case 1:
							
							System.out.println("---------------------------------------------");
							System.out.println("Insert A Food Item For A Restaurant");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1) != null)
							{
								System.out.println("\tWhat type of Food Item do you want to insert?");
								System.out.println("\t1. MainDish");
								System.out.println("\t2. Appetizers");
								System.out.println("\t3. Go Back \n");
								
								System.out.print("Enter Food Item Type: ");
								int FoodItemType = sc.nextInt();
								
								if(FoodItemType == 1)
								{
									System.out.print("Enter Food ID: ");
									String fid1 = sc.next();
									System.out.print("Enter Food Name: ");
									String n1 = sc.next();
									System.out.print("Enter Food Quantity: ");
									int q1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double p1 = sc.nextDouble();
									System.out.print("Enter Food Category: ");
									String c1 = sc.next();
									
									
									MainDish md = new MainDish();
									md.setFid(fid1);
									md.setName(n1);
									md.setAvailableQuantity(q1);
									md.setPrice(p1);
									md.setCategory(c1);
									
									if(fc.searchRestaurant(rid1).insertFoodItem(md))
									{
										System.out.println("Food Item Inserted For "+ rid1 + " With Food ID " + fid1);
									}
									else
									{
										System.out.println("Food Item Can Not Be Inserted");
									}
					//11.09.20				
									
								}
								else if(FoodItemType == 2)
								{
									System.out.print("Enter Food ID: ");
									String fid1 = sc.next();
									System.out.print("Enter Food Name: ");
									String n1 = sc.next();
									System.out.print("Enter Food Quantity: ");
									int q1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double p1 = sc.nextDouble();
									System.out.print("Enter Size: ");
									String s1 = sc.next();
									
									Appetizers ap = new Appetizers();
									ap.setFid(fid1);
									ap.setName(n1);
									ap.setAvailableQuantity(q1);
									ap.setPrice(p1);
									ap.setSize(s1);
									
									if(fc.searchRestaurant(rid1).insertFoodItem(ap))
									{
										System.out.println("Food Item Inserted For "+ rid1 + " With Food ID " + fid1);
									}
									else
									{
										System.out.println("Food Item Can Not Be Inserted");
									}
								}
								else if(FoodItemType == 3)
								{
									System.out.println("Going Back.........");
								}
								
							}
							else
							{
								System.out.println("Restaurant With This ID Does Not Exist!");           
							}
							
							break;
							
							
						case 2:
						
							System.out.println("---------------------------------------------");
							System.out.println("Remove A Food Item From A Restaurant");
							System.out.println("---------------------------------------------");
						
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							System.out.print("Enter Food ID: ");
							String fid2 = sc.next();
							
							Restaurant r4 = fc.searchRestaurant(rid4);
							FoodItem fi4 = r4.searchFoodItem(fid2);

							
							if(fi4 != null)
							{
								if(r4.removeFoodItem(fi4)){ System.out.println("Food Item Removed with ID: "+fid2);}
								else{System.out.println("Food Item Can Not be Removed......");}
							}
							else
							{
								System.out.println("Food Item Does Not Exist!");
							}
							break;
							
						case 3:
							
							System.out.println("---------------------------------------------");
							System.out.println("See All Food Items Of A Restaurant");
							System.out.println("---------------------------------------------");
							System.out.print("Enter Restaurant ID: ");
                            String rid5 = sc.next();
							
							fc.searchRestaurant(rid5).showAllFoodItems();

							break;
							
						case 4:
							
							System.out.println("---------------------------------------------");
							System.out.println("Search A Food Item");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
                            String rid6 = sc.next();
							System.out.print("Enter Food ID To Search: ");
							String fid5 = sc.next();												
							
							FoodItem FI2 = fc.searchRestaurant(rid6).searchFoodItem(fid5);

							if(FI2 != null)
							{
								System.out.println("Food Item Found!");
								FI2.showInfo();
							}
							else
							{
								System.out.println("Food Item Does Not Exist!");
							}
							
							break;
						
						case 5:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
																									
						default:
						
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
					
				case 4:
				
					System.out.println("---------------------------------------------");
					System.out.println("FoodItem Quantity Add-Sell");
					System.out.println("---------------------------------------------");
					
					System.out.println("You Have The Following Options: \n");
					System.out.println("\t1. Add Food Item");
					System.out.println("\t2. Sell Food Item");
					System.out.println("\t3. Show Add Sell History");
					System.out.println("\t4. Go Back \n");
					
					System.out.print("Enter Your Prefered Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("---------------------------------------------");
							System.out.println("Add Food Item");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1) != null)
							{
								System.out.print("Enter Food ID: ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid1).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter Amount To Add: ");
									int am = sc.nextInt();
									
									if(fc.searchRestaurant(rid1).searchFoodItem(fid1).addQuantity(am))
									{
										System.out.println("Added Successfully");
										frwd.writeInFile("Added: "+ am +" Unit/Units With Food ID " + fid1 + " By " + rid1);
									}
									else
									{
										System.out.println("Can Not Add!");
									}
								}
								else
								{
									System.out.println("Invalid Food ID");
								}
								
							}
							else
							{
								System.out.println("Restaurant Does Not Exist!");
							}
							
							break;
							
						case 2:
						
							System.out.println("---------------------------------------------");
							System.out.println("Sell Food Item");
							System.out.println("---------------------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							if(fc.searchRestaurant(rid2) != null)
							{
								System.out.print("Enter Food ID: ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid2).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter Amount To Sell: ");
									int am = sc.nextInt();
									
									if(fc.searchRestaurant(rid2).searchFoodItem(fid1).sellQuantity(am))
									{
										System.out.println("Sold Successfully");
										frwd.writeInFile("Sold: "+ am +" Unit/Units With Food ID " + fid1 + " By " + rid2);
									}
									else
									{
										System.out.println("Can Not Sell");
									}
								}
								else
								{
									System.out.println("Invalid Food ID");
								}
								
							}
							else
							{
								System.out.println("RID MISMATCH");
							}
							
							break;
							
						case 3:
							
							System.out.println("---------------------------------------------");
							System.out.println("Add Sell History");
							System.out.println("---------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
			
						case 4:
						
							System.out.println("---------------------------------------------");
							System.out.println("Exit");
							System.out.println("---------------------------------------------");
							repeat = false;
							break;
					
						default:
					
							System.out.println("---------------------------------------------");
							System.out.println("Invalid Option............");
							break;
					
					}
					
					break;
			
			case 5:

							System.out.println("---------------------------------------------");
							System.out.println("\t*****  Exit  *****");
							System.out.println("---------------------------------------------");
							repeat = false;
							break;
					
						default:
					
							System.out.println("---------------------------------------------");
							System.out.println("Invalid Option............");
							break;
			}
			System.out.println("---------------------------------------------\n");
		}
	}
}