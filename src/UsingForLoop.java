import java.util.Scanner;

public class UsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        int sum=0;
        for(int a=1; a<=n; a++)
            sum=sum+a;
        System.out.print(sum);
    }
}
