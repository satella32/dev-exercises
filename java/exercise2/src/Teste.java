public class Teste {
    public static void main(String[] args) throws Exception {
        Carro tesla = new Carro();
        tesla.ligar();
        tesla.mover();
        tesla.parar();
        tesla.desligar();

        Bicicleta aro = new Bicicleta();
        aro.mover();
        aro.parar();
    }
}
