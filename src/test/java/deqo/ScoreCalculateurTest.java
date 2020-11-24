package deqo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import deqo.ScoreCalculateur;



import static org.junit.Assert.assertEquals;

public class ScoreCalculateurTest {

    List<Integer> listeBonnesRep = new ArrayList<Integer>(Arrays.asList(2,3,5));

    QuestionAChoixMultiple q = new QuestionAChoixMultiple("q1",listeBonnesRep);

    @Test
    public void calculeScore0Test() {
        List<Integer> repEtudiant = new ArrayList<Integer>(Arrays.asList(1,4));
        assertEquals("pb DsLe score", 0, ScoreCalculateur.calculeScore(repEtudiant,q),0);
    }

    @Test
    public void calculeScore2OkTest() {
        List<Integer> repEtudiant = new ArrayList<Integer>(Arrays.asList(2,3));
        float result = 2*100 / 3 ;
        assertEquals("pb DsLe score", result, ScoreCalculateur.calculeScore(repEtudiant,q),1);
    }

    @Test
    public void calculeScoreTropTest() {
        List<Integer> repEtudiant = new ArrayList<Integer>(Arrays.asList(1,4,2,3,5));
        assertEquals("pb DsLe score", 0, ScoreCalculateur.calculeScore(repEtudiant,q),0.01);
    }

    @Test
    public void calculeScoreBofTest() {
        List<Integer> repEtudiant = new ArrayList<Integer>(Arrays.asList(1,2,3));
        assertEquals("pb DsLe score", 16.66, ScoreCalculateur.calculeScore(repEtudiant,q),0.01);
    }
}
