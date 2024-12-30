import java.util.Scanner;

public class Lection3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("""
                    Выберите операцию:
                    1 - проверка кратности 13
                    2 - нахождение дискриминанта""");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите проверяемое число:");
                    NumBox<Integer> numBox = new NumBox<>(sc.nextInt());
                    numBox.showClass();
                    divisibleBy13(numBox.getNumber(), n -> n % 13 == 0);
                    break;
                case 2:
                    System.out.println("Введите a, b и c:");
                    DoubleBox<Double> doubleBox= new DoubleBox<>(sc.nextDouble(), sc.nextDouble(),
                            sc.nextDouble());
                    doubleBox.showClass();
                    ThreeVariableOperation<Double> tvo = (A, B, C) -> B * 2 - 4 * A * C;
                    System.out.println("D = " + tvo.operation(doubleBox.getFirst(), doubleBox.getSecond(),
                            doubleBox.getThird()));
                    break;
                default:
                    System.out.println("Введен неверный номер операции!");
                    break;
            }
        }

    }

    public static void divisibleBy13(int n, OneVariableOperation<Integer> ovo) {
        if(ovo.operation(n)) {
            System.out.println(n + " кратно 13");
        } else {
            System.out.println(n + " не кратно 13");
        }
    }
}
