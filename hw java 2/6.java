import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num%2==0){
            System.out.println("ДА");
        }else{
            System.out.println("НЕТ");
        }
    }
}