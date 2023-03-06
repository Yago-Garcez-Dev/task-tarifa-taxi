package application;

public class Program {

	public static void main(String[] args) {
		Tarifa tarifa1 = new Tarifa("12:30", DiaDaSemana.SEGUNDA, false, false, 12);						
		System.out.println("****Calculando tarifa da corrida 1.****\n");
		calcularTarifa(tarifa1);
		System.out.println("***Fim do cáluclo da tarifa da corrida 1.****\n");
		
		
		Tarifa tarifa2 = new Tarifa("18:10", DiaDaSemana.QUINTA, false, false, 8);		
		System.out.println("****Calculando tarifa da corrida 2.****\n");
		calcularTarifa(tarifa2);
		System.out.println("***Fim do cáluclo da tarifa da corrida 2.****\n");		
		
		Tarifa tarifa3 = new Tarifa("20:10", DiaDaSemana.SABADO, false, false, 10);		
		System.out.println("****Calculando tarifa da corrida 3.****\n");
		calcularTarifa(tarifa3);
		System.out.println("***Fim do cáluclo da tarifa da corrida 3.****\n");	
		
		Tarifa tarifa4 = new Tarifa("15:00", DiaDaSemana.SEXTA, true, false, 15);		
		System.out.println("****Calculando tarifa da corrida 4.****\n");
		calcularTarifa(tarifa4);
		System.out.println("***Fim do cáluclo da tarifa da corrida 4.****\n");	
		
		Tarifa tarifa5 = new Tarifa("20:30", DiaDaSemana.QUARTA, true, true, 7);		
		System.out.println("****Calculando tarifa da corrida 5.****\n");
		calcularTarifa(tarifa5);
		System.out.println("***Fim do cáluclo da tarifa da corrida 5.****\n");	
	}
	
	public static void calcularTarifa (Tarifa tarifa) {
		Double valorTarifa;
		String []strHoraViagem;
		Integer intHoraViagem; 
		Integer intMinutoViagem;
		
		if (tarifa.isFeriado()) {
			if (tarifa.isNatalouAnoNovo()) {
				valorTarifa = (Tarifa.getValorBase() * tarifa.getKmsRodados()) + (Tarifa.getValorBase() * tarifa.getKmsRodados()) * 0.3;
				System.out.println("Tarifa tipo 5 - O valor final da tarifa é de: R$ " + valorTarifa);
				return;
			}
			
			valorTarifa = (Tarifa.getValorBase() * tarifa.getKmsRodados()) + (Tarifa.getValorBase() * tarifa.getKmsRodados()) * 0.2;
			System.out.println("Tarifa tipo 4 - O valor final da tarifa é de: R$ " + valorTarifa);
			return;
		}
		
		if (tarifa.getDiaDaSemana() == DiaDaSemana.DOMINGO || tarifa.getDiaDaSemana() == DiaDaSemana.SABADO) {
			valorTarifa = (Tarifa.getValorBase() * tarifa.getKmsRodados()) + (Tarifa.getValorBase() * tarifa.getKmsRodados()) * 0.15;
			System.out.println("Tarifa tipo 3 - O valor final da tarifa é de: R$ " + valorTarifa);
			return;
		}
		
		strHoraViagem = tarifa.getHoraViagem().split(":", 2);		
		intHoraViagem = Integer.parseInt(strHoraViagem[0]);
		intMinutoViagem =  Integer.parseInt(strHoraViagem[1]);
		
		if (intHoraViagem >= 6 && intHoraViagem <= 18) {
			if (intHoraViagem >= 18 && intMinutoViagem > 0) {
				valorTarifa = (Tarifa.getValorBase() * tarifa.getKmsRodados()) + (Tarifa.getValorBase() * tarifa.getKmsRodados()) * 0.1;
				System.out.println("Tarifa tipo 2 - O valor final da tarifa é de: R$ " + valorTarifa);
				return;
			}
			valorTarifa = (Tarifa.getValorBase() * tarifa.getKmsRodados() );
			System.out.println("Tarifa tipo 1 - O valor final da tarifa é de: R$ " + valorTarifa);
			return;			
		}
	}
}
