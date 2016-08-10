import java.io.*;

/**
 * Created by bapso on 10.08.2016.
 */
public class Logs {

    File logFile = new File("C:/logstest/logfile.log");

    public void creatLog() throws IOException {
        if (!logFile.exists()){
            logFile.createNewFile();
        }

    }

}
