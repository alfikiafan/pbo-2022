public class Loop2 {
    public static void main(String[] args){
        int i, total = 0;
        for (i = 2; i <= 100; i += 2) {
            total += i;
            if (i < 100) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + total);
    }
}