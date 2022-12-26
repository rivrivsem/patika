package patikaDesignPattern;

public class MainTax {
    public static void main(String[] args) {

        TaxCalculator calculator=getCalculator();
        calculator.calculateTax();
    }
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2022();

    }
}
