package DZ2;
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class task {

    public static void main(String [] args) {

       
        HashMap<String, String> map = new HashMap<>();
        map.put("age","null");
        map.put("city","Moscow");
        map.put("country","Russia");
        map.put("name", "Ivanov");
        System.out.println(map);
        StringBuilder sb = new StringBuilder("SELECT * FROM students WHERE ");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            if (entry.getValue()!="null"){
                sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append(" AND ");
            } 

        }
        sb.delete(sb.length()-5, sb.length());
        System.out.println(sb);
     
        }
        
    }

        
    
