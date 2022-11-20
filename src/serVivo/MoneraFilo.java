package serVivo;
import java.util.Scanner;

public class MoneraFilo extends Monera {
    
	private String nomeFilo;
	Scanner scan = new Scanner(System.in);
	
	public MoneraFilo() {
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
