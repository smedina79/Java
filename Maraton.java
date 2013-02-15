class Maraton {
	public static void main(String[] args){
		System.out.println("Cuantos participantes son en la Maraton");
		String participantes = System.console().readLine();
		int participantes1 = Integer.parseInt(participantes);
		double [] ctiempos = new double [participantes1];
	
		for (int i = 0; i < ctiempos.length; i++) {
			System.out.println("Tiempo del participante # " + (i+1));
			String tiempos = System.console().readLine();
			double j = Double.parseDouble(tiempos);
			ctiempos [i] = j;
			}
		double mejor1 = 0;
		double mejor2 = 0;

		for (int i = 0; i < ctiempos.length; i++) {
			if(ctiempos[i]>mejor1){
				mejor2=mejor1;
				mejor1=ctiempos[i];
				}
			if(ctiempos[i]< mejor1 && ctiempos[i]> mejor2) {
				mejor2=ctiempos [i];
				}
			}
		System.out.println("El mejor tiempo fue de " + mejor1);
		System.out.println("El segundo mejor tiempo fue de " + mejor2);
	}
}