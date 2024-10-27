import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 wap to print the last character of every word in a string.
 condition: ignore all the digits and whitespaces.
 input : hey i am3 nawed alam
 output:hidm
 */
public class IPA_5 {
    public static void main(String[] args) {
        
        // without using any split function.
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String temp ="";
        // int n= str.length();
        // for(int i=0;i<n-1;i++){
        //     if(Character.isAlphabetic(str.charAt(i))  && str.charAt(i+1)==' '){
        //         temp+=str.charAt(i);
        //     }
        // }
        // if(Character.isAlphabetic(str.charAt(n-1)) &&  str.charAt(n-1) !=' '){
        //     temp+=str.charAt(n-1);
        // }
        // System.out.println(temp);


        //using split function.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp ="";
        String []nstr =str.split(" ");
        int n= nstr.length;
        for(int i=0;i<n;i++){
            int w= nstr[i].length()-1;
            if(!Character.isDigit(nstr[i].charAt(w))){
                temp+=nstr[i].charAt(w);
            }
        }
        
        System.out.println(temp);
    }
}
