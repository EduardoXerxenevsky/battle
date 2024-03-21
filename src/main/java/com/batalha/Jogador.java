package com.batalha;
import java.util.Random;
public class Jogador {

    private String nome;
    private int xp;
    private int hp = 100;
    private boolean envenenado = true;
    private boolean temAntidoto;
    private String classe;
    
    public Jogador() {
    }

    public Jogador(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void receberDano(int pontos){
        this.hp -= pontos;
    }

    public void receberCura(int pontos){
        this.hp += pontos;
    }

    public void ganharExperiencia(int pontos){
        this.xp += pontos;
    }

    public void receberAntidoto(){
        envenenado = !envenenado;
        
    }

    public String getNome() {
        return nome;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void atacar(Jogador jogador) {
        jogador.hp = jogador.hp-this.xp;
        this.xp++;
    }

    public void curar(Jogador jogador) {
        this.hp = this.hp+5;
        Random rand = new Random();
        int chance = rand.nextInt(10);
        System.out.println(chance);
        if(chance==0){
            this.guardarAntidoto();
        }

    }

    private void guardarAntidoto() {
        temAntidoto = true;
    }

    public void darAntidoto(Jogador jogador) {
        if(temAntidoto) {
            jogador.receberCura(5);
        this.temAntidoto = false;
        jogador.envenenado =false;
    }
    }

    public boolean temAntidoto() {
        if(temAntidoto) return true;
        return false;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    
    



    


    
}
