package ru.netology.mvn;

public class Afisha {
    private String[] films = new String[0];
    private int limit;

    public Afisha() {
        limit = 10;
    }

    public Afisha(int limit) {
        this.limit = limit;
    }

    public void addFilm (String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
            tmp[tmp.length - 1] = film;
            films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast(){

        int length;
        if(films.length < limit) {
            length = films.length;
        } else {
            length = limit;
        }

        String[] tmp = new String[10];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}