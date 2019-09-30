package Chapter14;

public class UpdateStu implements Comparable<Object> {
    String name;
    long id;
    public UpdateStu(String name, long id){
        this.id = id;
        this.name = name;
    }
    public int compareTo(Object o){
        UpdateStu upstu = (UpdateStu) o;
        int result = id >upstu.id ? 1: (id == upstu.id ? 0:-1); //双层的比较条件
        return result;
    }
    public static void main
}
