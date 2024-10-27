import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 find the largest word from a given string ,if two words have the same length then print the first one.
 input:Tcs is the best company ever
 output:company
 */
public class IPA_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []nstr = str.split(" ");
        String temp = "";
        int maxi =0;
        for(int i=1;i<nstr.length;i++){
           int  n =nstr[i].length();
            if(maxi<n){
                temp =nstr[i];
                maxi =n;
            }
        }
            System.out.println(temp);
    }

}
