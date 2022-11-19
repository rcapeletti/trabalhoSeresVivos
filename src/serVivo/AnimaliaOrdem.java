package serVivo;
import java.util.Scanner;

public class AnimaliaOrdem extends AnimaliaClasse{
	
	private String nomeOrdem;
	Scanner scan = new Scanner(System.in);
	
	public AnimaliaOrdem() {
		
	}

	public String getNomeOrdem() {
		return nomeOrdem;
	}

	public void setNomeOrdem(String nomeOrdem) {
		this.nomeOrdem = nomeOrdem;
	}

	
	public void cadastrarOrdem() {
		System.out.println("Escreva a ordem: ");
		setNomeOrdem(scan.next());
	}
	
	

}
