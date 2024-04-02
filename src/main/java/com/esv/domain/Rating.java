package com.esv.domain;

public enum Rating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");
    //enum('G', 'PG', 'PG-13', 'R', 'NC-17')
    private final String value;


    Rating(String value) {
        this.value = value;
    }
}
