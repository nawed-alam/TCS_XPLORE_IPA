import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
    Question:
    Given a string input consisting only of lowercase letters, print a new string that contains only the distinct characters from the input string, preserving their order of first appearance.

    Example:
    Input: 
    String input: "experience"
    
    Output: "exprinc"
    
    Explanation:
    In the string "experience", the distinct characters are 'e', 'x', 'p', 'r', 'i', 'n', and 'c', which appear in that order.
*/

public class IPA_3 {
    public static void main(String[] args) {
        // Creating a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Reading a string input from the user
        String str = sc.nextLine();

        // Frequency array for lowercase letters ('a' to 'z')
        int[] fre = new int[26];

        // Populating the frequency array by counting each character's occurrences
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            fre[currentChar - 'a']++;
        }

        // String to store the result with distinct characters
        String result = "";

        // Looping through the string to collect distinct characters in order of appearance
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // If the character's frequency is greater than 0, it's the first occurrence
            if (fre[currentChar - 'a'] > 0) {
                result += currentChar;          // Append the character to the result
                fre[currentChar - 'a'] = 0;    // Set frequency to 0 to mark it as processed
            }
        }

        // Printing the result string with distinct characters
        System.out.println(result);

        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
