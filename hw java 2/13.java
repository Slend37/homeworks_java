import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int y = reader.nextInt();
        reader.close();
        
        if (y%400==0){
            System.out.println("YES");
        }else if (y%100==0){
            System.out.println("NO");
        }else if (y%4==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
