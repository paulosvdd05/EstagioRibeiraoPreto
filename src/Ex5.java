import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra:");
        String palavra = scanner.nextLine();
        String palavraInvertida = "";
        for(int i = palavra.length() - 1; i>=0 ;i--){
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        System.out.println("Palavra invertida:\n" + palavraInvertida);
    }
}
