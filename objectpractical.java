// class calculator {

//     public int add(int n1, int n2) {
//         int r = n1 + n2;
//         return r;
//     }
// }

// class objectpractical {

//     public static void main(String args[]) {
//         int a = 5;
//         int b = 4;
//         calculator calc = new calculator();
//         int result = calc.add(a, b);
//         System.out.println(result);

//     }

// }

class calculator {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

}

class objetpractical {

    public static void main(String args[]) {

        int num1 = 5;
        int num2 = 9;
        calculator calc = new calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}