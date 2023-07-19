package arbolBinario;

public class Principal {
	public static void main(String[] args) {
 	  
		// Crear un árbol binario y agregar nodos mediante la entrada del usuario
		System.out.println("	----------------------------------" );
		System.out.println("	TALLER UNIDAD 2 EJEMPLOS DEL LIBRO") ;
		System.out.println("	----------------------------------" );
	
		ArbolBinario arbol = new ArbolBinario();
		arbol.construirArbol(); // Pregunta al usuario por los elementos para construir el árbol
		//13.7: Contar Hojas de un Árbol Binario
		int hojas = arbol.contarHojas();
		System.out.println("Numero de hojas del arbol: " + hojas);
		
		//13.11 a: Calcular la suma de todos los elementos del árbol
		int sumaElementos = arbol.sumaElementos();
		System.out.println("Suma de todos los elementos del arbol: " + sumaElementos);
		
		//13.11 b: Calcular la suma de los elementos múltiplos de 3 del árbol
		int sumaMultiplos3 = arbol.sumaElementosMultiplos3();
		System.out.println("Suma de elementos multiplos de 3 del arbol: " + sumaMultiplos3);
		
		//13.5: Encontrar el nodo máximo en el árbol
		Nodo nodoMaximo = arbol.encontrarNodoMaximo();
		System.out.println("Nodo maximo en el arbol: " + nodoMaximo.valor);
	}
		
}
