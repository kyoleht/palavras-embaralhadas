
import java.util.Random;
import java.util.Scanner;


public class Jogo {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo!");

        String[] palavras = {"cabeceira", "brinquedo", "moletom", "condicionador", "chicago bulls"};

        Random random = new Random();
        
        // escolhendo uma string aleatoria
        int index = random.nextInt(palavras.length);
        String palavraEscolhida = palavras[index];
        
        char[] letras = palavraEscolhida.toCharArray();

        // passa por todas as letras da palavra escolhida
        for (int i = 0; i < letras.length; i++) {
            // variavel j criada para armazenar de forma randômica
            int j = random.nextInt(letras.length);

            // i = onde estou, j = onde quero chegar, temp = guardar as letras sem as perder
            char temp = letras[i];
            letras[i] = letras[j];
            letras[j] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        String palavraEmbaralhada = new String(letras);
        
        int tentativasRestantes = 3;
        boolean acertou = false;
        
        while (tentativasRestantes > 0 && !acertou) {

            System.out.println("Digite sua tentativa: ");
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.println("Palavra embaralhada: " + palavraEmbaralhada);
            System.out.println("");
            String palavraDigitada = scanner.nextLine();

            if(palavraDigitada.equals(palavraEscolhida)) {
                acertou = true;
            } else {
                System.out.println("");
                System.out.println("Palavra errada!");
                tentativasRestantes--;
            }

        }

        if(acertou) {
            System.out.println("");
            System.out.println("Parabéns! Você acertou.");
        }

        if(tentativasRestantes == 0) {
            System.out.println("Você não conseguiu. A palavra certa era: " + palavraEscolhida);
        }
    }
} 