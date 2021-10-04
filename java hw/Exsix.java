
public class Exsix {

    static boolean palindrome(String word) {
        int i = 0;
        int j = word.length();

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;

            }
            i++;
            j--;

        }
        return true;
    }

        public static void main (String[]args){
            String word = "abba";

            if(palindrome(word)){
                System.out.println(word + " is a palindrome");
            }
            else{
                System.out.println("False");
            }

        }


    }

