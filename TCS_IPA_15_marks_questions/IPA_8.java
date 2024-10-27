import java.util.Scanner;
import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 wap to print all the first charcter of each word which is vowel in the string.
 input: hey my name is nawed alam
 condition: if the count is greater than or equal to three then print the count else print "NA"
 output:4
 */
public class IPA_8{
    public static boolean isVowel(char c)
{
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
    {    
        return true;
    }    
    else
    {
        return false;
    }    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []nstr = str.split(" ");
        String temp = "";
        for(int i=0;i<nstr.length;i++){
            char s= nstr[i].charAt(0);
            if(isVowel(s)){
                temp +=s;
            }
        }
                    System.out.println(temp);
       
        
    }
}
