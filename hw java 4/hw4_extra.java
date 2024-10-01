//Вводится строка состоящая из 2 или более слов. Нужно вывести все те слова, в которых встречаются цифры или символы пунктации.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Напишите фразу: ");
        String str = reader.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i<words.length; i++){
            String word = new String();
            word = words[i];
            
            for (int j = 0; j < word.length(); j++){
                if (Character.isAlphabetic(word.charAt(j))){
                    continue;
                }else{
                    System.out.println(word);
                    break;
                }
            }
        }
    
    }
}