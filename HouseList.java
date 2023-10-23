package iact.day5.example1;

import java.util.Scanner;

public class HouseList {
	
	House[] houses = new House[10];
	
	public HouseList(){
		houses[0] = new House(1, "John Dunne", "32 Lambay View Skerrie rd,", "Rush",
				"Co. Dublin", 4, true, true, "Semi-Detached", 390000.0);
		houses[1] = new House(1, "Eoin Lynch", "24 Abbey Street,", "Bray",
				"Co. Wicklow", 4, false, true, "Terraced", 380000.0);
		houses[2] = new House(1, "Amy Allan", "12 Main Street,", "Mornington",
				"Co. Meath", 4, true, true, "Semi-Detached", 370000.0);
		houses[3] = new House(1, "Declan McNally", "12 Flemington Lane", "Balbriggan",
				"Co. Dublin", 2, false, true, "Semi-Detached", 280000.0);
		houses[4] = new House(1, "Fiona Coomey", "34 Jenningston Way,", "Ballsbridge",
				"Co. Dublin", 2, false, false, "Terraced", 490000.0);
		houses[5] = new House(1, "Kate Quinn", "2a Court Griffen,", "Donnybrook",
				"Co. Dublin", 2, false, true, "Apartment", 420000.0);
		houses[6] = new House(1, "Ian Moore", "3 Cherrywood,", "Navan",
				"Co. Dublin", 4, true, true, "Detached", 370000.0);
		houses[7] = new House(1, "Alan Campbell", "2b Cherrywood Rise,", "Drumcondra",
				"Co. Dublin", 4, false, false, "Apartment", 250000.0);
		houses[8] = new House(1, "Sarah Jones", "4 Main Street,", "Greystones",
				"Co. Dublin", 4, false, false, "terraced", 370000.0);
		houses[9] = new House(1, "Lisa Kelly", "10 Lee View,", "Cobh",
				"Co. Cork", 4, true, true, "Semi-Detached", 330000.0);
		
				
		
	}
	

	
	public void displayInLine(){
		
		System.out.printf("%-10s %-30s %-30s %-15s %-15s %-10s %-10s %-10s %-20s %-20s\n", "houseID", "Owner", "Address", "Town", "County",
				"NoOfRooms", "Garden", "Parking", "House Type", "House Pr");
		for(int i=0; i<houses.length; i++){
			houses[i].displayInline();
		}
	
	}
	
	public void displayPriceRange(double low, double high){
		
		System.out.printf("%-10s %-30s %-30s %-15s %-15s %-10s %-10s %-10s %-20s %-20s\n", "houseID", "Owner", "Address", "Town", "County",
				"NoOfRooms", "Garden", "Parking", "House Type", "House Pr");
		int num = 0;
		for(int i=0; i<houses.length; i++){
			if(houses[i].gethousePrice()>low && houses[i].gethousePrice()<=high)
			houses[i].displayInline();
			num++;
		}
		System.out.println(num + " items found");
	}
	public void displayPriceRange(){
		
		Scanner input = new Scanner(System.in);
		double low, high;
		System.out.println("Please enter a lwo value: ");
		try{
		low = input. nextDouble();
		}catch (Exception e){
			low = 0.0;
			System.out.println("That is not a valid number");
			System.out.println("Low value set to 0");
			input.nextLine();
		}
		
		System.out.println("Please enter a high value: ");
		try{
		high = input. nextDouble();
		}catch (Exception e){
			high = 1000000000.0;
			System.out.println("That is not a valid number");
			System.out.println("High value set to 10000000000");
		}
		
		displayPriceRange(low, high);
	}
	public void displaybyCounty(String c){
		
		System.out.printf("%-10s %-30s %-30s %-15s %-15s %-10s %-10s %-10s %-20s %-20s\n", "houseID", "Owner", "Address", "Town", "County",
				"NoOfRooms", "Garden", "Parking", "House Type", "House Pr");
		int num = 0;
		for(int i=0; i<houses.length; i++){
			if(houses[i].getcounty().equalsIgnoreCase(c)){
			houses[i].displayInline();
			num++;
			}
		}
		System.out.println(num + " items found");
	}
	
	public void displayByCounty(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the county:");
		String c = input.nextLine();
		displaybyCounty(c);
	}
	
public void displaywithGardens(){
		
		System.out.printf("%-10s %-30s %-30s %-15s %-15s %-10s %-10s %-10s %-20s %-20s\n", "houseID", "Owner", "Address", "Town", "County",
				"NoOfRooms", "Garden", "Parking", "House Type", "House Pr");
		int num = 0;
		for(int i=0; i<houses.length; i++){
			if(houses[i].getgarden()){
			houses[i].displayInline();
			num++;
			}
		}
		System.out.println(num + " items found");
	}
}

