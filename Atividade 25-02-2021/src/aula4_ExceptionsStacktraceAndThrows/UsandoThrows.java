package aula4_ExceptionsStacktraceAndThrows;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println ("Entre um número decimal: ");
		try {
			double num = leNumero();
			System.out.println ("Digitado: " + num);
		} catch (Exception e) {
			System.out.println ("Informação inválida");
			e.printStackTrace();
		}

	}

	public static double leNumero () throws Exception {
		Scanner scan = new Scanner (System.in);
		double num = scan.nextDouble();
		return num;

	}

}
