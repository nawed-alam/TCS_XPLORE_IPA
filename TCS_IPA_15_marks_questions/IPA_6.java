import java.util.Scanner;
import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 print the number of spaces in the string
 input: hey my name is name
 condition: if the count is greater than or equal to three then print the count else print "NA"
 output:4
 */
public class IPA_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        if(count>=3 ){
            System.out.println(count);
        }else{
            System.out.println("NA");
        }
        
    }
}
