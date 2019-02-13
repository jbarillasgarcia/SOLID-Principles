package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.openClosedPrinciple.solution;

public class SaluteApp {
    
    public static void main(String[] args) {        
        System.out.println("Hello in Spanish is said " + Translator.salute(new SpanishSalute()));
        System.out.println("Hello in English is said " + Translator.salute(new EnglishSalute()));
        System.out.println("Hello in French is said " + Translator.salute(new FrenchSalute()));
        System.out.println("Hello in Italian is said " + Translator.salute(new ItalianSalute()));
        System.out.println("Hello in German is said " + Translator.salute(new GermanSalute()));
    }
    
}
