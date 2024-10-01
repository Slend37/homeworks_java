import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n = reader.next();
        int k = 0;
        reader.close();
        for (int i = 0; i < n.length(); i++){
            k = k + Integer.parseInt(n.substring(i,i+1));
        }
        System.out.println(k);
    }
}
