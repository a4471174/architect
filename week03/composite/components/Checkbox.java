package composite.components;

public class Checkbox extends  Frame implements Component {
    @Override
    public void print() {
        System.out.println(name);
    }

    private String name;

    public Checkbox(String name){
        super(name);
        this.name = name;
    }
}
