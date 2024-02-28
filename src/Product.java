import java.io.Serializable;

public class Product implements Serializable{
    private String name;
    private int cant;
    private String color;

    public Product(String name, int cant, String color){
        this.name = name;
        this.cant = cant;
        this.color = color;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+" "+cant+" "+color;
    }
}
