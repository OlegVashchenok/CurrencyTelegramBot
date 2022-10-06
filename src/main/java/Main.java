import parser.CurrencyParser;

public class Main {
    public static void main(String[] args) {
       var currency =  new CurrencyParser().getCurrentCurrentUSD();
        System.out.println(currency);
    }
}
