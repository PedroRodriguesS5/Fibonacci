import java.util.HashMap;
import java.util.Scanner;

public class MainDuplicatedA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");

        HashMap<Character, Short> mapA = new HashMap<>();
        String palavra = sc.nextLine();
        short count = 0;
        for(int i = 0; i < palavra.length(); i++ ){
            char c = palavra.charAt(i);
            if(c == 'a' || c == 'A'){

                mapA.put(c, count++);
            }

        }
        System.out.printf("Numero de ocorrências da letra A " + count);
    }
}
