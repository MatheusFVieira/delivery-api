package com.delivery.delivery_api;

public class Mensagem {
    private String texto;
    private String autor;

    public Mensagem(String texto, String autor){
        this.texto = texto;
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }
    public String getAutor() {
        return autor;
    }
}
