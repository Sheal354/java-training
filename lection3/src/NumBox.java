public class NumBox<T extends Number>{
    private T number;

    public NumBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void showClass() {
        System.out.println(number + " - " + number.getClass());
    }
}
