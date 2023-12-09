package less7.homework7;

import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerFile {

        public static void logFile(String str){
            Logger logger = Logger.getAnonymousLogger();
            String pathFile = "file.txt";
            String pathLog = "log.txt";
            SimpleFormatter formatter = new SimpleFormatter();
            FileHandler handler = null;
            try {
                handler = new FileHandler(pathLog, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            logger.addHandler(handler);
            handler.setFormatter(formatter);
            try (FileWriter file = new FileWriter(pathFile, true)){
                file.write("\n");
                file.write(str);
                file.flush();
                logger.info("Запись выполнена");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("запись не удалась");
                logger.warning("запись не удалась");
            }
            handler.close();
        }
}
