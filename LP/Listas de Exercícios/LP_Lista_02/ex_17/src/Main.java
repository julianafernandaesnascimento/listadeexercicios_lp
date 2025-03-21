import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int velocidade0;
        double aceleracao;
        double tempo;

        Scanner in = new Scanner(System.in);

        System.out.println("-->CALCULA A VELOCIDADE DE UM CORPO ATRAVÉS DE SUA VELOCIDADE INICIAL, ACELERAÇÃO E TEMPO<--");
        System.out.println("Insira um a velocidade inicial: ");
        velocidade0 = in.nextInt();
        System.out.println("Insira um a aceleração: ");
        aceleracao = in.nextInt();
        System.out.println("Insira um a tempo de percurso: ");
        tempo = in.nextInt();

        System.out.println("A velocidade é: " +(velocidade0+(aceleracao*tempo)));
    }
}