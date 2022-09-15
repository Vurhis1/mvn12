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
    @Test
    public void shouldLast10Films() {
        Afisha afisha = new Afisha();

        afisha.addFilm("Film 1");
        afisha.addFilm("Film 2");
        afisha.addFilm("Film 3");
        afisha.addFilm("Film 4");
        afisha.addFilm("Film 5");
        afisha.addFilm("Film 6");
        afisha.addFilm("Film 7");
        afisha.addFilm("Film 8");
        afisha.addFilm("Film 9");
        afisha.addFilm("Film 10");

        String[] actual = afisha.findLast();
        String[] expected = {
                "Film 10","Film 9","Film 8","Film 7","Film 6","Film 5","Film 4","Film 3","Film 2","Film 1"
        };

        Assertions.assertArrayEquals(actual,expected);
    }
}

