import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        Person person = MAPPER.readValue(new FileReader("file.json"), Person.class);

        System.out.println(person);
    }
}
