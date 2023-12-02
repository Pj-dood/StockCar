package esiea.dao;

import esiea.metier.Voiture;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class VoitureDAOTest extends TestCase {

    private VoitureDAO voitureDAO;

    @Before
    public void setUp() {
        voitureDAO = new VoitureDAO();
    }


    @Test
    public void testAjouterVoiture() {
        Voiture voiture = new Voiture();
        voiture.setMarque("TestMarque");
        voiture.setModele("TestModele");
        // Set d'autres attributs de la voiture...

        try {
            voitureDAO.ajouterVoiture(voiture);
            // V�rifiez ici si l'ajout s'est d�roul� comme pr�vu (par exemple, v�rifiez la base de donn�es).
        } catch (SQLException e) {
            e.printStackTrace();
            fail("L'ajout de la voiture a �chou� : " + e.getMessage());
        }
    }

}