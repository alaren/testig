import java.io.*;

/**
 * Created by bapso on 10.08.2016.
 */
public class FileRead {

    String [] allWords;

    String lastWord = "";

    public void readFile() throws IOException {

        FileReader fileReader = new FileReader("C:/test.txt");
        BufferedReader reader = new BufferedReader(fileReader);;

        StringBuffer sb = new StringBuffer();
        String line = reader.readLine();

        while (line != null){
            sb.append(line);
            line = reader.readLine();
        }

        allWords = sb.toString().split(" ");

        System.out.println(allWords[0]);

        lastWord = allWords[allWords.length - 1];

        reader.close();

    }

    public void random(){
        int random = (int)(Math.random() * allWords.length);

        String rLine = allWords[random];

        System.out.println(rLine);
    }

    public String getLastWord() {
        return lastWord;
    }
}
