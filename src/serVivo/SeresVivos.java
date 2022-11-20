package serVivo;

import java.util.ArrayList;
import java.util.Scanner;

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
//plantae

           ArrayList plantae = new ArrayList();
		Plantae p = new Plantae();
		PlantaeFilo pf = new PlantaeFilo();
		PlantaeClasse pc = new PlantaeClasse();
		PlantaeOrdem po = new PlantaeOrdem();
		PlantaeFamilia pfa = new PlantaeFamilia();
		PlantaeGenero pg = new PlantaeGenero();
		PlantaeEspecie pe = new PlantaeEspecie();
		//protista
		ArrayList protista = new ArrayList();
		Protista pr = new Protista();
		ProtistaFilo prf = new ProtistaFilo();
		ProtistaClasse prc = new ProtistaClasse();
		ProtistaOrdem pro = new ProtistaOrdem();
		ProtistaFamilia prfa = new ProtistaFamilia();
		ProtistaGenero prg = new ProtistaGenero();
		ProtistaEspecie pre = new ProtistaEspecie();
		//monera
		ArrayList monera = new ArrayList();
		Monera m = new Monera();
		MoneraFilo mf = new MoneraFilo();
		MoneraClasse mc = new MoneraClasse();
		MoneraOrdem mo = new MoneraOrdem();
		MoneraFamilia mfa = new MoneraFamilia();
		MoneraGenero mg = new MoneraGenero();
		MoneraEspecie me = new MoneraEspecie();
		//fungi
		ArrayList fungi = new ArrayList();
		Fungi f = new Fungi();
		FungiFilo ff = new FungiFilo();
		FungiClasse fc = new FungiClasse();
		FungiOrdem fo = new FungiOrdem();
		FungiFamilia ffa = new FungiFamilia();
		FungiGenero fg = new FungiGenero();
		FungiEspecie fe = new FungiEspecie();
		

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
			p.cadastrarNomePadrao();
			plantae.add(p.getNomePadrao());
			pf.cadastrarFilo();
			plantae.add(pf.getNomeFilo());
			pc.cadastrarClasse();
			plantae.add(pc.getNomeClasse());
			po.cadastrarOrdem();
			plantae.add(po.getNomeOrdem());
			pfa.cadastrarFamilia();
			plantae.add(pfa.getNomeFamilia());
			pg.cadastrarGenero();
			plantae.add(pg.getNomeGenero());
			pe.cadastrarEspecie();
			plantae.add(pe.getNomeEspecie());
			break;
		    }
		case 3: {
			pr.cadastrarNomePadrao();
			protista.add(pr.getNomePadrao());
			prf.cadastrarFilo();
			protista.add(prf.getNomeFilo());
			prc.cadastrarClasse();
			protista.add(prc.getNomeClasse());
			pro.cadastrarOrdem();
			protista.add(pro.getNomeOrdem());
			prfa.cadastrarFamilia();
			protista.add(prfa.getNomeFamilia());
			pg.cadastrarGenero();
			protista.add(prg.getNomeGenero());
			pe.cadastrarEspecie();
			protista.add(pre.getNomeEspecie());
			break;
		    }
		case 4: {
			m.cadastrarNomePadrao();
			monera.add(m.getNomePadrao());
			mf.cadastrarFilo();
			monera.add(mf.getNomeFilo());
			mc.cadastrarClasse();
			monera.add(mc.getNomeClasse());
			mo.cadastrarOrdem();
			monera.add(mo.getNomeOrdem());
			mfa.cadastrarFamilia();
			monera.add(mfa.getNomeFamilia());
			mg.cadastrarGenero();
			monera.add(mg.getNomeGenero());
			me.cadastrarEspecie();
			monera.add(pre.getNomeEspecie());
			break;
		    }
			case 5: {
				f.cadastrarNomePadrao();
				fungi.add(f.getNomePadrao());
				ff.cadastrarFilo();
				fungi.add(ff.getNomeFilo());
				fc.cadastrarClasse();
				fungi.add(fc.getNomeClasse());
				fo.cadastrarOrdem();
				fungi.add(fo.getNomeOrdem());
				ffa.cadastrarFamilia();
				fungi.add(ffa.getNomeFamilia());
				fg.cadastrarGenero();
				fungi.add(fg.getNomeGenero());
				fe.cadastrarEspecie();
				fungi.add(fe.getNomeEspecie());
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
			case 2:
				System.out.println(plantae);
				break;
			case 3:
				System.out.println(protista);
				break;
			case 4:
				System.out.println(monera);
				break;

				case 5: 
					System.out.println(fungi);
					break;
				}
			case 6: 
				System.out.println("Você escolheu sair");
				break;
			
			}
		
		
		}

}}
