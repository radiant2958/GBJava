package DZ5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Пусть дан список сотрудников: 
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, 
// Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
//  Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников,
// Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
public class task2 {
    public static void main(String[] args) {
    
        sortName("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.");
        
    }
    public static void sortName(String listEmployees) {
        String[] list = listEmployees.split("\\s");
        ArrayList<String> listEmp = new ArrayList<>();
        for (int i = 0; i < list.length; i+=2) {
            listEmp.add(list[i]);    
        }
        
        Map<String, Integer> nameCountMap = new HashMap<>();
        for (String name : listEmp) {
            Integer count = nameCountMap.get(name);
            if (count == null) {
                nameCountMap.put(name, 1);
            } else {
                nameCountMap.put(name, count + 1);
            }
        }
        Map<Integer, List<String>> countNameMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            Integer count = entry.getValue();
            String name = entry.getKey();
            List<String> names = countNameMap.get(count);
            if (names == null) {
                names = new ArrayList<>();
                countNameMap.put(count, names);
            }
            names.add(name);
        }
        System.out.print(countNameMap);

    }
}

        
    
    

