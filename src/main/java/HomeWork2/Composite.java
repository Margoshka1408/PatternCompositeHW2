package HomeWork2;

import java.util.List;

public class Composite {
    public static void main (String[] args) {

        Container container1 = new Container(List.of(new Basket(10)));
        Container container2 = new Container(List.of(new Basket(14)));
        Container container3 = new Container(List.of(new Basket(6),container2));
        Container container4 = new Container(List.of(container1,container2,container3));

        System.out.println(container4.countWeight());

    }
}
