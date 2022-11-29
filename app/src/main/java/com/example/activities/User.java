package com.example.activities;

import java.io.Serializable;

public class User implements Serializable {
    private final String name;
    private final String apellidos;
    private final char sexo;
    private final String nickname;

    public User(String name, String apellidos, char sexo, String nickname) {
        this.name = name;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNickname() {
        return nickname;
    }
}
