import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = reader.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = reader.nextInt();
        reader.close();
        
        if (n1>n2){
            System.out.println(n1);
        }else{
            System.out.println(n2);
        }
    }
}
