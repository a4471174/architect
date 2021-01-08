package composite.components;

public class Label extends  Frame implements Component {
    @Override
    public void print() {
        System.out.println(name);
    }

    private String name;

    public Label(String name){
        super(name);
        this.name = name;
    }
}

