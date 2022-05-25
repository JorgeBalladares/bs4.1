package com.example.bs41;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuracion {
    String valor1;
    String valor2;

    public Configuracion(String valor1, String valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public Configuracion() {
    }
    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String entraFichero(){
        InputStream entrada;
        Properties propiedadConfig = new Properties();
        try{
            entrada = new FileInputStream("C:\\Users\\jorge.balladares\\Desktop\\bs4.01\\src\\main\\resources\\miconfiguracion.properties");
            propiedadConfig.load(entrada);
            return "valor 1:" + propiedadConfig.getProperty("valor1") + "\n" + "valor 2: " + propiedadConfig.getProperty("valor2");
        }catch (IOException e){
            return "Fallo";
        }
    }
}
