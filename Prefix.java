import java.util.Scanner;
public class Prefix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String[] s =new String[n];
        for(int i=0;i<=n;i++){
            s[i]=sc.nextInt();
        }
        Arrays.sort(s);
            char[] s1=s[0].toCharArray();
            char[] s2=s[s.length -1].tocharArray();
            int min=Math.min(s1.length,s2.length);
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<min;i++)
        {
            if(s1[i]!=s2[i])
            break;
            sb.append(s1[i]);
        }

    System.out.println(new String(sb));
    sc.close();
}
}
