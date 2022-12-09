import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Write_and_pow {

    public void computing(int a, int b) {



        try (FileWriter fw = new FileWriter("output.txt", StandardCharsets.UTF_8, false)) {
            if (a == 0 && b == 0) {
                fw.write("не определено");
                fw.close();
            } else {
                fw.write(String.format("а = %d, b = %d, ответ: %f", a, b, Math.pow(a, b)));
                fw.close();
            }
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}