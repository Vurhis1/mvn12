package ru.netology.mvn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void shouldAddFilm() {
        Afisha afisha = new Afisha();

        afisha.addFilm("Film 1");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 3");

        String[] actual = afisha.findAll();
        String[] expected = {"Film 1","Film 2","Film 3"};

        Assertions.assertArrayEquals(actual,expected);
    }
}

