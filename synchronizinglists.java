mport java.util.Arrays;
import java.util.Scanner;

public class SyncLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        do {
            n = sc.nextInt();
            int[] list1 = new int[n];
            int[] copyList1 = new int[n];
            int[] list2 = new int[n];

            for (int i = 0; i < 2 * n; i++) {
                temp = sc.nextInt();
                
                if (i < n) {
                    list1[i] = temp;
                    copyList1[i] = temp;
                } else {
                    list2[i - n] = temp;
                }
            }

            Arrays.sort(copyList1);
            Arrays.sort(list2);
            

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (list1[i] == copyList1[j])
                        System.out.println(list2[j]);
                }
            }
            
            System.out.println();
        } while(n != 0);
        
    }
}

 rss fee
