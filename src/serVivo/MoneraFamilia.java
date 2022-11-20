package serVivo;

import java.util.Scanner;

public class MoneraFamilia extends MoneraOrdem {

	private String nomeFamilia;
	Scanner scan = new Scanner(System.in);
	
	public MoneraFamilia() {
		
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
