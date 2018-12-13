import java.lang.StringBuilder;
import java.util.Scanner;
import java.util.ArrayList;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        while (num > 0) {
            String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
            ArrayList<String> missing = new ArrayList<String>();
            for (String s : alpha) {
                missing.add(s);
            }
            String line = in.nextLine().toLowerCase();
            for (int i  = 0; i < line.length(); i++) {
                String tmp = line.substring(i, i+1);
                missing.remove(tmp);
            }
            if (missing.isEmpty()) {
                System.out.println("pangram");
            }
            else {
                StringBuilder miss = new StringBuilder();
                for (String s : missing) {
                    miss.append(s);
                }
                System.out.println("missing " + miss);
            }
            num--;
        }
    }
}
