public class Loop3 {
    public static void main(String[] args){
        long i, product = 1;
        for (i = 5; i <= 50; i += 5) {
            product = product * i;
            if (i < 50) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + product);
    }
}
