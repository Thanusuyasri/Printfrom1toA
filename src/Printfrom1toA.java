import java.util.Scanner;

public class Printfrom1toA {
    public static int printnaturalnum(int n)
    {
        if(n==1)
        {
            System.out.println(1+" ");
            return 1;
        }
        else {
            printnaturalnum(n-1);
            System.out.println(n);
            return (n);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printnaturalnum(n);
    }
}
