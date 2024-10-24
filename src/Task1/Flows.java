package Task1;

public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            if (methodC(input) == 10) {
                System.out.println("r");
            }
        }
        System.out.println("s");
    }

    public void methodB(String start) {
        System.out.println("j");
        System.out.println("o");
    }

    public int methodC(String input) {
        System.out.println("v");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        if (number > 5 && number < 20) {
            System.out.println("t");
        }
        else if (number <= 5) {
            System.out.println("a");
            System.out.println("e");
        }
    }


}