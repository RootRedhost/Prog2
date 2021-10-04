import java.util.Scanner;

public class Exfive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        while (a != b){
            if(a > b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }

        System.out.println("A legnagyobb közös osztó: " + a);
    }

}
