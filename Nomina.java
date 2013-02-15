class Nomina {
	public static void main(String[] arguments) {
		System.out.println("Ingrese el salario base");
		String s = System.console().readLine();
		System.out.println("Ingrese la cantidad de horas trabajadas");
		String t = System.console().readLine();
		
		int horas = Integer.parseInt(t);
		double salario = Double.parseDouble(s);

		if (salario < 8.0) {
			System.out.println("Debe pagar mas de $8.00 por hora");
		} else if (horas > 60) {
			System.out.println("No puede trabajar mas de 60 horas a la semana");
		} else {
			int horasextra = 0;
		if (horas > 40) {
			horasextra = horas -40;
			horas = 40;
		 }
			double pago = salario * horas;
			double extras = salario * 1.5 * horasextra;
			pago = pago + horasextra * salario * 1.5;
			System.out.println("Pague a este empleado $" + pago);
			
	}

	}
}