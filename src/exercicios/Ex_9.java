package exercicios;


import exceptions.UnderflowException;
import listas.LinkedList;
import nodes.Node;

public class Ex_9 {

	public static void main(String[] args) {
			LinkedList l1 = new LinkedList();
			l1 =PreencheListas.preencheListaSimple(l1);
			int cta = 0;
			try {
				Node meio = DevolveMeio(l1);
				l1.show();
				System.out.println(meio.getElement());
			} catch (Exception e) {
				System.out.println("ERRO: Impossível remover!");
				e.printStackTrace();	
			}

	}

	private static Node DevolveMeio(LinkedList l1) throws UnderflowException {
		Node curr = l1.getFirst();
		Node currMeio = l1.getFirst();
		l1.removeLast();
		while (curr != null) {
			curr = curr.getNext();
			currMeio = currMeio.getNext();
			if(curr!=null) {
				curr = curr.getNext();
			}
		}
		return currMeio;
	}
}

