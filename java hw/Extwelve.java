import java.util.Scanner;

public class Extwelve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");

        String str = scan.nextLine();

        for(int i = 0;i < str.length();i++){
            if((i+1) % 2 == 0){
                System.out.print("x");
            }
            else if((i+1) % 5 == 0){
                System.out.print("X");
            }
            else{
                System.out.print(str.charAt(i));
            }

        }
    }
}
