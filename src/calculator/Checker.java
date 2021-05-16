package calculator;

public class Checker {
    String line;
    String number1, number2, sign;

    public Checker(String inp){
        line = inp;
    }

    public boolean check_line(){
       String[] elements = line.split(" ");
       if (elements.length != 3) return (true);
       number1 = elements[0];
       number2 = elements[2];
       sign = elements[1];
       return check_elements();
    }

    public boolean check_elements(){

        char[] n1 = number1.toCharArray();
        char[] n2 = number2.toCharArray();
        char[] s = sign.toCharArray();
        if (check_number(n1) || check_number(n2)) return (true);
        if (n1[0] == '0' || n2[0] == '0') return (true);
        if ((is_digit(n1[0]) && is_roman(n2[0])) || (is_digit(n2[0]) && is_roman(n1[0]))) return (true);
        if (s.length != 1 && !(is_sign(s[0]))) return (true);
        return check_interval(number1) || check_interval(number2);
    }

    public boolean check_interval(String n) {
        if (is_digit(n.toCharArray()[0])) {
            for (int i = 1; i <= 10; i++) {
                if (n.compareTo(Integer.toString(i)) == 0)
                    return (false);
            }
            return (true);
        }
        return n.compareTo("I") != 0 && n.compareTo("II") != 0 && n.compareTo("III") != 0
                && n.compareTo("IV") != 0 && n.compareTo("V") != 0 && n.compareTo("VI") != 0
                && n.compareTo("VII") != 0 && n.compareTo("VIII") != 0 && n.compareTo("IX") != 0
                && n.compareTo("X") != 0;
    }

    public boolean check_number(char[] n){
        int digit = 0;
        int roman = 0;
        for (int i = 0; i < n.length; i++){
            if (digit < 2 && roman == 0 && is_digit(n[i])) digit++;
            else if (roman < 4 && digit == 0 && is_roman(n[i])) roman++;
            else return (true);
        }
        return (false);
    }

    static boolean is_digit(char symbol){
        return symbol >= '0' && symbol <= '9';
    }

    static boolean is_roman(char symbol){
        return symbol == 'I' || symbol == 'V' || symbol == 'X';
    }

    static boolean is_sign(char symbol){
        return symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/';
    }
}
