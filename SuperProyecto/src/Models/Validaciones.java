package Models;

import javax.swing.JOptionPane;

public class Validaciones {

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	static public String validarNombre(String nombre) {

		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		if (nombre.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Debes escribir un nombre");
			return "0";
		}
		for (int i = 0; i < nombre.length() - 1; i++) {
			for (int j = 0; j < nombre.length(); j++) {
				if (nombre.charAt(i) == c[j]) {

					JOptionPane.showMessageDialog(null, "Debes escribir un nombre");
					return "0";

				}

			}

		}

		return nombre;
	}

	/**
	 * 
	 * @param apellido
	 * @return
	 */
	static public String apellido1(String apellido) {
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		if (apellido.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Debes escribir un Apellido");
			return "0";
		}
		for (int i = 0; i < apellido.length() - 1; i++) {
			for (int j = 0; j < apellido.length(); j++) {
				if (apellido.charAt(i) == c[j]) {

					JOptionPane.showMessageDialog(null, "Debes escribir un Apellido que no contenga numeros");
					return "0";

				}

			}
		}

		return apellido;

	}

	/**
	 * 
	 * @param apellido
	 * @return
	 */
	static public String apellido2(String apellido) {
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		if (apellido.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Debes escribir un Apellido");
			return "0";
		}
		for (int i = 0; i < apellido.length() - 1; i++) {
			for (int j = 0; j < apellido.length(); j++) {
				if (apellido.charAt(i) == c[j]) {

					JOptionPane.showMessageDialog(null, "Debes escribir un Apellido que no contenga numeros");
					return "0";

				}

			}
		}

		return apellido;

	}

	/**
	 * Validacion dni
	 * 
	 * @param nDni
	 *            numero dni
	 * @param letra
	 *            es la letra del dni
	 * @return el String dni si es correcto;
	 */
	static public String validarDni(String nDni, String letra) {
		boolean escorrecto = true;
		int dni = 0;
		String dni1;
		String letrasdni = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (nDni.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debes introducir un dni");
			escorrecto = false;
		}
		if (nDni.length() != 8) {
			JOptionPane.showMessageDialog(null, "El dni debe contener 8 digitos");
			escorrecto = false;
		}
		if (letra.isEmpty()) {
			JOptionPane.showMessageDialog(null, "El dni debe contener 9 digitos");
			escorrecto = false;
		}
		if (letra.length() != 1) {
			JOptionPane.showMessageDialog(null, "La letra debe ser 1 sola");
			escorrecto = false;
		}

		try {
			dni = Integer.parseInt(nDni);

		} catch (Exception ee) {

			JOptionPane.showMessageDialog(null, "El numero de dni debe ser numerico");
			escorrecto = false;
		}

		for (int i = 0; i < letrasdni.length(); i++) {

			if (letra.toUpperCase().equals(letrasdni.charAt(i))) {
				dni1 = dni + letra;
				return dni1;
			}
		}

		return "false";

	}

}
