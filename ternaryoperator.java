class ternaryoperator {
    public static void main(String args[]) {

        int n = 11;
        int result = 0;

        // if (n % 2 == 0)
        // result = 20;

        // else
        // result = 40;
        // System.out.println(result);

        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);

    }
}