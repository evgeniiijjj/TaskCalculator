public class Main {
    static Ints calculator = new IntsCalculator();

    public static void main(String[] args) {
        int arg1, arg2, res;
        System.out.printf("Проверка работы метода sum:\n%d плюс %d равно %d - %s\n", arg1 = 5, arg2 = 7, res = calculator.sum(arg1, arg2)
                , res == new Calculator().newFormula().addOperand(arg1).addOperand(arg2).calculate(Calculator.Operation.SUM).result());
        System.out.printf("Проверка работы метода mult:\n%d умножить на %d равно %d - %s\n", arg1 = 5, arg2 = 7, res = calculator.mult(arg1, arg2)
                , res == new Calculator().newFormula().addOperand(arg1).addOperand(arg2).calculate(Calculator.Operation.MULT).result());
        System.out.printf("Проверка работы метода pow:\n%d возвести в степень %d равно %d - %s\n", arg1 = 5, arg2 = 7, res = calculator.pow(arg1, arg2)
                , res == new Calculator().newFormula().addOperand(arg1).addOperand(arg2).calculate(Calculator.Operation.POW).result());
    }
}
