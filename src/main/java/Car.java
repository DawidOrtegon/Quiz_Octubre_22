public class Car {

    private int id;
    private String name;
    private int price;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

@Override
    public String toString(){
        StringBuilder bulider = new StringBuilder();
        bulider.append("Car{id= ").append(id).append(", name= ").append(name).append(", price= ").append(price).append("}");
        return bulider.toString();
    }



}
