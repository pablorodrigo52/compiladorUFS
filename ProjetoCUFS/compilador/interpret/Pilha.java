package compilador.interpret;

import java.util.ArrayDeque;
import java.util.Deque; 

public class Pilha {

	static Deque<String> pilha = new ArrayDeque<String>(); 

	public Pilha() {
		return; 
	}
	
	public boolean isEmpty() {
		if(pilha.isEmpty()) {
			return true; 
		}
		else{
			return false; 
		} 
	}
	
	public void push(String item) throws IllegalStateException {
		pilha.push(item);
	}
	
	public String pop() {
		String item;
		
		if( !pilha.isEmpty()) {
			item = pilha.pop();
		}else {
			System.out.println("Pilha vazia, impossível remover.");
			item = ""; 
		}
		return item; 
	}
	
	public String peek() {
		String item;
		
		if( !pilha.isEmpty()) {
			item = pilha.peek();
		}else {
			System.out.println("Pilha vazia, impossível espiar.");
			item = ""; 
		}		
		return item; 
	}
	
}

