public class DoubleBox<T extends Number> extends NumBox<T>{
    private T number2, number3;

    public DoubleBox(T number, T number2, T number3) {
        super(number);
        this.number2 = number2;
        this.number3 = number3;
    }

    public T getFirst() {
        return super.getNumber();
    }

    public T getSecond() {
        return number2;
    }

    public T getThird() {
        return number3;
    }

    @Override
    public void showClass() {
        super.showClass();
        System.out.println(number2 + " - " + number2.getClass());
        System.out.println(number3 + " - " + number3.getClass());
    }
}
