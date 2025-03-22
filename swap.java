import java.util.Scanner;

imort java.util.scanner

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 4 -digit number: ");
        int num = sc.nextInt();
        if(num<1000 || num>9999){
            System.out.println( "Invalid input.please enter a 4 digit number");
            return;
}
 int d1= (num / 1000 + 7 % 10);
 int d2= (num / 100 % 10 + 7) % 10;
 int d3 = ( num / 10 % 10 + 7) % 10;
 int d4 = ( num % 10 + 7) % 7;
    }
int encryptedNum = d3 * 1000  + d4 * 100 + d1 * 10 + d2;
System.out.println("Encryted number: " + encryptedNum);
 sc.close();
}