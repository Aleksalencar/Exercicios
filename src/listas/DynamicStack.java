package listas;

import exceptions.EmptyStackException;
import nodes.NodeChar;

public class DynamicStack {
	protected NodeChar topo; //node topo da pilha
	protected int size; //n�mero de nodes da pilha
	// Construtor default que cria uma pilha vazia
	public DynamicStack() {
		topo = null;
		size = 0;
	}
	/* Retorna:
	-true se a pilha est� vazia
	-false caso contr�rio */
	public boolean isEmpty() {
		return topo == null;
	}
	
	/* Retorna o n�mero de elementos na pilha */
	public int getSize() {
		return size;
	}
	/* Retorna o elemento no topo da pilha */
	public char showTop() throws Exception {
	if (isEmpty()) {
		throw new Exception();
	}
	return topo.getElement();
	}
	public void push(char element) {
		NodeChar novo = new NodeChar(element, topo);
		topo = novo;
		size++;
		}
	public char pop() throws Exception {
		if (isEmpty()) {
			throw new Exception();
		}
		char temp = topo.getElement();
		topo = topo.getNext();//desencadeira o node topo
		size--;
		return temp;
		}
}
