package esiea.api;

import esiea.dao.ReponseVoiture;
import esiea.dao.VoitureDAO;
import esiea.metier.Voiture;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class VoitureAPITest {
    @Test
    public void testGetVoituresJson() {
        VoitureAPI api = new VoitureAPI();

    }


    @Test
    public void testGetReponse() throws SQLException {
        // Cr�ez une instance de la classe contenant la m�thode getReponse
        VoitureDAO vDao = new VoitureDAO();

        ReponseVoiture ret = new ReponseVoiture(); // Remplacez "VotreClasse" par le nom de votre classe

        // Appelez la m�thode getReponse avec des param�tres appropri�s
        ReponseVoiture resultat = vDao.rechercherVoitures("param�tre", 10, 5);

        // Effectuez les assertions pour v�rifier le comportement attendu
        // Par exemple, v�rifiez si l'objet ReponseVoiture retourn� est correct
        assertNotNull(resultat);
        // Ajoutez d'autres assertions en fonction de vos besoins
    }
}