import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
Reverse the words in a string.
input : Welcome to my Java Programming
output: Programming Java my to Welcome
 */
public class IPA_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp="";
        String[] arr = str.trim().split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i];
            if(i!=0)temp+=" ";
        }
            System.out.println(temp);
            
    }

}
