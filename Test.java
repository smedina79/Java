public class Test{
	public static void main(String[] args){
		String s = System.console().readLine();
		String t = System.console().readLine();
		
		int i = Integer.parseInt(s);
		double j = Double.parseDouble(t);
		
		System.out.println(s+t);// Concatena las dos cadenas = cadena
		System.out.println(i+j);// Suma un entero y un real = real
		System.out.println(s+j);// Concatena una cadena y un real = cadena
		System.out.println(i+t);// Concatena un entero y una cadena = cadena 
		System.out.println(j+s);// Concatena un real y una cadena = cadena
		System.out.println(t+i);// Concatena una cadena y un entero = cadena
		}
}