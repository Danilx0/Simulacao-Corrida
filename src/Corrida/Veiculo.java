package Corrida;

import java.util.Random;

public class Veiculo {
 
    private String nome;
    private int velocidade;
    private int distancia;
    private Random random;
 
    public Veiculo(String nome) {
        this.nome = nome;
        this.velocidade = 0;
        this.distancia = 0;
        this.random = new Random();
    }
 
    public void mover() {
        this.velocidade = random.nextInt(3) + 1;
        this.distancia += this.velocidade;
    }
 
    public boolean ganhou(int distanciaMaxima) {
        return this.distancia >= distanciaMaxima;
    }
 
    public void exibir(int larguraPista) {
        int pos = Math.min(this.distancia, larguraPista - 1);
        System.out.println(" ".repeat(pos) + "#");
    }
 
    public String getNome() {
        return nome;
    }
 
    public int getDistancia() {
        return distancia;
    }
}