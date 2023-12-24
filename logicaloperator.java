class logicaloperator {
    public static void main(String args[]) {

        int x = 8;
        int y = 5;
        int a = 6;
        int b = 7;

        boolean result = x < y;
        boolean res = x > y && a < b;
        System.out.println(result);
        System.out.println(res);
    }
}