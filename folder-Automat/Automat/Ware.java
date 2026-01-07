package automat;

public class Ware{
    private int id;
    private String name;
    private int price;
    
    public Ware(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}
