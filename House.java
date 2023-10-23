package iact.day5.example1;

public class House {
	private int houseID;
	private String owner;
	private String address1;
	private String town;
	private String county;
	private int numberOfRooms;
	private boolean garden;
	private boolean parking;
	private String houseType;
	private double housePrice;
	
	public House(){
		
	}
	public House(int id, String onr, String adr, String t, String co, int nr,
	boolean g, boolean p, String ht, double hp){
		houseID = id;
		owner = onr;
		address1 = adr;
		town = t;
		county = co;
		numberOfRooms = nr;
		garden = g;
		parking = p;
		houseType = ht;
		housePrice = hp;
		
		}
	
	public int gethouseID(){
		
		return houseID;
	}
	
	public void sethouseID(int id){
		houseID = id;
	}
	
	public String getowner(){
		
		return owner;
	}
	
	public void setowner(String onr){
		owner = owner;
	}
	
	public String getaddress1(){
		
		return address1;
	}
	
	public void setaddress1(String adr){
		address1 = adr;
	}
	
	public String gettown(){
		
		return town;
	}
	
	public void setown(String t){
		town = t;
	}
	
	public String getcounty(){
		
		return county;
	}
	
	public void setcounty(String c){
		county = c;
	}
	
	public int getnumberOfRooms(){
		
		return numberOfRooms;
	}
	
	public void setnumberOfRooms(int nr){
		numberOfRooms = nr;
	}

	public boolean getgarden(){
		
		return garden;
	}
	
	public String hasgarden(){
		return (garden? "Yes" : "No");
		}
	
	public void setgarden(boolean g){
		garden = g;
	}
	
	public boolean getparking(){
		
		return parking;
	}
	public String hasparking(){
		return (parking? "Yes" : "No");
		
	}
	public void setparking(boolean p){
		parking = p;
	}
	
	public String gethousetype(){
		
		return houseType;
	}
	
	public void sethousetype(String ht){
		houseType = ht;
	}
	
	public double gethousePrice(){
		
		return housePrice;
	}
	
	public void sethousePrice(double hp){
		housePrice = hp;
	}
	
/*public void display(){
		
		System.out.println("houseID: " + houseID);
		System.out.println("Owner: " + owner);
		System.out.println("Address: " + address1);
		System.out.println("Town: " + town);
		System.out.println("County: " + county);
		System.out.println("Number Of Rooms: " + numberOfRooms);
		System.out.println("Garden: " + hasgarden());
		System.out.println("Parking: " + hasparking());
		System.out.println("House Type: " + houseType);
		System.out.println("House Price: " + housePrice);
		
		
		
		
		
	}*/

public void displayInline(){
	System.out.printf("%-10d %-30s %-30s %-15s %-15s %-10d %-10s %-10s %-20s %-20.2f\n", houseID, owner, address1, town, county, numberOfRooms, hasgarden(), hasparking(), houseType, housePrice);

}
}
