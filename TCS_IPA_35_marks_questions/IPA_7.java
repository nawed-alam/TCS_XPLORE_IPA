import java.util.*;
/*
 Question:-
Create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgram with the main method.
implement the 2 static methods getCountByType and getSecondHighestPriceByBrand in the Solution class.

getCountByType method: this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.

getSecondHighestPriceByBrand method: this method will take 2 input parameters  , array of footwear objects and string parameter inputfootwearName .the method will return 
the second highest footwear objects based on the price from the array of the footwear objects
whose brand name matches with input string parameter
if no footwear with the given brand is present in the array of the footwear , then the 
should return null

Note:no two footwear objects would have the same footwearId.All the searches should be case insensetives.
the above mentioned static methods should be called from the main method.



for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method - The main method should print the footwearId ,footwearName and the footwearPrice.
If the returned value is nullthen it should print "Brand not available".
consider the sample input and output.

Sample Input 1  

100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok


Sample output :
3
99
reebok
5666



Sample input2 :
100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output :
Footwear not available
Brand not available

 */
public class IPA_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Footwear []arr = new Footwear[5];
        for(int i=0;i<5;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b =sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            arr[i] = new Footwear(a,b,c,d);
        }
        String type = sc.nextLine();
        String name = sc.nextLine();
        int count = gettype(arr, type);
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println("Footwear not available");
        }
        Footwear ans = getsecondlar(arr,name);
        if(ans != null){
            System.out.println(ans.getid());
            System.out.println(ans.getname());
            System.out.println(ans.getprice());
        }else{
            System.out.println("Brand not available");
        }
    }
    public static int gettype(Footwear[] arr , String type){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].gettype().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }
    public static Footwear getsecondlar(Footwear []arr ,String name){
        int[] ans = new int[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getname().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=arr[i].getprice();
            }
        }
        Arrays.sort(ans);
        if(ans.length<2){
            return null;
        }
        int j=ans.length-2;
        
        int c =ans[j];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getprice()==c){
                return arr[i];
            }
        }
        return null;
    }
}
class Footwear{
    private int id;
    private String name;
    private String type;
    private int price;
    Footwear(int id ,String name ,String type ,int price){
        this.id = id;
        this.name= name;
        this.type = type;
        this.price = price;
    }
    public int getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public String gettype(){
        return this.type;
    }
    public int getprice(){
        return this.price;
    }
}
