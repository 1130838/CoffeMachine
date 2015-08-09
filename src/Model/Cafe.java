package Model;

/**
 * Created by bruno.devesa on 09-08-2015.
 */
public class Cafe {

    Capsula capsula;

    public Cafe(Capsula capsula) {
        this.capsula = capsula;
    }

    public String getCafe(){
        return "hello, i'm a coffe " + capsula.aroma;
    }
}
