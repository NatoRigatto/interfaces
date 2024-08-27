package aula_04_01.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "D:\\Curso Java\\Material de Apoio\\Capítulo 18\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				list.add(line);
				line = br.readLine();
			}
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
