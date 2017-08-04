/**
 * Created by dehkon on 09.03.2017.
 */
public class EnumTest {
    public static void main(String[] args) {
    Direction di = Direction.UP;

        switch (di.ordinal()){
            case 0:
                System.out.println("UP");
                break;
            case 1:
                System.out.println("DOWN");
                break;
            case 2:
                System.out.println("LEFT");
                break;
            case 3:
                System.out.println("RIGHT");
                break;
        }
            //System.out.println(Direction.values());
           // System.out.print(di.ordinal());
           // System.out.println(" " + di.name());


    }
    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
