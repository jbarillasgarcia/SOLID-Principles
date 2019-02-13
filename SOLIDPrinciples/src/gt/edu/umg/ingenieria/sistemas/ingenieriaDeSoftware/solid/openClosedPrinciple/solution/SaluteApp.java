package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.openClosedPrinciple.solution;

public class SaluteApp {
    
    public static void main(String[] args) {
        Translator translator = new Translator();
        
        System.out.println("Hello in Spanish is said " + translator.salute(new SpanishSalute()));
        System.out.println("Hello in English is said " + translator.salute(new EnglishSalute()));
        System.out.println("Hello in French is said " + translator.salute(new FrenchSalute()));
        System.out.println("Hello in Italian is said " + translator.salute(new ItalianSalute()));
        System.out.println("Hello in German is said " + translator.salute(new GermanSalute()));
    }
    
}
