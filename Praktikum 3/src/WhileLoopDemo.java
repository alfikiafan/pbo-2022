import java.util.concurrent.TimeUnit;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 3;
        while (i <= 300) {
            System.out.println("Hello ke-" + i);
            i += 3;
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}