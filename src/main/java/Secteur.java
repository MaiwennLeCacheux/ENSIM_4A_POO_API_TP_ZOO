import java.util.ArrayList;

public class Secteur {
	
	private TypeAnimal typeAnimauxDansSecteur;
	
	private ArrayList<Animal> animauxDansSecteur;
	
	//constructeur
	public Secteur(TypeAnimal s) {
		
		animauxDansSecteur = new ArrayList<Animal>();
		typeAnimauxDansSecteur = s;
	}

	
	//methodes
	public void ajouterAnimal(Animal a) {
		animauxDansSecteur.add(a);
	}
	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	public String obtenirType() {
		return typeAnimauxDansSecteur.toString();
	}
	
	
	//main
	/*
	public static void main(String[] args) {
		
		
	}
	*/
}
