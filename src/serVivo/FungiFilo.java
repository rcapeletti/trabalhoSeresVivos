package serVivo;

public class FungiFilo extends Fungi{
	private String nomeFilo;
	Scanner scan = new Scanner(System.in);
	
	public FungiFilo() {
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
