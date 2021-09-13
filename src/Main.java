public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); //выбрасывается исключение, деление на ноль.
        // можно отработать через try catch, а можно и через тернарный оператор
        // BinaryOperator<Integer>devide = (x, y) -> y == 0 ? y : x / y;

        calc.println.accept(c);
    }
}
