package Calculadora;

public class Programa {
		public static void main(String[] args) {
	Calculadora Oper = new Calculadora(9,5);
		System.out.println("Suma = "+Oper.suma());
		System.out.println("Resta = "+ Oper.resta());
		System.out.println("Division = "+ Oper.division());
		System.out.println("Potencia = "+ Oper.potencia());
		System.out.println(Oper.toString());
	}

	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habr�is a�adido.
	//Ejecutadlo.

}
