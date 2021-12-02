import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = file.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e);
        } finally {
            try {
                file.close();
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
