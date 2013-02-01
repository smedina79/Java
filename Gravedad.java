class Gravedad {
	public static void main(String[] args){
		System.out.println("Ingrese la velocidad inicial");
		String v = System.console().readLine();
		double vi = Double.parseDouble(v);
		System.out.println("Ingrese la posicion inicial");
		String x = System.console().readLine();
		double xi = Double.parseDouble(x);
		System.out.println("Ingrese el segundo de posicion de la caida");
		String t = System.console().readLine();
		double ti = Double.parseDouble(t);
		double a = -9.81;
		double xf = 0.5*a*ti*ti;
		xf = xf+vi*ti;
		xf = xf+xi;
		System.out.println("La posicion del objeto luego de "+ti+" segundos, es de "+xf+" m.");
	}
}