
public class AnimalDansMauvaisSecteurException extends Exception {

	public AnimalDansMauvaisSecteurException(String s, Animal a) {
		super(s + "à cause de l'animal " + a + '\n');
	}
}


