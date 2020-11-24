package deqo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionAChoixMultipleTest {

    Integer[] tabRep = {2,4,8};
    List<Integer> listeBonnesRep = Arrays.asList(tabRep);

    QuestionAChoixMultiple q = new QuestionAChoixMultiple("L'énoncé de la question",listeBonnesRep);
    @Test
    public void getEnonceTest() {

        assertEquals("getEnonce() : pb", "L'énoncé de la question", q.getEnonce());
    }
     @Test public void getScoreForIndiceTest() {
         assertEquals("Devrait retourner autre chose", 100f / 3, q.getScoreForIndice(2),0);

         assertEquals("pb", 0, q.getScoreForIndice(11),0);
     }
}
