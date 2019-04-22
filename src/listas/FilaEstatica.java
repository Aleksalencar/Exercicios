package listas;

import javax.swing.JOptionPane;

public class FilaEstatica {

	    int inicio;
	    int fim;
	    int tamanho;
	    int qtdeElementos;
	    int f[];
	 
	    public FilaEstatica(int tamanho){
	        inicio = fim = -1;	        
	        f = new int[tamanho];
	        qtdeElementos = 0;
	    }
	 
	    public boolean estaVazia(){
	        if (qtdeElementos == 0){
	            return true;
	        }
	        return false;
	    }
	 
	    public boolean estaCheia(){
	        if (qtdeElementos == tamanho - 1){
	            return true;
	        }
	        return false;
	    }
	 
	    public void adicionar(int n) {
			if (estaVazia()) {

				fim =inicio =n;
			
			} else if (estaCheia()) {
			
				System.out.println("A fila está cheia");
			
			} else{
				f[fim++]=n;
			}
			qtdeElementos ++;
		}
	    
	    public void remover(){
	        if (! estaVazia() ){
	            inicio++;
	            qtdeElementos--;
	        }
	    }
	    public void mostrar(){
	        String elementos = "";
	            for (int i = inicio; i<=fim; i++) {
	                elementos += f[i]+ " - ";
	            }
	            JOptionPane.showMessageDialog(null, elementos);
	    }
}
