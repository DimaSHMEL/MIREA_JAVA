package lab_8_1;
import java.io.*;
import java.io.FileWriter;

public class CmdOutput {
    public CmdOutput(String Elem)
    {
        try {
            FileWriter writer = new FileWriter("src/lab_8_1/Output.txt", false);
            writer.write(Elem);
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
