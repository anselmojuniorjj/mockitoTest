public class Example3 {
    public void methodOne(int parameter){
        int number = parameter * 2;
        methodTwo(number);
    }

    protected void methodTwo(int number){
        int numberTwo = number * 2;
    }
}
