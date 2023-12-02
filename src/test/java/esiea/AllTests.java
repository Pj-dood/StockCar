package esiea;
import static org.junit.Assert.*;

import esiea.api.VoitureAPI;
import esiea.dao.ReponseVoiture;
import esiea.dao.VoitureDAO;
import esiea.metier.Voiture;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

public class AllTests {
    private VoitureDAO voitureDAO;
    private VoitureAPI voitureAPI;

    @Before
    public void setUp() {
        voitureAPI = new VoitureAPI();
        voitureDAO = new VoitureDAO();
    }
    @Test
    public void testAjouterVoiture() {
        // Test pour la méthode ajouterVoiture
        String jsonInput = "{\"marque\": \"Toyota\", \"modele\": \"Corolla\", \"carburant\": \"Essence\", \"km\": 50000, \"annee\": 2020, \"prix\": 15000}";
        String result = voitureAPI.ajouterVoiture(jsonInput);
        // Vérifiez ici que le résultat est conforme à vos attentes
        // Utilisez des assertions pour valider le succès de l'ajout.
    }
    @Test
    public void testSupprimerVoiture() {
        // Test pour la méthode supprimerVoiture
        String voitureId = "1"; // Remplacez par un ID valide
        String result = voitureAPI.supprimerVoiture(voitureId);
        // Vérifiez ici que le résultat est conforme à vos attentes
        // Utilisez des assertions pour valider le succès de la suppression.
    }
    @Test
    public void testRechercherVoitures() {
        // Test pour la méthode rechercherVoitures
        String saisie = "Toyota"; // Remplacez par une valeur de recherche valide
        int mini = 0; // Remplacez par une valeur de recherche valide
        int nbVoitures = 10; // Remplacez par une valeur de recherche valide

        try {
            ReponseVoiture reponse = voitureDAO.rechercherVoitures(saisie, mini, nbVoitures);
            Voiture[] voitures = reponse.getData();
            // Vérifiez ici que les résultats correspondent à vos attentes.
            // Vous pouvez utiliser des assertions pour vérifier les attributs des voitures.
        } catch (SQLException e) {
            fail("Erreur lors de la recherche de voitures : " + e.getMessage());
        }
    }
    @Test
    public void testCheckValidData() {
        // Test pour la méthode check avec des données valides
        Voiture voiture = new Voiture();
        voiture.setId(1);
        voiture.setMarque("Toyota");
        voiture.setModele("Corolla");
        voiture.setFinition("Luxe");
        voiture.setCarburant(Voiture.Carburant.DIESEL);
        voiture.setKm(50000);
        voiture.setAnnee(2020);
        voiture.setPrix(15000);
        assertTrue(voiture.check()); // Les données sont valides, la vérification doit renvoyer true.
    }
    @Test
    public void testGetToutesVoitures() {
        // Test pour la méthode getToutesVoitures
        int mini = 0; // Remplacez par une valeur valide
        int nbVoitures = 10; // Remplacez par une valeur valide
        ReponseVoiture result = voitureAPI.getToutesVoitures(mini, nbVoitures);
        // Vérifiez ici que le résultat est conforme à vos attentes
        // Utilisez des assertions pour valider la réponse.
    }

}
