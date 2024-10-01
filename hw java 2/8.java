import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = reader.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = reader.nextInt();
        reader.close();
        float c = a;
        float d = b;
        
        if (a == 0 && b == 0){
            System.out.println("INF");
        }else{
            float x = - (d/c)+(d%c);
            if (x % 1 == 0) {
                System.out.println(Math.round(x));
            }else{
                System.out.println("NO");
            }
        }
    }
}