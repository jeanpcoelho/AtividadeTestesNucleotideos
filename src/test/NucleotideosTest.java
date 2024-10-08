import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class NucleotideosTest {
    
    @BeforeAll
    public static void setUpClass() throws IOException {
        String nome = "arquivo";
        for (int i = 0; i < 6; i++) {
            File arquivo = new File(nome + (i+1) + ".txt");
            arquivo.createNewFile();
        }

        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter("arquivo1.txt"))) {
            bw1.write("AACTGTCGBA");
            bw1.newLine();
        }
        try (BufferedWriter bw2 = new BufferedWriter(new FileWriter("arquivo2.txt"))) {
            bw2.write("AAAGTCTGAC");
            bw2.newLine();
        }
        try (BufferedWriter bw3 = new BufferedWriter(new FileWriter("arquivo3.txt"))) {
            bw3.write("ACGYCAAYOE");
            bw3.newLine();
        }
        try (BufferedWriter bw4 = new BufferedWriter(new FileWriter("arquivo4.txt"))) {
            bw4.write("BDEFHIJKLM");
            bw4.newLine();
        }
        try (BufferedWriter bw5 = new BufferedWriter(new FileWriter("arquivo5.txt"))) {
            bw5.write("");
            bw5.newLine();
        }
    }

    @AfterAll
    public static void tearDownClass() throws IOException {
        String nome = "arquivo";
        for (int i = 0; i < 6; i++) {
            File arquivo = new File(nome + (i+1) + ".txt");
            if (arquivo.exists()) {
                arquivo.delete();
            }
        }
    }

    @Test
    @DisplayName("Verifica sequência válida sem erros")
    public void testCalculaNucleotideosSequenciaValidaSemErros() throws IOException {
        System.out.println("CalculaNucleotideosSequenciaValidaSemErros");
        String caminho = "arquivo2.txt";
        Nucleotideos nucleotideos = new Nucleotideos();
        int[] expResult = {4,2,2,2,0};
        int[] result = nucleotideos.calculaNucleotideos(caminho);
        assertArrayEquals(expResult,result);
    }

    @Test
    @DisplayName("Verifica retorno null para mais de 10% de caracteres inválidos")
    public void testCalculaNucleotideosSequenciaInvalida() throws IOException {
        System.out.println("CalculaNucleotideosSequenciaInvalida");
        String caminho = "arquivo3.txt";
        Nucleotideos nucleotideos = new Nucleotideos();
        int[] expResult = null;
        int[] result = nucleotideos.calculaNucleotideos(caminho);
        assertArrayEquals(expResult,result);
    }

    @Test
    @DisplayName("Verifica retorno para sequência vazia")
    public void testCalculaNucleotideosSequenciaVazia() throws IOException {
        System.out.println("CalculaNucleotideosSequenciaVazia");
        String caminho = "arquivo5.txt";
        Nucleotideos nucleotideos = new Nucleotideos();
        int[] expResult = {0,0,0,0,0};
        int[] result = nucleotideos.calculaNucleotideos(caminho);
        assertArrayEquals(expResult,result);
    }

    @Test
    @DisplayName("Verifica exceção para arquivo inexistente")
    public void testCalculaNucleotideosArquivoNaoExiste() throws IOException {
        System.out.println("CalculaNucleotideosArquivoNaoExiste");
        String caminho = "arquivo7.txt";
        Nucleotideos nucleotideos = new Nucleotideos();
        Exception exception = assertThrows(FileNotFoundException.class, () -> nucleotideos.calculaNucleotideos(caminho));
        assertEquals(FileNotFoundException.class, exception.getClass());
    }
}
