package loom.hola_mundo;

public class HolaMundo {

    public String saludar(final String persona) {
    	
    	return new StringBuilder().append("¡Hola, " ).append(persona).append("!").toString();
    	
       // throw new RuntimeException("¡Implementar este método!");
    }
}
