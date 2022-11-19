package serVivo;
import java.util.Scanner;

import java.util.ArrayList;
public class SeresVivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList animal = new ArrayList();
		Animalia a = new Animalia();
		AnimaliaFilo af = new AnimaliaFilo();
		AnimaliaClasse ac = new AnimaliaClasse();
		AnimaliaOrdem ao = new AnimaliaOrdem();
		AnimaliaFamilia afa = new AnimaliaFamilia();
		AnimaliaGenero ag = new AnimaliaGenero();
		AnimaliaEspecie ae = new AnimaliaEspecie();
		boolean flag = true;
		while(flag) {
		System.out.println("Escolha um reino: (1) Animalia | (2) Plantae | (3) Protista | (4) Monera | (5) Fungi");
		int resposta = scan.nextInt();
		switch (resposta) {
		case 1: {
			a.cadastrarNomePadrao();
			animal.add(a.getNomePadrao());
			af.cadastrarFilo();
			animal.add(af.getNomeFilo());
			ac.cadastrarClasse();
			animal.add(ac.getNomeClasse());
			ao.cadastrarOrdem();
			animal.add(ao.getNomeOrdem());
			afa.cadastrarFamilia();
			animal.add(afa.getNomeFamilia());
			ag.cadastrarGenero();
			animal.add(ag.getNomeGenero());
			ae.cadastrarEspecie();
			animal.add(ae.getNomeEspecie());
			break;
		     }
		case 2: {
			System.out.println("Inserir aqui");
			break;
		    }
		case 3: {
			System.out.println("Inserir aqui");
			break;
		    }
		case 4: {
			System.out.println("Inserir aqui");
			break;
		    }
		case 5: {
			System.out.println("Inserir aqui");
			break;
		    }
		}
		System.out.println("Escolha um reino para ver a lista cadastrada: (1) Animalia | (2) Plantae | (3) Protista | (4) Monera | (5) Fungi | (6) Sair");
		flag = false;
		int escolhafinal = scan.nextInt();
			switch(escolhafinal) {
			case 1:
				System.out.println(animal);
				break;
				
			case 6: {
				System.out.println("Você escolheu sair");
				break;
			}
			}
		
		
		}

	}
		}

	

