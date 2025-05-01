public class Retangulo implements AreaCalculavel, PerimetroCalculavel {
    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return base * altura;
    }

    public double calculaPerimetro() {
        return base * 2 + altura * 2;
    }
}
