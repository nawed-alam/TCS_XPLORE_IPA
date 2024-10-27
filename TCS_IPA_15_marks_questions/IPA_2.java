import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
    Question:
    Given a string input, count the number of small (lowercase) letters in the string.

    Example:
    Input: 
    String input: "DataBaSe"
    
    Output: 5

    Explanation:
    In the string "DataBaSe", the lowercase letters are 'a', 't', 'a', 'a', and 'e', so the output is 5.
*/
public class IPA_2 {
    public static void main(String[] args) {
        // Creating a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Reading a string input from the user
        String str = sc.nextLine();

        // Initializing a counter for lowercase letters
        int count = 0;

        // Looping through the string to count lowercase letters
        for(int i = 0; i < str.length(); i++) {
            // Checking if the character is a lowercase letter
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
        }

        // Printing the count of lowercase letters
        System.out.println(count);
    }
}
