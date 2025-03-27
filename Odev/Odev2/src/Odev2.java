import java.util.Stack;
import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

        Stack<String> textStack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String text = scanner.nextLine();

        String newtext = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            newtext += text.charAt(i);
        }

        textStack.push(newtext);

        System.out.println("");
        System.out.println("Girilen Cümle: " + text);
        System.out.println("Cümlenin tersi: " + newtext);
        System.out.println("");

        boolean Palindrome = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != newtext.charAt(i)) {
                Palindrome = false;
                break;
            }
        }
        if (Palindrome) {
            System.out.println("Girilen kelime bir palindrom'dur.");
        } else {
            System.out.println("Girilen kelime bir palindrom değildir.");
        }
    }
}
