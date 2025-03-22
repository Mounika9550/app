import java.util.Scanner;

public class rep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] f = new int[26];
        char[] c = s.toCharArray();
        for (char i : c) {
            f[i]++;
        }
        for (int i = 0; i < c.length; i++) {
            if (f[c[i]] == 1) {
                System.out.println(c[i] + "found at index " + i);
                break;
            }
        }
        sc.close();
    }
}