import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nomeOriginal = "Let´s Code";
        saudacao(nomeOriginal);
    }
    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);

    }
}