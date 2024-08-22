package exercicio.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio.model.entities.Contract;
import exercicio.model.entities.Installment;
import exercicio.services.ContractServices;
import exercicio.services.PayPalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContractServices contractService = new ContractServices(new PayPalService());
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas:");
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();

	}

}
