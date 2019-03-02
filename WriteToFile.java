package input;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    private String input;
    File file;
    String text;

    WriteToFile() {
        this.file = new File("output.txt");
    }

    public void Write(String In) {

        input = In;
        try {
            FileWriter fw = new FileWriter(file);

            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(input);
            }
        } catch (IOException e) {
            System.out.println("Error while writing. Try again.");
        }
    }

}
