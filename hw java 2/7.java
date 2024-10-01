import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число поездок: ");
        int rides = reader.nextInt();
        reader.close();
        int rideopts[] = {1,5,10,20,60};
        int outs[] = {0,0,0,0,0};
        
        for (int i = 4; i>-1; i--){
            if (rides>=rideopts[i]){
                outs[i] = rides/rideopts[i];
                rides = rides%rideopts[i];
                
            }
            System.out.print(outs[i]);
        }
    }
}
