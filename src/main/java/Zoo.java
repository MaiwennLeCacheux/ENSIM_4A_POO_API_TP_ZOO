import java.util.ArrayList;

public class Zoo {

	private int visiteurs;
	private ArrayList<Secteur> secteursAnimaux;
	
	public Zoo() {
		secteursAnimaux = new ArrayList<Secteur>();
	}
	
	public void ajouterSecteur(TypeAnimal s) {
		
		Secteur newS = new Secteur(s);
		secteursAnimaux.add(newS);
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		
		int limite = getLimiteVisiteur();
		if (this.visiteurs < limite) {
			this.visiteurs++;
		}
	}
	
	public int getLimiteVisiteur() {
		return 15;
	}
	
	public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException{
		System.out.println("on va dire que j'ai ajouté "+a.toString());
	}
	
	public int nombreAnimaux() {
		int res = 0;
		
		for(Secteur s : secteursAnimaux) {
			res += s.getNombreAnimaux();
		}
		
		return res;
	}
}
