package pl.lublin.wsei.java.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test {
    public static void main(String[] args) {
        try {
            String contests = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("Zawartość pliku gustInfoGraphic.xml");
            System.out.print(contests);
        }
        catch (IOException e) {
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml =>" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}


