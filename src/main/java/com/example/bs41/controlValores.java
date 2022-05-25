package com.example.bs41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlValores {
    @Autowired
    Valores valores = new Valores();
    @Autowired
    Perfiles perfiles;

    @GetMapping("/parametro")
    public String getValores(@Value("${url}") String var1,@Value("${password}") String var2){
        valores.setUrl(var1);
        valores.setPassword(var2);
        return "El valor de la url es : " + valores.getUrl() + ", el valor del paasword es: "+ valores.getPassword();
    }

    @GetMapping("/miconfiguracion")
        public String getConfig(Configuracion config){
        return config.entraFichero();
    }

    @GetMapping("/perfil")
    public String getPerfiles(){
        return perfiles.getPerfil();
    }



}
