package aula_04_02.entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}
	
	/*
	 
	Ordenar em ordem alfabética decrescente
	
	@Override
	public int compareTo(Employee other) {
		return -name.compareTo(other.getName());
	}
	
	Ordernar em ordem numérica (pelo salário) crescente
	 
	@Override
	public int compareTo(Employee other) {
		return salary.compareTo(other.getSalary());
	}
	
	Ordernar em ordem numérica (pelo salário) decrescente
	 
	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}
	 
	*/
	

}
