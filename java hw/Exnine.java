public class Exnine {

    public static void main(String[] args) {
        int n[] = {10,20,30,40,80,50};

        int i;
        int max = 0;
        for (i = 0; i < n.length; i++) {
            if (n[i] < n[i + 1]) {
                max = n[i + 1];
            } else {
                max = n[i];
            }
        }
        System.out.println(max);
        }
}



