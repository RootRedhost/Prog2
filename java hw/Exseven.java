import java.util.Scanner;

public class Exseven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");

        String str = scan.nextLine();
        System.out.println(str);

        char a = 'a';

        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == a) {
                System.out.println(str.substring(i,i+4));
            }
            else {
                i++;
            }
        }
    }
}
