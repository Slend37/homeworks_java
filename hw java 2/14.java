import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int sign = reader.nextInt();
        reader.close();
        
        if (sign>0){
            System.out.println(1);
        }else if (sign<0){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }
    }
}
