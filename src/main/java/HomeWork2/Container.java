package HomeWork2;

import java.util.List;

public class Container implements Package{

    private final List<Package> components;

    public Container(List<Package> components){
        this.components=components;
    }

    public void add(Package packagee){
        components.add(packagee);
    }

    public void remove(int index){
        components.remove(index);
    }

    public List<Package> getComponents(){
        return components;
    }

    @Override
    public int countWeight() {
        return components.stream()
                .map(Package::countWeight)
                .mapToInt(Integer::intValue).sum();
    }
}
