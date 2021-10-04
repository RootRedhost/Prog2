import java.util.Scanner;

public class Exeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int j = word.length();
        int i = 0;

        char a = 'a';
        char b = 'b';
        char c = 'c';
        for(i = 0;i < j;i++) {

            if(word.charAt(i) == a){
                System.out.println("found a");
            }
            else if(word.charAt(i) == b){
                System.out.println("found b");
            }
            else if(word.charAt(i) == c){
                System.out.println("found c");
            }
            else{
                System.out.println(word.charAt(i));
            }

        }
    }
}
