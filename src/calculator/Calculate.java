package calculator;

public class Calculate {
    String number1, number2;
    char sign;
    public Calculate(Checker check){
        number1 = check.number1;
        number2 = check.number2;
        sign = check.sign.toCharArray()[0];
    }
    public void makeOperation(){
        System.out.println("Output:");
        if (number1.toCharArray()[0] > '0' && number1.toCharArray()[0] <= '9'){
            int n1 = Integer.parseInt(number1), n2 = Integer.parseInt(number2);
            if (sign == '+') System.out.println(n1 + n2);
            else if (sign == '-') System.out.println(n1 - n2);
            else if (sign == '*') System.out.println(n1 * n2);
            else if (sign == '/') System.out.println(n1 / n2);
        }
        else{
            Roman rom = new Roman(number1, number2, sign);
            rom.treatRoman();
        }
    }
}
