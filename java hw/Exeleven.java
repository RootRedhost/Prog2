import java.util.Scanner;

public class Exeleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");

        int num1 = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter (+-/*): ");

        char operator = scan.next().charAt(0);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter second number: ");

        int num2 = scan2.nextInt();

        if(operator == '+' ){
            int v1 = num1+num2;
            System.out.println(v1);
        }
        else if(operator == '-'){
            int v2 = num1-num2;
            System.out.println(v2);
        }
        else if(operator == '/'){
            int v3 = num1/num2;
            System.out.println(v3);
        }
        else if (operator == '*'){
            int v4 = num1*num2;
            System.out.println(v4);
        }
        }

    }

