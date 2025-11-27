
import java.util.Random;


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

        String palavraEmbaralhada = new String(letras);
        System.out.println("Palavra embaralhada: " + palavraEmbaralhada);

        // while 
        
    }
}

// pegar a palavra escolhida, percorrer pelas letras, transformar em int para ficar mais fácil de move-lás, utilizar random (eu acho) para embaralha-las, 