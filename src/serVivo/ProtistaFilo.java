package serVivo;
import java.util.Scanner;

public class ProtistaFilo extends Protista {
    
	private String nomeFilo;
	Scanner scan = new Scanner(System.in);
	
	public ProtistaFilo() {
	}


	public String getNomeFilo() {
		return nomeFilo;
	}

	public void setNomeFilo(String nomeFilo) {
		this.nomeFilo = nomeFilo;
	}
	
	public void cadastrarFilo() {
		System.out.println("Escreva o filo: ");
		setNomeFilo(scan.next());
	}
	
	
}
