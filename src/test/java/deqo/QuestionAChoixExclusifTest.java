package deqo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionAChoixExclusifTest {
    @Test
    public void getEnonceTest() {
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("L'énoncé de la question",3);

        assertEquals("getEnonce() : pb", "L'énoncé de la question", q.getEnonce());
    }
}
