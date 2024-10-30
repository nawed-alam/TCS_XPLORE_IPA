import java.util.*;
/*
 Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
50000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie

 */
public class IPA_5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  Movie [] arr = new Movie[4];
  for(int i=0;i<4;i++){
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    int d = sc.nextInt(); sc.nextLine();
    arr[i] = new Movie(a,b,c,d);
  }
  String s_gen = sc.nextLine();
  Movie [] ans = getgen(arr,s_gen);
  for(int i = 0;i<ans.length;i++){
    if(ans[i].getbu()>80000000){
        System.out.println("High Budget Movie");
    }else{
        System.out.println("Low Budget Movie");
    }
  }

  }
  public static Movie[] getgen(Movie [] arr, String s_gen){
    Movie [] res = new Movie[0];
    for(int i=0;i<4;i++){
        if(arr[i].getgen().equalsIgnoreCase(s_gen)){
            res = Arrays.copyOf(res,res.length+1);
            res[res.length-1]=arr[i];
        }
    }
    return res;
  }
}
class Movie{
    private String name;
    private String com;
    private String gen;
    private int bu;
    Movie(String name , String com ,String gen, int bu){
        this.name = name ;
        this.com = com;
        this.gen = gen;
        this.bu = bu;
    }
    public String getname(){
        return this.name;
    }
    public String getcom(){
        return this.com;
    }
    public String getgen(){
        return this.gen;
    }
    public int getbu(){
        return this.bu;
    }
}
