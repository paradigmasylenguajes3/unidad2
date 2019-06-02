package bancos.test;

import bancos.objects.Banco;
import bancos.objects.BancoNacion;
import bancos.objects.BancoPatagonia;

public class BancoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco banco1;
		
		banco1 = new BancoPatagonia();
		System.out.println(BancoPatagonia.CODIGO_BANCARIO);
	    System.out.println(banco1.tasaInteres());
	    
	    System.out.println(banco1.tasaInteresDolar());
	    
	    banco1 = new BancoNacion();
		
	    System.out.println(banco1.tasaInteres());
	    
	    System.out.println(banco1.tasaInteresDolar());

	}

}
