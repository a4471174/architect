package composite.components;

public class Textbox extends  Frame implements Component {
    @Override
    public void print() {
        System.out.println(name);
    }

    private String name;

    public Textbox(String name){
        super(name);
        this.name = name;
    }
}