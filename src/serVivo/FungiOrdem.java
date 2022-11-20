package serVivo;

public class FungiOrdem extends FungiClasse{
	private String nomeOrdem;
	Scanner scan = new Scanner(System.in);
	
	public FungiOrdem() {
		
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
