import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {

            Encryption.mask(args[0]);

            Decryption.unmask(args[1], args[2]);

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
