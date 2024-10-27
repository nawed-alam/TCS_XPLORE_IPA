import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/

/*
check a number is perfect or not
input :6
output:Perfect Number
explanation:
The factors of 6 : 1,2,3. so the sum = 1+2+3 =6
sum of the factors is equal to the given number . so this is a perfect number.

input:8
output:not a perfect number
 */
public class IPA_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Prfect Number.");
    }else{
        System.out.println("Not Perfect Number");
    }

    }
}
