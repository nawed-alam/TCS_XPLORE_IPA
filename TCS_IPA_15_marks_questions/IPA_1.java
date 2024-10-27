import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
    Question:
    Given a string input and a character, find the first occurrence of the character in the string and return its index.
    If the character is found, print its index; otherwise, no output is printed.

    Example:
    Input: 
    String input: "Xplore"
    Character input: 'r'
    Output: 4

    Explanation:
    The character 'r' is found at the 4th index (0-based) in the string "Xplore".
*/

public class IPA_1 {
    public static void main(String[] args) {
        // Creating a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Reading a string input from the user
        String str = sc.nextLine();

        // Reading a character input from the user
        char ch = sc.next().charAt(0);

        // Looping through the string to find the first occurrence of the character
        for(int i = 0; i < str.length(); i++) {
            // If the character at the current index matches the input character, print the index and exit
            if(str.charAt(i) == ch) {
                System.out.println(i);
                break;
            }
        }
    }
}
