import java.util.*;
/*
 Question:
Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of 
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above 
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
"Moderate Filling". Else print "Non-Critical Filling"

Input
---------------------------
1
100
50
50
2
200
60
80
3
150
35
95
4
80
45
40
85

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
 */
public class IPA_4 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Inventory [] arr = new Inventory[4];
    for(int i=0;i<4;i++){
        String a = sc.nextLine();
        int b = sc.nextInt(); sc.nextLine();
        int c =sc.nextInt(); sc.nextLine();
        int d = sc.nextInt();sc.nextLine();
        arr[i] = new Inventory(a,b,c,d);
    }
    int limit =sc.nextInt();sc.nextLine();
    Inventory [] ans = repl(arr,limit);
    for(int i=0;i<ans.length;i++){
        if(ans[i].gett()>75){
            System.out.println(ans[i].getid() + " Critical Filling");
        }
        else if(ans[i].gett()<=75 && ans[i].gett()>=50){
            System.out.println(ans[i].getid()+ " Moderate Filling");
        }else{
            System.out.println(ans[i].getid()+ " Non-Critical Filling");
        }
    }
   }
    public static Inventory[] repl(Inventory [] arr ,int limit){
        Inventory [] res = new Inventory[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].gett()<=limit){
                res= Arrays.copyOf(res,res.length+1);
                res[res.length-1]=arr[i];
            }
        }
        return res;
    }
}
class Inventory{
    private String id;
    private int m_q;
    private int c_q;
    private int t;
    Inventory(String id, int m_q, int c_q,int t){
        this.id = id;
        this.m_q =m_q;
        this.c_q = c_q;
        this.t = t;
    }
    public String getid(){
        return this.id;
    }
    public int getmq(){
        return this.m_q;
    }
    public int getcq(){
        return this.c_q;
    }
    public int gett(){
        return this.t;
    }
}
