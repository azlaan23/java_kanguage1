public class nast_practice {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;

        // outer loop print week
        for (int i = 1; i <= weeks; i++) {
            System.out.println("weeks" + i);

        //inner loop print days
            for (int j = 1; j <= days; j++) {
                System.out.println("days" + j);
            }
        }
    }
}