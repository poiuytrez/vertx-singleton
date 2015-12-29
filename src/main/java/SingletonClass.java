import java.util.Random;

public class SingletonClass {

    private static Integer id = null;

    public static int getId() throws InterruptedException {
        if (id == null) {
            id = new Random().nextInt(1000);
            System.out.println("id = " + id);
        }
        return id;
    }
}
