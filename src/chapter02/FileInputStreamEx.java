package chapter02;

import java.io.FileOutputStream;

public class FileInputStreamEx {
        byte b[] = new byte [6]
        try {
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]);

            fout.close();
        } catch(IOException e) { }
            System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
    }
}
