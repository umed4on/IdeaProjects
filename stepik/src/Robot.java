

/**
 * Created by dehkon on 09.03.2017.
 */
public class Robot {
    int x = 0;
    int y = 0;
    final int kk =0;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    Direction direction = getDirection();

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case LEFT:
                direction = Direction.DOWN;
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        final int p =6;
        int x = robot.getX();
        int y = robot.getY();
        Direction direction = Direction.RIGHT;
        if (toY > y){
            direction = robot.getDirection();
            switch (direction){
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    System.out.println("robot.turnRight()");
                    break;
                case RIGHT:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                case LEFT:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                default:
                    break;

            }
        }
        if(toY < y){
            direction = robot.getDirection();
            switch (direction){
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    System.out.println("robot.turnLeft()");
                    break;
                case RIGHT:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case LEFT:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                default:
                    break;
            }
        }
        int m = toY - y;
        if (m<0) m*=-1;
        for(int i=1 ; i<= m;i++)
        {
            robot.stepForward();
            System.out.println("robot.stepForward()");
        }

        if( toX > x){
            direction = robot.getDirection();
            switch (direction){
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    System.out.println("robot.turnLeft()");
                    break;
                case UP:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case DOWN:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                default:
                    break;
            }
        }
        if (toX < x){
            direction = robot.getDirection();
            switch (direction){
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    System.out.println("robot.turnLeft()");
                    break;
                case DOWN:
                    robot.turnRight();
                    System.out.println("robot.turnRight()");
                    break;
                case UP:
                    robot.turnLeft();
                    System.out.println("robot.turnLeft()");
                    break;
                default:
                    break;
            }
        }
        m = toX - x;
        if (m<0) m*=-1;
        for(int i = 1; i <= m; i++)
        {

            robot.stepForward();
            System.out.println("robot.stepForward()");
        }
    }
}
