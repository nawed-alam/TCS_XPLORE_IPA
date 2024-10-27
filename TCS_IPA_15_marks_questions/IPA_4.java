import java.util.Scanner;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*

    Question:
    Write a program that takes a sentence as input and counts the number of spaces in the sentence and the number of characters (excluding spaces).

    Example:
    Input: 
    "Hello World"
    
    Output: 
    10 1

    Explanation:
    The sentence "Hello World" contains 10 characters (excluding the space) and 1 space.
*/

public class IPA_4 {
    public static void main(String[] args) {
        // Creating a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Reading a string input from the user
        String str = sc.nextLine();

        // Variable to count the number of spaces
        int count_space = 0;

        // Looping through the string to count the spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count_space++;
            }
        }

        // Printing the number of characters (excluding spaces) and the number of spaces
        System.out.println((str.length() - count_space) + " " + count_space);

        
    }
}
