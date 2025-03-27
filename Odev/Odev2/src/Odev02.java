
import java.util.Scanner;
import java.util.Stack;

public class Odev02 {
    public static boolean Palindrom(String kelime) {

        Stack<Character> stack = new Stack<>();

        for (char c : kelime.toCharArray()) {  // kullanıcan alınan kelimeyi stack'e ekliyoruz
            stack.push(c);
        }

        StringBuilder sonkelime = new StringBuilder();  // string metodu kullanmak için "sonkelime" adında boş bir string metodu oluşturyoruz

        while (!stack.isEmpty()) {           // yığın boşmu kontrol et
            sonkelime.append(stack.pop());   // sil metodunu kullanarak stackteki son elemanı "sonkelime'ye" ekle
        }

        boolean palidromMu = true;
        int len = kelime.length();
        int i=0;

        while(i<len){
            if (kelime.charAt(i) != sonkelime.charAt(i)) {
                palidromMu = false;
                break;
            }
            i++;
        }
        return palidromMu;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir kelime girin:");
        String kelime = scanner.nextLine();

        if (Palindrom(kelime))
        {
            System.out.println("----------------");
            System.out.println("Palindrom.");
            System.out.println("----------------");
        }
        else
        {
            System.out.println("----------------");
            System.out.println("Palindrom değil.");
            System.out.println("----------------");
        }
    }
}
