package it.progr.stream;

import java.util.stream.Stream;

public class OperazioniTerminaliDiStream {
	
	public static void main(String... args) {
		
		System.out.println("ESEMPIO USO OPERATORI TERMINALI PER GLI STREAM");
		Stream<Integer> stream = Stream.of(10, 22, 44, 33, 99, -55, 88, -77, 66, 0);
		System.out.print("stream: [ ");
		stream.forEach(elem -> System.out.print(elem + " "));
		System.out.println("] ");
		System.out.println("====================================================================");
		
//		- metodo findAny:
		// findAny -> ritorna il 1° elemento dello stream (l'ordine non conta).
		// Tipo di ritorno è un Optional<T> perchè se lo stream è vuoto torna null
		Stream<Integer> stream1 = Stream.of(10, 22, 44, 33, 99, -55, 88, -77, 66, 0);
		System.out.println(" - findAny: " + stream1.findAny().get());	
		System.out.println("====================================================================");
		
//		- metodo findFirst:
		// findFirst -> ritorna il 1° elemento dello stream (l'ordine conta)
		// Tipo di ritorno è un Optional<T> perchè se lo stream è vuoto torna null
		Stream<Integer> stream2 = Stream.of(10, 22, 44, 33, 99, -55, 88, -77, 66, 0);
		System.out.println(" - findFirst: " + stream2.findFirst().get());	
		System.out.println("====================================================================");
		
//		- metodo min/max:
		// min/max -> ritornano rispettivamente il minimo e il massimo elemento dello stream
		// basandosi su un comparatore che passiamo
		// Tipo di ritorno è un Optional<T> perchè se lo stream è vuoto torna null
		Stream<Integer> stream3 = Stream.of(10, 22, 44, 33, 99, -55, 88, -77, 66, 0);
		System.out.println(" - min: " + stream3.min((a, b) -> a.compareTo(b)).get());	
		Stream<Integer> stream4 = Stream.of(10, 22, 44, 33, 99, -55, 88, -77, 66, 0);
		System.out.println(" - max: " + stream4.max((a, b) -> a.compareTo(b)).get());	
		System.out.println("====================================================================");
		
//		- metodo count:
		// count ritorna il numero di elemnti presenti nello stream
		// Tipo di ritorno long
		Stream<Integer> stream5 = Stream.of(10, 22, 44, 33, 99, -55, 88, -77, 66, 0);
		System.out.println(" - count: " + stream5.count());	
		System.out.println("====================================================================");
		

//		- metodo anyMatch:
		// verifica se almento un elemnto dello stream metch il predicato
		// Tipo di ritorno boolean: true se almeno un elemento dello stream matcha il predicato, false altrimenti
		Stream<String> stream6 = Stream.of("Mario", "Massimo", "Tiziano", "Carlo", "Filippo");
		Stream<String> stream7 = Stream.of("Mario", "Massimo", "Tiziano", "Carlo", "Filippo");
		boolean result1 = stream6.anyMatch( str -> str.charAt(0) == 'C');
		boolean result2 = stream7.anyMatch( str -> str.charAt(0) == 'Z');
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("====================================================================");
		
//		- metodo allMatch
		// verifica se tutti gli elemnti dello stream matchano il predicato
		// Tipo di ritorno boolean: true se tutti gli elementi dello stream matchano il predicato, false altrimenti
		Stream<String> stream8 = Stream.of("Mario", "Massimo");
		Stream<String> stream9 = Stream.of("Mario", "Massimo", "Tiziano", "Carlo", "Filippo");
		result1 = stream8.allMatch( str -> str.charAt(0) == 'M');
		result2 = stream9.allMatch( str -> str.charAt(0) == 'M');
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("====================================================================");
		
//		- metodo noneMatch
		// verifica se nessino degli elemnti dello stream matcha il predicato
		// Tipo di ritorno boolean: true se tutti gli elementi dello stream non matchano il predicato, false altrimenti
		Stream<String> stream10 = Stream.of("Mario", "Massimo");
		Stream<String> stream11 = Stream.of("Mario", "Massimo", "Tiziano", "Carlo", "Filippo");
		result1 = stream10.noneMatch( str -> str.charAt(0) == 'M');
		result2 = stream11.noneMatch( str -> str.charAt(0) == 'Z');
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("====================================================================");
		
//		- metodo reduce
		
		
//		- metodo collect
	}

}
