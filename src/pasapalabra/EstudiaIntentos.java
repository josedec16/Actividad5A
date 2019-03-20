package pasapalabra;

public class EstudiaIntentos {
    public static String[] palabras = {"deviljin", "unicornio", "fortnite", "auronplay", "Negan", "natural", "Valeria", "piccolo", "Daryl", "tekken", "uncharted", "rodolfo", "viola", "Patrick", "Glenn", "panda"};
    
    public static boolean esCorrecta;
    
    public static String obtenerPalabra(){
        return palabras[(int)(Math.random()*palabras.length)];        
    }
    
    public static String obtenerPalabraOculta(String palabra){
        String oculta = "";
        for (int i=0; i<palabra.length(); i++){
            oculta += "♥";            
        }
        return oculta;
    }
    
    static public String obtenerIntento(String palabra, String palabraEscondida, char ch){
        esCorrecta = false;
        StringBuilder s = new StringBuilder(palabraEscondida);
        for (int i=0; i<palabra.length(); i++){
            if (ch == palabra.charAt(i) && s.charAt(i) == '♥'){
                esCorrecta = true;
                s = s.deleteCharAt(i);
                s = s.insert(i, ch);
            }
        }
        return s.toString();
    }
    
    public static boolean yaEstaEnPalabra(String palabraEscondida, char ch){
        for (int i=0; i<palabraEscondida.length(); i++){
            if (ch == palabraEscondida.charAt(i)) {return true;}
        }
        return false;
    }
}
