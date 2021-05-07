package it.progr.stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class OperazioniIntermedieDiStream {

	public static void main(String[] args) {
		System.out.println("OPERAZIONI INTERMEDIE PER GLI STREAM");

		Stream<Persona> stream1 = Stream.of(
				new Persona("Roberto", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Licata"),
				new Persona("Daniele", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Milano"), 
				new Persona("Tommaso", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Torino"), 
				new Persona("Rosario", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Roma"), 
				new Persona("Vincenzo", "Amato", "Licata"),
				new Persona("Tommaso", "Amato", "Palermo") 
			);
		Stream<Persona> stream2 = Stream.of(
				new Persona("Roberto", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Licata"),
				new Persona("Daniele", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Milano"), 
				new Persona("Tommaso", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Torino"), 
				new Persona("Rosario", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Roma"), 
				new Persona("Vincenzo", "Amato", "Licata"),
				new Persona("Tommaso", "Amato", "Palermo") 
				);
		Stream<Persona> stream3 = Stream.of(
				new Persona("Roberto", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Licata"),
				new Persona("Daniele", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Milano"), 
				new Persona("Tommaso", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Torino"), 
				new Persona("Rosario", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Roma"), 
				new Persona("Vincenzo", "Amato", "Licata"),
				new Persona("Tommaso", "Amato", "Palermo") 
				);
		Stream<Persona> stream4 = Stream.of(
				new Persona("Roberto", "Amato", ""),
				new Persona("Fabio", "Amato", ""),
				new Persona("Daniele", "Amato", ""),
				new Persona("Roberto", "Amato", ""), 
				new Persona("Tommaso", "Amato", ""),
				new Persona("Roberto", "Amato", ""), 
				new Persona("Rosario", "Amato", ""),
				new Persona("Fabio", "Amato", ""), 
				new Persona("Vincenzo", "Amato", ""),
				new Persona("Tommaso", "Amato", "") 
				);
		Stream<Persona> stream5 = Stream.of(
				new Persona("Roberto", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Licata"),
				new Persona("Daniele", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Milano"), 
				new Persona("Tommaso", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Torino"), 
				new Persona("Rosario", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Roma"), 
				new Persona("Vincenzo", "Amato", "Licata"),
				new Persona("Tommaso", "Amato", "Palermo") 
				);
		Stream<Persona> stream6 = Stream.of(
				new Persona("Roberto", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Licata"),
				new Persona("Daniele", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Milano"), 
				new Persona("Tommaso", "Amato", "Licata"),
				new Persona("Roberto", "Amato", "Torino"), 
				new Persona("Rosario", "Amato", "Licata"),
				new Persona("Fabio", "Amato", "Roma"), 
				new Persona("Vincenzo", "Amato", "Licata"),
				new Persona("Tommaso", "Amato", "Palermo") 
				);

//		- metodo filter : metodo di istanza della classe Stream
//		input: Predicate<T> - predicato con cui filtrare
//		output: Stream contenente i valori filtrati
		Stream<Persona> sf = stream1.filter( persona -> persona.getLuogoNascita().equalsIgnoreCase("LICATA"));
		System.out.print("[");
		sf.forEach(System.out::print);
		System.out.println("]");
		System.out.println("===================================================================");
			  
//		- limit
		
//		- skip
		
//		
//		- metodo sorted: metodo di istanza della classe Stream
//		input: Comparator<T> - comparatore con cui comparare gli elementi dello stream
//		output: Stream contenente i valori 
		Stream<Persona> streamOrd = stream3.sorted((pers1, pers2) -> pers1.compareTo(pers2));
		System.out.print("[");
		streamOrd.forEach(System.out::print);
		System.out.println("]");
		System.out.println("===================================================================");
			  
//		- metodo distinct: metodo di istanza della classe Stream
//		input: void
//		output: Stream di partenza ma senza valori duplicati
		Stream<Persona> streamDistinct  = stream4.distinct();
		System.out.print("[");
		streamDistinct.forEach(System.out::print);
		System.out.println("]");
		System.out.println("===================================================================");
		
//		- metodo map: metodo di istanza della classe Stream
//		input: Function<T, R> dove T è il parametro della funzione ed R il tipo di ritorno
//		output: nuovo stream mappato tramite la funzione passata in input
		Function<Persona, String> funct = (pers) -> pers.getNome().toUpperCase() + "; ";
		Stream mapToUpperCaseName = stream5.map(funct);
		System.out.print("[");
		mapToUpperCaseName.forEach(System.out::print);
		System.out.println("]");
		System.out.println("===================================================================");
		
		Stream mapToLenghtName = stream6.map( pers -> pers.getNome().length() + "; " );
		System.out.print("[");
		mapToLenghtName.forEach(System.out::print);
		System.out.println("]");
		System.out.println("===================================================================");
		
		
	}
}
