package Corrida;

public class Torneio {

    public static void main(String[] args) throws InterruptedException {
        Veiculo carro1 = new Veiculo("Carro 1");
        Veiculo carro2 = new Veiculo("Carro 2");
 
        Corrida corrida = new Corrida(carro1, carro2, 45, 50);
        corrida.simular();
        
    }
}
