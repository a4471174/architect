package composite.components;

public class Passwordbox extends  Frame implements Component {
    @Override
    public void print() {
        System.out.println(name);
    }

    private String name;

    public Passwordbox(String name){
        super(name);
        this.name = name;
    }
}