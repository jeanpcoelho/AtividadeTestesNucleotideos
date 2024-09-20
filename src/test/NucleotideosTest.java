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