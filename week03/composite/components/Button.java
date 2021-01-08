package composite.components;

public class Button implements Component {
    @Override
    public void print() {
        System.out.println(name);
    }

    private String name;

    public Button(String name){
        this.name = name;
    }
}
