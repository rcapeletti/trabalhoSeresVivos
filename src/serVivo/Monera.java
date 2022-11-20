package serVivo;
import java.util.Scanner;


public class Monera {
	
	private String nomePadrao ;
	Scanner scan = new Scanner(System.in);
	
	public Monera(){
		
	}
	
	
 
	public String getNomePadrao() {
		return nomePadrao;
	}



	public void setNomePadrao(String nomePadrao) {
		this.nomePadrao = nomePadrao;
	}



	public void cadastrarNomePadrao() {
		System.out.println("Escreva o nome padrão: ");
		setNomePadrao(scan.next());
	}
}
