public class example {

    // Напишите пример перехвата и обработки исключения в блоке try-catch метода.
    public static void main(String[] args){
        int num1, num2;
        try{
            num1 = 2;
            num2 = 34/num1;
            System.out.println(num2);
            System.out.println("Hey I'm at the end of the try block");
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide a number by zero");
        }
    }
}
