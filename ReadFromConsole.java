package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {

    BufferedReader inp;
    private String input;
    private String line;

    public ReadFromConsole() {
        this.inp = new BufferedReader(new InputStreamReader(System.in));
        this.input = "";
    }

    public String Reading() {
        try {
            while ((line = inp.readLine()) != null) {
                if (line.isEmpty()) {
                    break;
                }
                input += line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Error while reading. Try again.");
        }
        return input;
    }
}
