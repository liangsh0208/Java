import java.io.File;
import java.io.FileOutputStream;

import static java.lang.System.out;

public class HelloWorld {
    public static void main(String[] args){
        File file = new File("word.txt");
        if (file.exists()){
            file.delete();
            out.println("文件已删除");
            try{
                file.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            try {
                file.createNewFile();
                out.println("文件已创建");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if (file.exists()){
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            out.println(name);
            out.println(length);
            out.println(hidden);
        }

    }
}

