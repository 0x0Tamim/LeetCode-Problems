import java.util.Scanner;

public class Main {


    public static char nextGreatestLetter(char[] letters, char target) {
       int left = 0;
       int right = letters.length-1;
       char ans = letters[0];
       while(left<=right){
           int mid = left+(right-left)/2;
           if(letters[mid]>target){
               ans = letters[mid];
               right = mid-1;
           }
           else {
               left = mid+1;
           }
       }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of characters in the array: ");
        int n = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter sorted characters (space-separated): ");
        String[] tokens = sc.nextLine().split(" ");
        char[] letters = new char[n];
        for (int i = 0; i < n; i++) {
            letters[i] = tokens[i].charAt(0);
        }


        System.out.print("Enter the target character: ");
        char target = sc.next().charAt(0);


        char result = nextGreatestLetter(letters, target);

     
        System.out.println("Next greatest letter is: " + result);
    }
}
