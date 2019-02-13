package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.problem;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int substract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        return a / b;
    }
    
    public String toXML(int result) {
        return "<result>"
                + result
                + "</result>";
    }
    
    public String toHTML(int result) {
        return "<html>"
                + "<body>"
                + "<p>"
                + result
                + "</p>"
                + "</body>"
                + "</html>";
    }
    
    public String toJSON(int result) {
        return "{"
                + "\"result\":"
                + result
                + "}";
    }
    
}
