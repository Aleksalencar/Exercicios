package exercicios;

import java.util.Random;

import listas.StaticStack;

public class Ex_18 {

	public static void main(String[] args) {
		StaticStack pilha1 = new StaticStack(50);
		StaticStack pilha2= new StaticStack(50);
		Random r = new Random();
		int p1Size = r.nextInt(50);
		for (int i = 0; i < p1Size; i++) {
			pilha1.empilhar(r.nextFloat());
		}
		int p2Size = r.nextInt(50);
		for (int i = 0; i <p2Size ; i++) {
			pilha2.empilhar(r.nextFloat());
		}
		Object[] vts = new Object[p1Size+p2Size];
		geraVetor(pilha1,pilha2,vts);
	}

	private static void geraVetor(StaticStack pilha1, StaticStack pilha2,Object[] vt) {
	
		int i = 0;
		while (!pilha1.isEmpty()) {
			vt[i]  = pilha1.showTop();
			pilha1.desempilhar();
			i++;
		}
		while (!pilha2.isEmpty()) {
			vt[i]=pilha2.showTop();
			pilha2.desempilhar();
			i++;
		}
		
		}
	}


