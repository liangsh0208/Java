import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.io.File;

public class Decompressing {
    public static void main(String[] temp){
        ZipInputStream zin;
        try {
            zin = new ZipInputStream(new FileInputStream("hello.zip"));
            ZipEntry entry = zin.getNextEntry();
            while (((entry=zin.getNextEntry()) != null) && ! entry.isDirectory()){
                File file = new File(entry.getName());
                System.out.println(file);
                if (!file.exists()){
                    file.mkdirs();
                    file.createNewFile();
                }
                zin.closeEntry();
                System.out.println(entry.getName()+"解压成功");
            }
            zin.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
