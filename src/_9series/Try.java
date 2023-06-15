package _9series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try {
    public static void main(String[] args) throws IOException {

        try
                (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            System.out.println(str);
        }

    }
}

// sir, abstract class is 0 to 100% abstrcation that's true but how come interface is 100% abstraction even after they intrdouced default and static methods?