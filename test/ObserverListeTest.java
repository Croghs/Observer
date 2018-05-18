import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class ObserverListeTest {

    @Test
    void observerTestListe() {
        ObserverListe o = new ObserverListe(5);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        // Show what happened
        System.out.println("Here: " + baos.toString());
        o.obsList.add("E");
        System.out.flush();
        System.setOut(old);
        assertTrue(baos.toString() == "Es wurde etwas hinzugefügt: E. ");
    }
}