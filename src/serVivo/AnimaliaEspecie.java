package serVivo;

import java.util.Scanner;

public class AnimaliaEspecie extends AnimaliaGenero{
    
	String nomeEspecie;
	Scanner scan = new Scanner(System.in);
	
	public AnimaliaEspecie() {
		
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	public void cadastrarEspecie() {
		System.out.println("Escreva a Espécie: ");
		setNomeEspecie(scan.next());
	}
}
