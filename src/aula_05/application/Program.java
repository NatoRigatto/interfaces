package aula_05.application;

import java.util.Locale;
import java.util.Scanner;

import aula_05.services.BrazilInterestService;
import aula_05.services.InterestService;
import aula_05.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double amount = sc.nextDouble();
		System.out.print("Meses: ");
		int months = sc.nextInt();
		System.out.println("Pagamento apos 3 meses:");
		
		InterestService isBr = new BrazilInterestService(2.0);
		double paymentBr = isBr.payment(amount, months);
		System.out.printf("Juros BR: %.2f", paymentBr);
		
		System.out.println();
		InterestService isUsa = new UsaInterestService(1.0);
		double paymentUsa = isUsa.payment(amount, months);
		System.out.printf("Juros USA: %.2f", paymentUsa);
		
		sc.close();

	}

}
