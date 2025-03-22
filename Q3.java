public class Q2 {
    public static void main(String args[]) {
        Interger a = 10;
        Interger b = 10;
        Interger c = 10;
        Interger res = ((a + b) * (c + ++a - c / a--)) / --c;
        System.out.println("Result = " + res);
    }
}