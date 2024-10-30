import java.util.*;
/*
 create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
 */
public class IPA_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Course []arr = new Course[4];
    for(int i=0;i<arr.length;i++){
        int a = sc.nextInt();sc.nextLine();
        String b =sc.nextLine();
        String c = sc.nextLine();
        int d = sc.nextInt(); sc.nextLine();
        int e= sc.nextInt(); sc.nextLine();
        arr[i] = new Course(a,b,c,d,e);
    }
    String  admin = sc.nextLine();
    int handson = sc.nextInt(); sc.nextLine();
    int avg = findAvgOfQuizByAdmin(arr,admin);
    if(avg == 0){
        System.out.println("No Course found");
    }else{
        System.out.println(avg);
    }
    Course [] ans =  sortCourseByHandsOn(arr,handson);
    if(ans==null){
        System.out.println("No course is found with mentioned attribute");
    }else{
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i].getname());
        }
    }
    }
    public static int findAvgOfQuizByAdmin(Course[] arr, String admin){
        int avg =0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getadmin().equalsIgnoreCase(admin)){
                sum +=arr[i].getquiz();
                avg++;
            }
        }
        if(avg>0)sum = sum/avg;
        return sum;
    }
    public static Course[] sortCourseByHandsOn(Course [] arr,int handson){
        Course[] res = new Course[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i].gethandson()<handson){
            res = Arrays.copyOf(res,res.length+1);
            res[res.length-1]=arr[i];
        }
        
        }
        if(res.length>0){
            Arrays.sort(res,(a,b)->Integer.compare(a.gethandson(),b.gethandson()));
            return res;
        }
        return null;
    }
}
class Course{
    private int id;
    private String name;
    private String admin;
    private int quiz;
    private int handson;
    Course(int id ,String name,String admin, int quiz,int handson){
        this.id = id;
        this.name = name;
        this.admin = admin;
        this.quiz = quiz;
        this.handson = handson;
    }
    public int getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public String getadmin(){
        return this.admin;
    }
    public int getquiz(){
        return this.quiz;
    }
    public int gethandson(){
        return this.handson;
    }
}
