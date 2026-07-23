import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number : ");
        int pick = sc.nextInt();
        System.out.print("Enter limit n : ");
        int n = sc.nextInt();
        System.out.println("I guess you picked: "+guessNumber(n, pick));
    }

    public static int guess(int num, int pick) {
        if (num > pick) return -1;
        else if (num < pick) return 1;
        else return 0;
    }
    public static int guessNumber(int n, int p){

      int start = 1;
      int end = n;

      while (start<=end){

          int mid = start+(end - start)/2;
          int result = guess(mid,p);
          if(result == 0){
              return mid;
          }
          else if(result == -1){
              end = mid-1;
          }

          else {
              start = mid +1;
          }

      }
        return -1;
    }


}