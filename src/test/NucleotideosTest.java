package poo2.nucleotideos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
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
