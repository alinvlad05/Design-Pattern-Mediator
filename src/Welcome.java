import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    Mediator mediator;
    String response = "n";

    public Welcome(Mediator m) {
        mediator = m;
    }

    public void go() {        //prima care se executa
        System.out.print("Do you want to shop? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error");
        }

        if (response.equals("y")) {
            mediator.handle("welcome.shop");
        } else {
            mediator.handle("welcome.exit");
        }
    }
    
}
