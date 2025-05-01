public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Retangulo ===");
        Retangulo ret1 = new Retangulo();
        ret1.setAltura(3);
        ret1.setBase(10);
        System.out.println("Base: " + ret1.getBase() + " Altura: " + ret1.getAltura());
        System.out.println("Area: " + ret1.calculaArea());
        System.out.println("Perimetro: " + ret1.calculaPerimetro());

        System.out.println("=== Circulo ===");
        Circulo c1 = new Circulo();
        c1.setRaio(4);
        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Area: " + c1.calculaArea());
        System.out.println("Perimetro: " + c1.calculaPerimetro());
    }
}
