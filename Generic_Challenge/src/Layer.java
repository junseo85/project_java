import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable>{
    private List<T> location = new ArrayList<>();
    private String name;

    public Layer(String name) {
        this.name = name;
    }

    public void add(T t){
        location.add(t);
    }
    public void renderLayer(){
        System.out.print(" Render " + name);
        for(T t : location){
            t.render();
        }
    }

}
