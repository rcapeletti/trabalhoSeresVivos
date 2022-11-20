package serVivo;
import java.util.Scanner;

public class FungiClasse extends FungiFilo{
	private String nomeClasse;
	Scanner scan = new Scanner(System.in);
	
	public FungiClasse() {
		
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

	
	public void cadastrarClasse() {
		System.out.println("Escreva a classe: ");
		setNomeClasse(scan.next());
	}
}
