package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.singleResponsibilityPrinciple.solution;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Formatter fmt = new Formatter();
        
        System.out.println("Add(1,7) as XML = " + fmt.toXML(calc.add(1, 7)));
        System.out.println("Substract(10,4) as HTML = " + fmt.toHTML(calc.substract(10,4)));
        System.out.println("Multiply(3,3) as JSON = " + fmt.toJSON(calc.multiply(3, 3)));
    }
    
}
