package cursojava.executavel;
import java.lang.*;

public class PrimeiroProgramaJava {
	public static void main(String[] args) {

	double[] valores = new double[5];
		
	valores [0] = 0.1;
	valores [1] = 0.5;
	valores [2] = 0.7;
	valores [3] = 0.9;
	valores [4] = 2.1;
		
	// Como mostrar todos os elementos do Array?
for (double elemento: valores) {
	System.out.println(elemento);
}

	// Como somar todos os elementos?
double total = 0;
for (int i = 0; i < valores.length; i++) {
	total += valores[i];
}
System.out.println("O total é " + total);

	}
}
