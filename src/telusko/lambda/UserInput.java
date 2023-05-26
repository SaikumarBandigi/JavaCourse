package telusko.lambda;

import java.io.IOException;

public class UserInput {
    public static void main(String[] args) throws IOException {
        int i = System.in.read();
        System.out.println(i);
    }
}
