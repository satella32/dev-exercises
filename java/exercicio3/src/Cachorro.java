public class Cachorro extends Animal implements Adestramento {
    
    public void sentar() {
        System.out.println(nome +", senta! ");
    }

    public void ficar() {
        System.out.println(nome +", fica! ");
    }

    public void deitar() {
        System.out.println(nome +", deita! ");
    }

}