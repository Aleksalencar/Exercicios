package exercicios;
import java.util.Scanner;
import exceptions.EmptyStackException;

import exceptions.EmptyStackException;
import listas.*;
public class Ex_17 {

	public static void main(String[] args) {
		DynamicStack pilha = new DynamicStack();
		try {
			System.out.println("Digite um palindromo :");
			Scanner s = new Scanner(System.in);
			String word = s.nextLine();
			word = word.replace(" ", "");
			word = word.replace(",", "");
			word = word.replace(".", "");
			char wordA[] = word.toCharArray();
			for (int i = 0; i < wordA.length; i++) {
				System.out.println(wordA[i]);
			}
			verifPalindromo (wordA,pilha);
			
			
			
			
			} catch (EmptyStackException e) {
				System.out.println("ERRO: Impossível remover!");
				e.printStackTrace();
			}
	}

	private static void verifPalindromo(char[] wordA, DynamicStack pilhaA) {
		DynamicStack pilhaB = new DynamicStack();
		for (int i = 0; i < wordA.length; i++) {
			pilhaA.push(wordA[i]);
			System.out.print(wordA[i]);
		}
		System.out.println();
		for (int i = wordA.length-1; i >= 0; i--) {
			System.out.print(wordA[i]);
			pilhaB.push(wordA[i]);
		}
		System.out.println();
		int size = wordA.length,cta=0;
		
		while (!pilhaA.isEmpty() && !pilhaB.isEmpty()) {
			if (pilhaA.showTop() == pilhaB.showTop()) {
				cta++;
			}
			pilhaA.pop();
			pilhaB.pop();
		}
		if (cta == size) {
			System.out.println("Essa palavra é um palindromo");
		} else {
			System.out.println("Essa palavra não é um palindromo");
		}
		
	}

}
