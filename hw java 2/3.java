import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите градусы по цельсию: ");
        int c = reader.nextInt();
        reader.close();
        float t = c;
        System.out.println(t +" по цельсию, ");
        System.out.println(32.0+t*9/5 +" по фаренгейту");
    }
}
