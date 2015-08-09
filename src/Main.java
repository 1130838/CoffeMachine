import Model.Cafe;
import Model.Capsula;
import Model.MaquinaCafe;
import Model.TipoCafe;

public class Main {

    public static void main(String[] args) {

        MaquinaCafe maquinaCafe = new MaquinaCafe("MMaquina Maravilha");
        Capsula capsula = new Capsula("20/20/2020", "aromatico", 50);

        Cafe cafe = maquinaCafe.tirarCafe(capsula, TipoCafe.NORMAL);

        System.out.println(cafe.getCafe());

    }
}
