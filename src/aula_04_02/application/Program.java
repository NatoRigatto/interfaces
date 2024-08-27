package aula_04_02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aula_04_02.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		String path = "D:\\Curso Java\\Material de Apoio\\Capítulo 18\\in.csv";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Collections.sort(employees);
			for(Employee e : employees) {
				System.out.println(e.getName() + ", " + e.getSalary());
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
