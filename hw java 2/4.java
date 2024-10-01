import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите начальный вклад: ");
        int vklad = reader.nextInt();
        System.out.println("Введите число лет: ");
        int years = reader.nextInt();
        System.out.println("Введите процентную ставку: ");
        float stavka = reader.nextFloat();
        reader.close();
        float curr = vklad;
        for (int i = 0; i<years; i++){
            curr = curr + (curr * stavka/100);
        }
        System.out.println(curr);
    }
}
