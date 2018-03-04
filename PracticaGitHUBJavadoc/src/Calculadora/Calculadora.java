package Calculadora;

public class Calculadora {
/**
 * Declaramos  op1 y op2
 * @version 04/03/2018  
 */
	double op1;
	double op2;

	public Calculadora(double op1, double op2) {
		/**
		 * Creaccion del constructor
		 * @param op1, op2: los parametros op1 y op2
		 */
		this.op1 = op1;
		this.op2 = op2;

	}
	
	public double suma() {
		/**
		 * muestra la suma
		 * @return op1+op2: muestra la suma de los dos operadores
		 */

		return op1+op2;
	}
	
	
	public double resta() {
		/**
		 * muestra resta
		 * @return op1-op2: muestra resta de los operadores
		 */
		return op1-op2;
		
	}
	
	public double division() {
		
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
			/**
			 * @throw muestra un error si el divisor es 0
			 */
		}
		return op1/op2;
		/**
		 * muestra division del op1 y op2
		 * @return op1/op2: muestra division
		 */
	}
	
	public double potencia() {
		if(op1 == 0) {
			return 1;
				/**
				 * si el resultado es 1 muestre 0
				 */
		}
		if(op2<0) {
			return -Math.pow(op1, op2);
		}
		return Math.pow(op1, op2);
		/**
		 * muestra el numero elevado
		 * @return Math.pow(op1,op2): muestra el numero elevado
		 */
	}

	@Override
	public String toString() {
		return "Calculadora de Sheila[operando1= " + op1 + ", operando2= " + op2 + "]";
		/**
		 * @return muestra el autor de la calculadora y los operadores.
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
