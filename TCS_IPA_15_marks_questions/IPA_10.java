import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 Take an integer as input and calculate the sum of its digit.if the sum is divisible by 3 , then print true else print false.
 input :123
 output:True
 input:1234
 output:False
 */
public class IPA_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        if(sum%3 == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
