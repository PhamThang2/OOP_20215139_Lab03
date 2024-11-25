import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String fileName = "text.exe";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(fileName));
        startTime = System.currentTimeMillis();
        // String outputString = "";
        // for(byte b: inputBytes) {
        //     outputString += (char)b;
        // }
        StringBuffer outputStringBuffer = new StringBuffer();
        for(byte b: inputBytes) {
            outputStringBuffer.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
