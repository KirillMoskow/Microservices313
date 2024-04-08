import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercize{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Чтобы выйти из программы напишите: stop");
        while ((input = scanner.nextLine()) != null && !input.isEmpty()) {
            try {
                if(input.equals("stop")){
                    return;
                }
                System.out.println(calc(input));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            
        }
        scanner.close();
    }

    public static String calc(String input) throws NumberFormatException, IllegalArgumentException{
        String[] symbols = input.split(" ");
        if(symbols.length != 3 || !isValidNumber(symbols[0]) || !isValidNumber(symbols[2]) || isValidOperation(symbols[1])){
            throw new IllegalArgumentException("Неверный формат или операция");
        }

        BigDecimal a = new BigDecimal(symbols[0]);
        BigDecimal b = new BigDecimal(symbols[2]);
        String operator = new String(symbols[1]);
        BigDecimal result;

        switch (operator) {
            case "+":
                result = a.add(b);
                break;
            case "-":
                result = a.subtract(b);
                break;
            case "*":
                result = a.multiply(b);
                break;   
            case "/":
                result = a.divide(b,RoundingMode.FLOOR);
                break;
            default:
                throw new IllegalArgumentException("Неверный знак или формат");
        }
        return result.toString();
    }
    private static boolean isValidNumber(String number){
        try {
            int num = Integer.parseInt(number);
            return num >= 1 && num < 10;
        } catch (Exception e) {
            return false;
        }
        
    }
    private static boolean isValidOperation(String operator){
        if(operator == "+" || operator == "-" || operator == "*" || operator == "/"){
            return true;
        }else{
            return false;
        }
    }
}