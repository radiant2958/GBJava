package DZ6;



public class Laptop {
    private String brand;
    private String model;
    private Integer ram;
    private Integer storage;
    private String os;
    private int battery;
    private String color;
    private Integer price;
    

    
    public Laptop(String brand,String model,Integer ram, Integer storage, String os, int battery, String color,Integer price){
       
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage=storage;
        this.os = os;
        this.battery = battery;
        this.color = color;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    } 
    public String getModel(){
        return model;
    } 
    public Integer getRAM(){
        return ram;
    } 
    public Integer getStorage(){
        return storage;
    } 
    public String getOS(){
        return os;
    } 
    public int getBattery(){
        return battery;
    } 
    public String getColor(){
        return color;
    } 
    public Integer getprice(){
        return price;
    } 

    




    
}
