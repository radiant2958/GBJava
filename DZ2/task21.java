package DZ2;
import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;
public class task21 {

    public static void main(String[] args) {
        int [] array = new int[]{4,8,3,7,5,1};
        Logger logger = Logger.getLogger("my_log");
        try {
            FileHandler fh = new FileHandler("mylog.log");
            SimpleFormatter format = new SimpleFormatter();
            fh.setFormatter(format);
            logger.addHandler(fh);
            logger.setLevel(Level.INFO);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length-1; j++) {
                    if (array[j]>array[j+1]) {
                        int el=array[j];
                        array[j]=array[j+1];
                        array[j+1]=el;}
                }
                logger.info("Итерация"+(i+1)+": "+Arrays.toString(array));

            }
            Handler[] handlers = logger.getHandlers();
            for (Handler handler : handlers) {
                handler.close();
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        
    }
    
}
