package Corrida;

public class Corrida {
	 
    private Veiculo veiculo1;
    private Veiculo veiculo2;
    private int distanciaMax;
    private int larguraPista;
    private String pista;
 
    public Corrida(Veiculo veiculo1, Veiculo veiculo2, int distanciaMax, int larguraPista) {
    	this.pista = "-";
        this.veiculo1 = veiculo1;
        this.veiculo2 = veiculo2;
        this.distanciaMax = distanciaMax;
        this.larguraPista = larguraPista;
    }
 
    public void simular() throws InterruptedException {
        imprimirProgresso();
 
        while (!veiculo1.ganhou(distanciaMax) && !veiculo2.ganhou(distanciaMax)) {
            veiculo1.mover();
            veiculo2.mover();
            imprimirProgresso();
            Thread.sleep(3);
        }
 
        exibirGanhador();
    }
 
    public void imprimirProgresso() {
        String separadorPista = pista.repeat(larguraPista);
        System.out.println(separadorPista);
        veiculo1.exibir(larguraPista);
        veiculo2.exibir(larguraPista);
        System.out.println(separadorPista);
    }
 
    public void exibirGanhador() {
        System.out.println();
        int v1 = veiculo1.getDistancia();
        int v2 = veiculo2.getDistancia();
 
        if (v1 > v2) {
            System.out.println(veiculo1.getNome() + " venceu a corrida!");
        } else if (v2 > v1) {
            System.out.println(veiculo2.getNome() + " venceu a corrida!");
        } else {
            System.out.println("Empate! Os dois veículos chegaram juntos.");
        }
    }
}