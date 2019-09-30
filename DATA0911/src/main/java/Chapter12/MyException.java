package Chapter12;

public class MyException extends Exception {
    String message;
    public MyException(String ErrorMessage){ //构造方法
        //super(ErrorMessage); //父类构造方法
        message = ErrorMessage;
    }
    public String getMessage(){
        return message;
    }
}
