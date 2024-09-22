import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Nucleotideos {
    
    public int[] calculaNucleotideos(String caminho) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String sequencia = br.readLine();
            
            // Verifica se a sequência é nula (arquivo vazio)
            if (sequencia == null || sequencia.isEmpty()) {
                return new int[]{0, 0, 0, 0, 0}; // Sequência vazia
            }

            int a = 0;
            int c = 0;
            int g = 0;
            int t = 0;
            int qt_erros = 0;
            
            char[] letras = sequencia.toCharArray();
            int tamanho = sequencia.length();
            
            for (char nucleotideo : letras) {
                switch (nucleotideo) {
                    case 'A' -> a++;
                    case 'C' -> c++;
                    case 'G' -> g++;
                    case 'T' -> t++;
                    default -> qt_erros++;
                }
            }

            // Verifica se a quantidade de erros é maior que 10% do tamanho da sequência
            float limiteErros = tamanho * 0.1f;
            if (qt_erros > limiteErros) {
                return null; // Sequência inválida
            }

            // Retorna o array com as contagens
            return new int[]{a, c, g, t, qt_erros};
        }
    }
}
