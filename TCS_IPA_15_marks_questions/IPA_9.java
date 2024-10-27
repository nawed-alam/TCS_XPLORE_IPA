import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 find the characters of a string at odd index.
 input :Management
 output:aaeet
 */
public class IPA_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        for(int i=0;i<str.length();i++){
            if(i%2 != 0){
                temp+=str.charAt(i);
            }
        }
        
            System.out.println(temp);
        
        
    }
}
