package lesson4_1_10;

/**
 * Created by dehkon on 08.04.17.
 */
public class lesson4_1_10 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName(){
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        if (stackTraceElements.length < 3){
            return null;
        }
        else{
            return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
        }
    }
    /*
    лучшее решение
       public static String getCallerClassAndMethodName()
    {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements.length < 4 ? null : elements[3].getClassName() + "#" + elements[3].getMethodName();
    }
     */
}
