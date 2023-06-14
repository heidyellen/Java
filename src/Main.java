// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR) alt+124
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        // operador ternário

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}