public class prime {
    public static void main(String args[]) {
        int L = 2, R = 100;
        for (int i = L; i <= R; i++)
            ;
        {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * 1 <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
