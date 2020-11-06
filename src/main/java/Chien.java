
public class Chien extends Animal{
	
	public Chien(String n, TypeAnimal typeA) {
		this.nomAnimal = n;
		this.typeAnimal = typeA;
	}

	public String getNomAnimal() {
		return this.nomAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal.toString();
	}
	
}
