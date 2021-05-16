package calculator;

public class Roman {
    String s1, s2;
    char sign;
    public Roman(String number1, String number2, char s){
        s1 = number1;
        s2 = number2;
        sign = s;
    }
    public void treatRoman(){
        int n1, n2, result = 0;
        n1 = convertToInt(s1);
        n2 = convertToInt(s2);
        if (sign == '+') result = n1 + n2;
        if (sign == '-') result = n1 - n2;
        if (sign == '*') result = n1 * n2;
        if (sign == '/') result = n1 / n2;
        System.out.println(convertToRoman(result));
    }
    public int convertToInt(String n){
        if (n.compareTo("I") == 0) return 1;
        if (n.compareTo("II") == 0) return 2;
        if (n.compareTo("III") == 0) return 3;
        if (n.compareTo("IV") == 0) return 4;
        if (n.compareTo("V") == 0) return 5;
        if (n.compareTo("VI") == 0) return 6;
        if (n.compareTo("VII") == 0) return 7;
        if (n.compareTo("VIII") == 0) return 8;
        if (n.compareTo("IX") == 0) return 9;
        if (n.compareTo("X") == 0) return 10;
        return 0;
    }
    public String convertToRoman(int n){
        int dozens, units;
        dozens = n / 10;
        units = n % 10;
        return dozensToRoman(dozens).concat(unitsToRoman(units));
    }
    public String dozensToRoman(int d){
        if (d == 1) return "X";
        if (d == 2) return "XX";
        if (d == 3) return "XXX";
        if (d == 4) return "XL";
        if (d == 5) return "L";
        if (d == 6) return "LX";
        if (d == 7) return "LXX";
        if (d == 8) return "LXXX";
        if (d == 9) return "XC";
        if (d == 10) return "C";
        return "";
    }
    public String unitsToRoman(int u){
        if (u == 1) return "I";
        if (u == 2) return "II";
        if (u == 3) return "III";
        if (u == 4) return "IV";
        if (u == 5) return "V";
        if (u == 6) return "VI";
        if (u == 7) return "VII";
        if (u == 8) return "VIII";
        if (u == 9) return "IX";
        return "";
    }
}
