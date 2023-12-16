package HomeWork2;

public class Basket implements Package{

    private int weight;

    public Basket(int weight){
        this.weight=weight;
    }

    @Override
    public int countWeight() {
        return weight;
    }
}
