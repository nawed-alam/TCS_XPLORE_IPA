import java.util.*;
/*
 Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - int
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - FindNumClearancedByLoc and UpdateInstitutionGrade in Solution class.

FindNumClearancedByLoc method:
----------------------------------------------
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as 
parameter. If no institution with the given location is present in the array of institution objects, then the method 
should return 0.

UpdateInstitutionGrade method:
-----------------------------------------------
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the 
institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. 
This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return 
null.

The grade attribute should be calculated as follows:

Rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared
If the rating greater than equal to 80 , then grade should be 'A'.
Else, then grade should be 'B'

*Note:*
--------------------------------------------
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For FindNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is 
greater than 0, or it should print "There are no cleared students in this particular location".

For UpdateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution 
object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the 
institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes 
in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.

Input
-------------------------------------------
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output
----------------------------------------
22000
Karunya::A

 */
public class IPA_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution [] arr = new Institution[4];
        for(int i=0;i<4;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            arr[i] = new Institution(a,b,c,d,e,"");
        }
        String loc =sc.nextLine();
        String name =sc.nextLine();
        int sum = findNumClearancedByLoc(arr,loc);
        if(sum>0){
            System.out.println(sum);
        }else{
            System.out.println("There are no cleared students in this particular location");
        }
        Institution ans = updateInstitution(arr, name);
        if(ans != null){
            System.out.println(ans.getInstitutionName() + "::"+ans.getgrade());
        }else{
            System.out.println("No Institute is available with the specified name");
        }
    }
    public static int findNumClearancedByLoc(Institution [] arr, String loc){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getlocation().equals(loc)){
                sum+=arr[i].getcleared();
            }
        }
        return sum ;
    }
    public static Institution updateInstitution(Institution [] arr , String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getInstitutionName().equals(name)){
                int rate= (arr[i].getplaced()*100)/arr[i].getcleared();
                if(rate>=80){
                    arr[i].setgrade("A");
                }else{
                    arr[i].setgrade("B");
                }
                return arr[i];
            }
        }
        return null;
    }
}
class Institution{
    private int institutionId;
    private String institutionName;
    private int noOfStudentPlaced;
    private int noOfStudentCleared;
    private String location;
    private String grade;
    Institution(int institutionId,String institutionName,int noOfStudentPlaced ,int noOfStudentCleared ,String location,String grade){
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentPlaced = noOfStudentPlaced;
        this.noOfStudentCleared = noOfStudentCleared;
        this.location =location;
        this.grade = grade;
       
    }
    public int getinstitutionId(){
        return this.institutionId;
    }
    public String getInstitutionName(){
        return this.institutionName;
    }
    public int getplaced(){
        return this.noOfStudentPlaced;
    }
    public int getcleared(){
        return this.noOfStudentCleared;
    }
    public String getlocation(){
        return this.location;
    }
    public void setgrade(String grade){
        this.grade = grade;
    }
    public String getgrade(){
        return this.grade;
    }
    
}
