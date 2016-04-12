package javapack;

public class Calculator {
	String uitkomst;
	String foutboodschap;

	public Calculator(String arg1, String arg2, String functie) {

		uitkomst = "";
		foutboodschap = "";

		try {
			double getal1 = Double.parseDouble(arg1);
			double getal2 = Double.parseDouble(arg2);

			if (functie.equals("+")) {
				uitkomst += (getal1 + getal2);
			}
			if (functie.equals("-")) {
				uitkomst += getal1 - getal2;
			}
			if (functie.equals("X")) {
				uitkomst += getal1 * getal2;
			}
			if (functie.equals("/")) {
				uitkomst += getal1 / getal2;
			}

		} catch (NumberFormatException e) {
			foutboodschap = "Voer twee (decimale) getallen in";
		}

	}

	public String getUitkomst() {
		return uitkomst;
	}

	public String getFoutboodschap() {
		return foutboodschap;
	}

}