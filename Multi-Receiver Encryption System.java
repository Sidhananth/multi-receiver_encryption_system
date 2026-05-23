import java.util.Base64;

public class Enc {

    public static void main(String[] args) {

        String message = "Secure Cloud Data";

        String encrypted = Base64.getEncoder().encodeToString(message.getBytes());

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encrypted);

        String decrypted = new String(Base64.getDecoder().decode(encrypted));

        System.out.println("Decrypted Message: " + decrypted);
    }
}
