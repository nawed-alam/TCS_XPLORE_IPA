import java.util.*;
// - If you have any questions or issues with the code, feel free to reach out to me : https://www.linkedin.com/in/nawed-anagnos/
/*
 calculate the average of elements in an integer array within a specified range. The array size and elements are given, along with two indices, start and end (inclusive), that represent the range within which you should calculate the average. Assume the indices are zero-based.

Example:

Input:
size:5
Array: [2, 4, 6, 8, 10]
start = 1
end = 3
Output:6.0
Average of elements from index 1 to 3: 6.0
 */
public class IPA_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc. nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int limit1=sc.nextInt();
        int limit2 = sc.nextInt();
        double sum =0;
        for(int i = limit1;i<=limit2;i++){
            sum+=arr[i];
        }
        int count = limit2-limit1+1;
        double avg = sum/count;
        System.out.println(avg);
    }
}
