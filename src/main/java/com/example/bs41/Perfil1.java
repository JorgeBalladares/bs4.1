package com.example.bs41;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "Perfil1")
public class Perfil1 implements Perfiles{
    private String perfil = "perfil1";



    public String getPerfil() {
        return "Estas en perfil1";
    }

    @Override
    public void miFuncion() {
        System.out.println(perfil);
    }
}
