
import java.util.Scanner;

public class BufferOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String str = sc.nextLine();

        str = str.replaceAll(" ", "");

        char[] chr = str.toCharArray();

        System.out.print("Request a characters between 0 and " + str.length() + " : ");

        int point = sc.nextInt();

        System.out.print("Characters you requested : ");

        for (int i = 0 ; i < point ; i++){
            System.out.print(chr[i]);
        }


    }
}
