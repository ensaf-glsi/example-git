import model.Client;
import model.Personne;

public class Main {

    public static void main(String []args) {
        Personne p = new Personne();
        System.out.println(p);
    }
    
    void fct2() {
        System.out.println(new Personne());
        System.out.println(new Client());
    }
}
