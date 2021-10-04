import java.util.Scanner;

public class Exfour {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit: ");

        int limit = scan.nextInt();

        long[] series = new long[limit];

        series[0] = 1;
        series[1] = 1;

        for(int i = 2; i < limit; i++){
            series[i] = series[i-1] + series[i-2];
        }

        System.out.println("Fibonacci series to " + limit);
        for (int i = 0; i < limit ; i++){
            System.out.println(series[i] + " ");
        }
    }
}
