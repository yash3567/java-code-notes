
class whileloop {
    public static void main(String args[]) {

        int i = 1;
        while (i <= 4) {
            System.out.println("hello" + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("bye" + j);
                j++;
            }
            // i++;
        }
        System.out.println("hi" + i);

    }
}