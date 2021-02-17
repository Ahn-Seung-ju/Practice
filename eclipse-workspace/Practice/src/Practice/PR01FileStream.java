package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PR01FileStream {

    public static void main(String[] args) {
        FileInputStream fs = null;
        FileOutputStream fos = null;
        String path = "C:\\Temp1\\b.txt";
        
        try {
                fs = new FileInputStream(path);
                fos = new FileOutputStream("C:\\Temp1\\you dont understand.txt");
                int data = 0;
                while((data = fs.read()) != -1) {
                    //System.out.println("정수: " + data);
                    System.out.print((char)data);
                    
                    fos.write(data);
                }
        }catch (Exception e) {
            e.printStackTrace();
        }
        

    }

}
