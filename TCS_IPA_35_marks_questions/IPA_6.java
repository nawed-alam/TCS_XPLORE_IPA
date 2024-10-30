import java.util.*;
/*
 Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

dolo650
FAC124W
fever
200
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
100
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200

 */
public class IPA_6 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        Medicine arr[] = new Medicine[4];
        for(int i =0;i<4;i++){
            String a= sc.nextLine();
            String b = sc.nextLine();
            String c  = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            arr[i] = new Medicine(a,b,c,d);
        }
        String di = sc.nextLine();
        int [] ans = getdi(arr,di);
       Arrays.sort(ans);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int [] getdi(Medicine[] arr , String di){
        int [] res = new int[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getdi().equalsIgnoreCase(di)){
                res = Arrays.copyOf(res,res.length+1);
                res[res.length-1]=arr[i].getprice();
            }
        }
        return res;
    }
}
class Medicine{
    private String name;
    private String ba;
    private String di;
    private int price ;
    Medicine(String name , String ba, String di, int price){
        this.name = name;
        this.ba= ba;
        this.di = di;
        this.price = price;
    }
    public String getname(){
        return this.name;
    }
    public String getba(){
        return this.ba;
    }
    public String getdi(){
        return this.di;
    }
    public int getprice(){
        return this.price;
    }
}

