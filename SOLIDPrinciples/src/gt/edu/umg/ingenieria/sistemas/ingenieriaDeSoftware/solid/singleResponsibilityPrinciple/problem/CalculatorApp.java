package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.singleResponsibilityPrinciple.problem;

public class CalculatorApp {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Add(1,7) as XML = " + calc.toXML(calc.add(1, 7)));
        System.out.println("Substract(10,4) as HTML = " + calc.toHTML(calc.substract(10,4)));
        System.out.println("Multiply(3,3) as JSON = " + calc.toJSON(calc.multiply(3, 3)));
    }
    
}
