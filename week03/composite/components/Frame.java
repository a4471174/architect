package composite.components;

public class Frame extends WindowForm implements Component {
    @Override
    public void print() {
        System.out.println(name);
    }

    private String name;

    public Frame(String name){
        //super(name);
        this.name = name;
    }

    public void add(Frame component) {
        component.print();
    }
}