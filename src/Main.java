// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int nota = 70;

        // se nota maior ou igual 70, então aprovado
        // if-else

        if (nota >= 70) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno não aprovado");
        }

        // A 80 B 70 C 60 D 0 GRADUAÇÕES

        if (nota >= 80) {
            System.out.println(("Graduação A"));
        } else if (nota < 80 && nota >= 70) {
            System.out.println("Graduação B");
        } else if (nota < 70 && nota >= 60) {
            System.out.println("Graduação C");
        } else if (nota <60 && nota >=0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota Inválida!");
        }




    }
}