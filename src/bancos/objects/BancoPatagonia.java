package bancos.objects;

public class BancoPatagonia extends Banco{
	//definicion de una constante
	public final static Integer  CODIGO_BANCARIO = 123;

	@Override
	public Double tasaInteres() {
		
		return 0.60;
	}

	@Override
	public Double tasaInteresDolar() {
		
		return 0.15;
	}

}
