package Model;

/**
 * Created by bruno.devesa on 09-08-2015.
 */
public class MaquinaCafe {

    String marca;
    Cafe cafe;
    TipoCafe tipoCafe;


    public MaquinaCafe(String marca) {
        this.marca = marca;
    }

    public Cafe tirarCafe(Capsula capsula, TipoCafe tipoCafe ){

        cafe = new Cafe(capsula);
        return cafe;
    }
}
