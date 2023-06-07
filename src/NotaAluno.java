import java.util.Arrays;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas:");
        int numeroDeNotas = scan.nextInt();
        if (numeroDeNotas <= 0){
            throw new IllegalArgumentException(
                    "As notas não podem ser menor ou igual a zero");
        }

        double[] nota = new double[numeroDeNotas];

        for (int i = 0; i < nota.length; i++) {
            System.out.println(i + 1 + "ª" + " Nota");
            nota[i] = scan.nextDouble();
            if (nota[i] < 0 ) {
                throw new IllegalArgumentException(
                        "A nota não podem ser menor que zero");
            }
        }

        System.out.println("Notas: " + Arrays.toString(nota));

        double total = 0;
        for (double notas : nota) {
            total += notas;
        }

        System.out.printf("A média da nota é %.1f", total / numeroDeNotas);

    }
}
