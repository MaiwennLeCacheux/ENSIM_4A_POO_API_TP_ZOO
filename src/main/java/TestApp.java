import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestApp {

	
	private void addVisiteur(Zoo zoo, int max) throws LimiteVisiteurException {
        for (int i = 0; i < max; i++) {
            zoo.nouveauVisiteur();
        }
    }
	
	@Test
    public void testNbVisiteurKO() {
        Zoo zoo = new Zoo();
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        Throwable e = null;

        try {
            addVisiteur(zoo, 18);
        } catch (Throwable ex) {
            e = ex;
        }

        assertTrue(e instanceof LimiteVisiteurException);
	}

        
        @Test
        public void testNbVisiteurOK() {
            Zoo zoo = new Zoo();
            zoo.ajouterSecteur(TypeAnimal.CHAT);
            Throwable e = null;

            try {
                addVisiteur(zoo, 15);
            } catch (Throwable ex) {
                e = ex;
            }

            assertFalse(e instanceof LimiteVisiteurException);
        }
        
        
}

