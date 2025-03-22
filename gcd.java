public class gcd {
    public static int gcd(int a, int b) {
        int res = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.println(gcd(a, b));
    }
}
