//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Park park = new Park(10, 20);
            Layer<Park> layer = new Layer<>("National park");
            layer.add(park);
            layer.renderLayer();

            River river = new River(10, 20);
            Layer<River> layer2 = new Layer<>("River");
            layer2.add(river);
            layer2.renderLayer();
        }
}