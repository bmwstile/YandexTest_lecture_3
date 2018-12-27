package stepDefinition;
import cucumber.api.java.ru.*;

public class TestSteps {

    private int a, b, sum;
    private String firstNumber, secondNumber;

    @И("вводим первое число {string}")
    public void вводим_Первое_Число(String num1) {
            firstNumber = num1;
            System.out.println("Первое число: " + firstNumber);
    }

    @И("вводим второе число {string}")
    public void вводим_Второе_Число(String num2) {
            secondNumber = num2;
            System.out.println("Второе число: " + secondNumber);
    }

    @И("складываем два числа")
    public void складываем_два_числа() {
        a = Integer.parseInt(firstNumber);
        b = Integer.parseInt(secondNumber);
        sum = a + b;
    }

    @И("^выводим результат на экран$")
    public void выводим_результат_на_экран() {
        System.out.println("Результат сложения двух чисел: " + sum);
    }



}