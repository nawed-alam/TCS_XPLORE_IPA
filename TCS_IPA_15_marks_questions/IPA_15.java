import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
Remove a character from a string
input:
String:hello
char:l
output:heo
 */
public class IPA_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine(); 
        String temp=str.replace(ch,"");
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!=ch){
        //         temp+=str.charAt(i);
        //     }
        // }

            System.out.println(temp);
    }

}
