package loom.hola_mundo;

public class HolaMundo {
    public String saludar(final String persona) {   	
    	StringBuilder saludo = new StringBuilder();
    	saludo.append("¡Hola, " );
    	saludo.append(persona);
    	saludo.append("!");
    	return saludo.toString();
    }
}
