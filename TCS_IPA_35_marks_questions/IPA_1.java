import java.util.Scanner;
/*
 Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
90000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
 */
public class IPA_1{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		TravelAgencies []arr = new TravelAgencies[4];
		for(int i=0;i<4;i++){
			int a = sc.nextInt(); sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt(); sc.nextLine();
			boolean e = sc.nextBoolean();
			arr[i] = new TravelAgencies(a,b,c,d,e);
		}
		int regno=sc.nextInt(); sc.nextLine();
		String packagetype =sc.nextLine();
		int maxi=findAgencyWithHighestPackage(arr);
		System.out.println(maxi);
		TravelAgencies ans = agencyDetailsForGivenIdAndType(arr ,regno, packagetype);
		if(ans!=null){
			System.out.println(ans.getAgencyName() + ":"+ans.getPrice());
		} else {
            System.out.println("No matching agency found.");
        }
		 
	}
	public static int findAgencyWithHighestPackage(TravelAgencies [] arr){
		int highest =arr[0].getPrice();
        System.out.println(highest);
		for(int i=0;i<arr.length;i++){
			if(highest<arr[i].getPrice()){
				highest = arr[i].getPrice();
			}
		}
       
		return  highest;
	}
	public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies [] arr ,int regNo ,String pakageType){
		for(int i =0;i<arr.length;i++){
			if(arr[i].getRegNo()== regNo && arr[i].getPakageType().equals(pakageType)){
			return arr[i];
		}
	}
    return null;
}
}
class TravelAgencies{
	
	int regNo;
	String agencyName;
	String pakageType;
	int price;
	boolean flightFacility;
	TravelAgencies(int regNo, String agnecyName, String pakageType,int price, boolean flightFacility){
		this.regNo = regNo;
		this.agencyName= agnecyName;
		this.pakageType= pakageType;
		this.price =price;
		this.flightFacility =flightFacility;
	}
	public int getRegNo(){
		return this.regNo;
	}
	public String getAgencyName(){
		return this.agencyName;
	}
	public String getPakageType(){
		return this.pakageType;
	}
	public int getPrice(){
		return this.price;
	}
	public boolean getFlightFacility(){
		return this.flightFacility;
	}
}
