package application;

import java.util.Scanner;

import entities.Quarto;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		Quarto[] quarto = new Quarto[10];
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent: #" + (i+1) + ": ");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numero = sc.nextInt();
			sc.nextLine();
			quarto[numero] = new Quarto(nome, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (quarto[i] != null) {
				System.out.println(i + ": " + quarto[i]);
			}
		}
		
		sc.close();
	}

}
