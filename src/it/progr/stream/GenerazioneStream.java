package it.progr.stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerazioneStream {

	public static void main(String... args) {
		// metodo 1) mtodo statico generate classe Stream
		// NOTA BENE: metodo static generate della classe Stream vuole come parametro 
		// un oggetto che implemeti l'interfaccia funzionale Supplier
		
		// NOTa BENE2: metodo intermedio limit serve per limitare lo stream ad un numero n di elementi
		// se non mettessi limit(n) avrei potenzialmente uno stream infinito di numero casuali
		Supplier<Double> supplier = () -> Math.random() * 1000000;
		Stream<Double> stream = Stream.generate(supplier);
		stream.limit(2).forEach(System.out::println);
		System.out.println("============================");
		
		// metodo 2) mtodo statico iterate classe Stream
		// NOTA BENE: metodo iterate prende come input: 1) seed 2) UnaryOperator che dice come sturuttare
		// il prossimo elemento a paratire dal precedente
		Stream<Integer> streamInteri = Stream.iterate(10, nextElement -> nextElement+1 );
		streamInteri.limit(3).forEach(System.out::println);
	}
}
