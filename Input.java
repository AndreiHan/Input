package input;

public class Input {

    public static void main(String[] args) { //Author Han Andrei-Marius 
        ReadFromConsole Rd = new ReadFromConsole();
        WriteToFile Wt = new WriteToFile();

        System.out.println("Write text. Press Enter twice to end ");
        
        Wt.Write(Rd.Reading());

    }

}
