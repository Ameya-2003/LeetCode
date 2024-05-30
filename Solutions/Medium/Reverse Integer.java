import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int n;

        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        }
        long revNum = 0;
        while(n != 0){
      
         revNum = revNum * 10 + n%10;
         n/=10;
        }
   
        System.out.println(revNum);
    }
}
