package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        line = in.nextLine();
        try{
            Checker check = new Checker(line);
            if (check.check_line()){
                throw new Exception("Invalid input parameters");
            }
            else {
                Calculate calc = new Calculate(check);
                calc.makeOperation();
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
