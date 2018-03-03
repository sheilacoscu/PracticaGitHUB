package Calculadora;

public class Calculadora {

	double op1;
	double op2;
	/**
	 * Asignamos los numeros.
	 * @param op1 
	 * @param op2 
	 */
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
		/**
		 * montamos el numero
		 */
	}
	
	public double suma() {
		/**
		 * vamos a sumar operando1 + el operando2 
		 * @return op1 + op2: muestra la suma
		 */
		return op1+op2;
	}
	
	
	public double resta() {
		/**
		 * vamos a restar operando1 - operando2
		 * @return op1-op2: muestra resta
		 */
		return op1-op2;
		
	}
	
	public double division() {
		/**
		 * vamos a dividir el operando1 del operando2
		 * @return op1/op2: muestra division
		 */
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
			/**
			 * @trhow se produce un error si el divide por 0
			 */
		}
		return op1/op2;
		
	}
	
	public double potencia() {
		if(op1 == 0) {
			return 1;
		}
		if(op2<0) {
			return -Math.pow(op1, op2);
		}
		return Math.pow(op1, op2);
		/**
		 *lo elevamos
		 *@return Math.pow(op1, op2): muestra la potencia
		 */
	}

	@Override
	public String toString() {
		return "Calculadora de Sheila[operando1= " + op1 + ", operando2= " + op2 + "]";
		/**
		 * @return muestra el autor y los numeros que estan operando
		 */
	}
	
	
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
