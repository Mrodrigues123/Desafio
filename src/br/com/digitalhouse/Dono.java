package br.com.digitalhouse;

import sun.plugin2.message.GetAppletMessage;

public class Dono {
    private String nome;
    public String sexo;

    //construtor especifico
    public Dono(String novoNome){
    nome = novoNome;

    }

    //Construtor padrao
    public Dono(){


    }

    //alimentar
    public void alimentar(Cachorro cachorro) {
        System.out.println("Olá " + cachorro.nome);
    }

    //Get - Acessor
    public String getNome() {
        return nome;
    }

    //set - Modificador
    public void setNome(String novoNome) {
        nome = novoNome;
    }

}
