package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as notas: ");
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Nota 4: ");
        double nota4 = sc.nextDouble();

        double somaDasNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        if (somaDasNotas >= 7.0) {
            System.out.print("Aluno aprovado");
        } else if ( somaDasNotas >= 5.0) {
            System.out.println("Aluno em recuperacao");
        } else {
            System.out.println("Aluno REPROVADOOOOOOOOO");
        }
    }
}
