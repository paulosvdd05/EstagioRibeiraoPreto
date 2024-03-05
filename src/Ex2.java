import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número:");
        int num = scanner.nextInt();
        int n1 = 0, n2 = 1, prox = 0;
        System.out.println("******Sequencia Fibonacci******");
        while (n1 <= num) {
            System.out.print(n1 + ", ");

            prox = n1 + n2;
            n1 = n2;
            n2 = prox;

        }
        if (prox - n1 == num) {
            System.out.println("\nO número: " + num + " pertence a sequência.");
        } else {
            System.out.println("\nO número: " + num + " NÃO pertence a sequência.");
        }

    }
}
