package Iniciante.logs;

import Iniciante.logs.entities.Logs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProgramLog {
    public static void main(String[] args) {
        //Ler Logs e acessos
        String path = "C:\\temp\\in2.txt";
        try (BufferedReader bs = new BufferedReader(new FileReader(path))) {

            Set <Logs> set = new HashSet<>();
            String line=bs.readLine();
            while (line != null) {
                String[] fields=line.split(" ");
                set.add(new Logs(fields[0], Date.from(Instant.parse(fields[1]))));
                System.out.println(line);
                line = bs.readLine();
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
