package arbolBinario;
import java.util.Scanner;
public class ArbolBinario {
	Nodo raiz;
	//constructor
	public ArbolBinario() {
		raiz = null;
	}
	// Métodos  
	// insertar un nodo en el árbol (13.5)
	public void insertar(int valor) {
		raiz = insertarRecursivo(raiz, valor);
	}
	private Nodo insertarRecursivo(Nodo actual, int valor) {
		if (actual == null) {
			return new Nodo(valor);
		}
		if (valor < actual.valor) {
			actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
		} else if (valor > actual.valor) {
			actual.derecho = insertarRecursivo(actual.derecho, valor);
		}
		return actual;
	}
	// Ejercicio 13.7: Contar hojas de un árbol binario (Método Recursivo)
	public int contarHojas() {
		return contarHojasRecursivo(raiz);
	}
	private int contarHojasRecursivo(Nodo actual) {
		if (actual == null) {
			return 0;
		}
		if (actual.izquierdo == null && actual.derecho == null) {
			return 1;
		}
		return contarHojasRecursivo(actual.izquierdo) + contarHojasRecursivo(actual.derecho);
	}

	// Ejercicio 13.11 a: Calcular la suma de todos los elementos del árbol
	public int sumaElementos() {
		return sumaElemRecu(raiz);
	}
	private int sumaElemRecu(Nodo actual) {
		if (actual == null) {
			return 0;
		}
		return actual.valor + sumaElemRecu(actual.izquierdo) + sumaElemRecu(actual.derecho);
	}

	// Ejercicio 13.11b: Calcular la suma de los elementos múltiplos de 3 del árbol
	public int sumaElementosMultiplos3() {
		return sumaElementosMultiplos3Recursivo(raiz);
	}
	private int sumaElementosMultiplos3Recursivo(Nodo actual) {
		if (actual == null) {
			return 0;
		}
		int suma = 0;
		if (actual.valor % 3 == 0) {
			suma += actual.valor;
		}
		return suma + sumaElementosMultiplos3Recursivo(actual.izquierdo) + sumaElementosMultiplos3Recursivo(actual.derecho);
	}

	//13.5: Encontrar el nodo máximo en el árbol
	public Nodo encontrarNodoMaximo() {
		return encontrarNodoMaximoRecursivo(raiz);
	}
	private Nodo encontrarNodoMaximoRecursivo(Nodo actual) {
		if (actual == null || actual.derecho == null) {
			return actual;
		}
		return encontrarNodoMaximoRecursivo(actual.derecho);
	}

	// Método para pedir datos al usuario y construir el árbol (13.11)
	public void construirArbol() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el numero de elementos del arbol: ");
		int numElementos = leer.nextInt(); 
		leer.nextLine();
		System.out.println("Ingrese los elementos del arbol:");
		for (int i = 0; i < numElementos; i++) {
			int elemento = leer.nextInt();
			leer.nextLine();
			insertar(elemento); // Llamada al método insertar para agregar los elementos al árbol
		}
		leer.close();
	}
}
