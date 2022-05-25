package com.example.bs41;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "Perfil2")

public class Perfil2 implements Perfiles{
    private String perfil = "perfil2";

    public String getPerfil() {
        return "Estas en perfil2";
    }

    @Override
    public void miFuncion() {
        System.out.println(perfil);
    }
}
