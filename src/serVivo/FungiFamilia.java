package serVivo;

public class FungiFamilia extends FungiOrdem {
	private String nomeFamilia;
	Scanner scan = new Scanner(System.in);
	
	public FungiFamilia() {
		
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
