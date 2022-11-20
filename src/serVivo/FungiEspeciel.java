package serVivo;

public class FungiEspecie extends FungiGenero{
	String nomeEspecie;
	Scanner scan = new Scanner(System.in);
	
	public FungiEspecie() {
		
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	public void cadastrarEspecie() {
		System.out.println("Escreva a Espécie: ");
		setNomeEspecie(scan.next());
	}
}
