public class Customer {
    private  String name;
    public String getName(){
        return name;
    }
    Customer(String name){
        this.name=name;
    }
    public String toString(){
        return this.name;
    }
}
