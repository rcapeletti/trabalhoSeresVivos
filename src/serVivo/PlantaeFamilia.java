package serVivo;

import java.util.Scanner;

public class PlantaeFamilia extends PlantaeOrdem {

	private String nomeFamilia;
	Scanner scan = new Scanner(System.in);
	
	public PlantaeFamilia() {
		
	}

	public String getNomeFamilia() {
		return nomeFamilia;
	}

	public void setNomeFamilia(String nomeFamilia) {
		this.nomeFamilia = nomeFamilia;
	}


	public void cadastrarFamilia() {
		System.out.println("Escreva a familia: ");
		setNomeFamilia(scan.next());
	}
}
