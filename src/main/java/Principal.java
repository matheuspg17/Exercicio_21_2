
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int soma = 0;
        int numero;
        Scanner leia = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            numero = leia.nextInt();
            soma = soma + numero;
        }
        System.out.println("a soma é:" + soma);
    }
}
