package Chapter12;
import static java.lang.System.out;
public class Baulk {
    public static void main(String[] args){
        try {
            String str = "lili";
            out.println(str+"年龄是: ");
            int age = Integer.parseInt("20L");
            out.println(age);
        } catch (Exception e){
            //e.printStackTrace();
            out.println(e.getMessage());
            out.println(e.toString());
        }
        out.println("program over");
    }
}
