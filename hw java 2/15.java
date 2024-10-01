import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите рубли за товар: ");
        int a = reader.nextInt();
        System.out.println("Введите копейки за товар: ");
        int b = reader.nextInt();
        System.out.println("Внесено рублей за товар: ");
        int c = reader.nextInt();
        System.out.println("Внесено копеек за товар: ");
        int d = reader.nextInt();
        reader.close();
        
        int f = d - b;
        int e = c - a;
        if (f<0){
            e = e - 1;
            f = 100 + f;
        }
        System.out.print(e + " рублей, ");
        System.out.print(f +" копеек.");
    }
}
