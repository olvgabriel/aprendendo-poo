public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.potencia = 10;
        c1.nome = "Corcel";
        c1.velocidade = 0;
        c1.acelerar();
        c1.imprimir();
    }
}