import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
find the number of lower case in a case in a string.
input : WelCome ToMyJava
output:10
 */
public class IPA_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
            System.out.println(count);
    }

}
