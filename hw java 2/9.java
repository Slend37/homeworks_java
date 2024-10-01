import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        int k = 1;
        reader.close();
        for (int i = 1; i<=n; i++){
            k=k*i;
        }
        System.out.println(k);
    }
}
