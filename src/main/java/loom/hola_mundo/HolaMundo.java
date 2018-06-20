package loom.hola_mundo;

/**
  Clase Hola Mundo para Desafio Loom.
  @author Gabriel
 */
public class HolaMundo {
	/**
	  Se encarga de concatenar el nombre a un saludo y devolver el String.
	  @param persona
	  @return saludo
	 */
	public String saludar(final String persona) {
		StringBuilder saludo = new StringBuilder();
		saludo.append("¡Hola, ").append(persona).append("!");

		return saludo.toString();
	}
}
