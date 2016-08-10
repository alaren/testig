import java.io.*;

/**
 * Created by bapso on 10.08.2016.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        FileRead fileRead = new FileRead();
        Logs logs = new Logs();

        logs.creatLog();

        try {
            fileRead.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] commands = {"\"Stop talking\"", "\"Start talkin\"", "\"Goodbye\""};

        while (true){
            String command = reader.readLine();

            if(command.equals(commands[0])){
                System.out.println("Stop");
                while (true){
                    String s = reader.readLine();
                    if (s.equals(commands[1])){
                        System.out.println("Starting");
                        break;
                    }
                    else {
                        continue;
                    }
                }
            }

            else if(command.equals(commands[2])){
                System.out.println(fileRead.getLastWord());
                break;
            }
            else {
                fileRead.random();
            }

        }
    }
}
