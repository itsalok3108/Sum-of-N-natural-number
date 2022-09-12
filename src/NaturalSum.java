import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        int a=1;
        int sum=0;
        while(a<=n){
            sum=sum+a;
            a++;
            System.out.println(a+" ");
        }
        System.out.println(sum);
    }
}
