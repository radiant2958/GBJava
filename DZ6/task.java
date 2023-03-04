package DZ6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
public class task {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Apple","MacBook Air", 16,512,"macos",35000, "black", 99000));
        laptops.add(new Laptop("Apple","MacBook Pro", 32,1024,"macos",50000, "gray", 256000));
        laptops.add(new Laptop("Samsung","P400", 8,256,"windows",20000, "red", 45000));
        laptops.add(new Laptop("Samsung","P50", 16,512,"windows",30000, "gray", 85000));
        laptops.add(new Laptop("Samsung","P580 Pro", 32,1024,"windows",40000, "black", 113457));
        laptops.add(new Laptop("Lenovo","Yoga Slim 7 Pro Gen 7", 32,1024,"windows",30000, "silver", 154432));
        laptops.add(new Laptop("Lenovo","IdeaPad ", 8,512,"windows",20000, "white", 64730));
        laptops.add(new Laptop("Lenovo","V15", 8,256,"windows",15000, "red", 43000));
        laptops.add(new Laptop("Apple","MacBook Air", 32,2048,"macos",50000, "silver", 185980));
       
    
        
        filterLaptops(laptops);
        
    
        
    }

    private static void filterLaptops (List<Laptop> laptops) {
        List<Laptop> laptopfilter = new ArrayList<>();
        Map<String, Object> filter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите критерий фильтрации ram, storage, os, color и их значение через запятую");
        
        String filteString = scanner.nextLine();
        String[]filterArray = filteString.split(",");
        for (String string : filterArray) {
            String[] filterMap = string.split(" ");
            String key = filterMap[0].toLowerCase();
            Object value = filterMap[1];
            if (key.equals("ram") || key.equals("storage")) {
                value = Integer.parseInt(filterMap[1]);
            }
            filter.put(key, value);
    
        }
        for (Laptop laptop : laptops) {
            if ((filter.get("ram") == null || filter.get("ram").equals(laptop.getRAM())) &&
                (filter.get("storage") == null || filter.get("storage").equals(laptop.getStorage())) &&
                (filter.get("os") == null || filter.get("os").equals(laptop.getOS())) &&
                (filter.get("color") == null || filter.get("color").equals(laptop.getColor()))) {
                laptopfilter.add(laptop);
                System.out.print(laptop.getBrand() + ", МОДЕЛЬ: " + laptop.getModel() + ", RAM: " + laptop.getRAM() + 
                ", STORAGE: " + laptop.getStorage() + ", OS: " + laptop.getOS() + ", COLOR: " + laptop.getColor() + 
                ", PRICE(rub): " + laptop.getprice()+"\n");
            }
            
            
        }
        System.out.println("Введите минимальные значения критериев фильтра ram, storage, price через запятую");
        String minValue = scanner.nextLine();
        String[] minValueArray = minValue.split(",");
        Map<String,Integer> minValueMap = new HashMap<>();
       
        for (String string : minValueArray) {
            String[] filterMin = string.split(" ");
            String key = filterMin[0].toLowerCase();
            Integer value = Integer.parseInt(filterMin[1]);
            minValueMap.put(key,value);   
        }
        for (Laptop laptop : laptops) {
            if ((laptop.getRAM() >= minValueMap.getOrDefault("ram",0)) &&
                (laptop.getStorage() >= minValueMap.getOrDefault("storage",0)) &&
                (laptop.getprice() >= minValueMap.getOrDefault("price",0))) {
                System.out.print(laptop.getBrand() + ", МОДЕЛЬ: " + laptop.getModel() + ", RAM: " + laptop.getRAM() + 
                ", STORAGE: " + laptop.getStorage() + ", OS: " + laptop.getOS() + ", COLOR: " + laptop.getColor() + 
                ", PRICE(rub): " + laptop.getprice()+"\n");
                
            }
            
        }

        
    }
  

    
}
