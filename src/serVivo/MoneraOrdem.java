package serVivo;
import java.util.Scanner;

public class MoneraOrdem extends MoneraClasse{
	
	private String nomeOrdem;
	Scanner scan = new Scanner(System.in);
	
	public MoneraOrdem() {
		
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
