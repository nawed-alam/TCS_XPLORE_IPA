import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
Reverse the string
input: Hellow how are you
output:uoy era woh wolleH
 */
public class IPA_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        s.reverse();


            System.out.println(s.toString());
    }

}
