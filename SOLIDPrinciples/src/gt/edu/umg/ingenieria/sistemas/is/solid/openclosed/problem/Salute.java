package gt.edu.umg.ingenieria.sistemas.is.solid.openclosed.problem;

public class Salute {

    public static String salute(String language) {
        switch (language.toUpperCase()) {
            case "SPANISH":
                return "Hola";
            case "ENGLISH":
                return "Hello";
            case "FRENCH":
                return "Salut";
            case "ITALIAN":
                return "Ciao";
            case "GERMAN":
                return "Hallo";
            default:
                return "ERROR: invalid language!!!";
        }
    }

}
