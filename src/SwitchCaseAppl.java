public class SwitchCaseAppl {

    public static void main(String[] args) {
        calculator(5, 0, 4);
        calculator1(5, 5, 15);

    }

    public static void calculator(double a, double b, int oper) {
        if (oper == 1) {
            System.out.println(a + b);
        }
        if (oper == 2) {
            System.out.println(a - b);
        }
        if (oper == 3) {
            System.out.println(a * b);
        }
        if (oper == 4) {
            System.out.println(a / b);
        }
        if (oper != 1 && oper != 2 && oper != 3 && oper != 4) {
            System.out.println("Wrong operation");
        }
    }

    public static void calculator1(double a, double b, int oper) {
        switch (oper) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong operation");
        }
    }

    public static double calculator2(double a, double b, int oper) {
        if (oper == 1) {
            return a + b;
        }
        if (oper == 2) {
            return a - b;
        }
        if (oper == 3) {
            return a * b;
        }
        if (oper == 4) {
            return a / b;
        }
        if (oper != 1 && oper != 2 && oper != 3 && oper != 4) {
            System.out.println("Wrong operation");
        }
        return a;
    }
}


