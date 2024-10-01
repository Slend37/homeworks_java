import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int k = reader.nextInt();
        reader.close();
        int c = k;
        while ( c%5 != 0 && c%3 != 0 && c>0){
            c-=3;
        }
        if (c<0){
            c=k;
            while (c%5 != 0 && c%3 != 0 && c>0){
                c-=5;
            }if (c<0){
            System.out.println(k +" НЕТ");
            }else{
                System.out.println(k +" ДА");
            }
        }else{
            System.out.println(k + " ДА");
            }
    }
}
