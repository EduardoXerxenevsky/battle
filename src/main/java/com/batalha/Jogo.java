package com.batalha;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Jogador> jogadores = new ArrayList<>();

    public Jogo(){
        this.jogadores.add(new Jogador("João", "Guerreiro"));
        this.jogadores.add(new Jogador("Marcelo Taz", "Mago"));

    }
        
    public List<Jogador> getJogadores(){
        return jogadores;
    }

}
