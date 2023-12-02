package esiea.metier;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class VoitureTest extends TestCase {
    @Test

    public void testToString() {
        Voiture voiture = new Voiture();

        String result = voiture.toString();
        assertFalse(result.isEmpty());
    }
    @Test
    public void testCheckValidVoiture() {
        Voiture voiture = new Voiture();
        voiture.setId(1);
        voiture.setMarque("Toyota");
        voiture.setModele("Camry");
        voiture.setFinition("LE");
        voiture.setCarburant(Voiture.Carburant.valueOf("ESSENCE"));
        voiture.setKm(50000);
        voiture.setAnnee(2020);
        voiture.setPrix(20000);

        boolean result = voiture.check();
        assertTrue(result);
    }
    @Test
    public void testCheckInvalidVoiture() {
        Voiture car = new Voiture();

        boolean result = car.check();
        assertFalse(result);
    }
    @Test
    public void testGetTypeDonneeString() {
        String result = Voiture.getTypeDonnee("marque");
        assertEquals("string", result);
    }
    @Test
    public void testGetTypeDonneeEntier() {
        String result = Voiture.getTypeDonnee("id");
        assertEquals("entier", result);
    }
    @Test
    public void testGetTypeDonneeInconnu() {
        String result = Voiture.getTypeDonnee("couleur");
        assertEquals("", result);
    }
    @Test
    public void testGetTypeDonneeNull() {
        String result = Voiture.getTypeDonnee(null);
        assertEquals("", result);
    }
}