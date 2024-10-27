import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
find the number of even digits in a number . if it is greater than 2 , then print true otherwise print false
input : 14236
output:True

Input:1459
output:False
 */
public class IPA_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
       while(n>0){
            if((n%10)%2 ==0){
                count++;
            }
            n/=10;
       }
           if(count>2){
            System.out.println("True");
           }
           else{
            System.out.println("False");
           }
    }

}
