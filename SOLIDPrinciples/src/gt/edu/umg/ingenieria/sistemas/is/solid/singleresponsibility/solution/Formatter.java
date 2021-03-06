package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.solution;

public class Formatter {
    
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
