// Вывести все простые числа от 1 до 1000 

public class homework02 {
   public static void main(String[] arg) {
    for (int i = 0; i < 1000; i++) {
        int res=i;
        if (res==3 | res==2){
            res=i;
            
        }
        else{
            if(i%2!=0 & i%3!=0 ){
                for (int j = 7; j < 32; j++) {
                    if (i%j==0 & i/j!=1) {
                        res=0;
                        break;
                    }
                }}
            else{
                res=0;
            }
        }

        if(res!=0){
            System.out.println(res);
        }
        
        
    }

    
   }
    
}
