package it.progr.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperazioneAggregazioneDiStream {

	public static void main(String[] args) {
		System.out.println("OPERAZIONE DI AGGREGAZIONE DI STREAM");
		
		
//		- metodo reduce: metodo di istanza della classe Stream
//		NOTA BENE) reduce è anche un'operazione terminale per uno stream
//		Quello che fa questo metodo è ridurre tutti gli elemnti dello stream ad un unico elemento
//		Nella pratica la callback riceve il precedente elemento ed il successivo e li combina assieme
//		tramite una qualche funzione data dal programmatore..... si procede così scandendo tutto lo stream
//		fino ad arrivare ad un unico elemento
//		input: BinaryOperator<T>
//		output: T
		Stream<Integer> streamDispari = Stream.of(1, 3, 5, 7, 9);
		BinaryOperator<Integer> bo = (num1, num2) -> num1 + num2;
		Optional<Integer> result = streamDispari.reduce( bo );
		System.out.println(result.get());
		System.out.println("================================");

		Stream<Integer> streamPari = Stream.of(2, 4, 6, 8, 10);
		result = streamPari.reduce( (prevElem, nextElem) -> prevElem - nextElem );
		System.out.println(result.get());
		System.out.println("================================");
		
//		- metodo collect: metodo di istanza della classe Stream
//		NOTA BENE) collect è anche un'operazione terminale per uno stream
//		Questo metodo serve per ridurre lo stream ad una List, Map oppure un intero
//		input: Collector<T, A, R>
//		output: R
		Stream<String> streamHW = Stream.of("Ciao", "mondo", "hello", "World");
		List<String> list = streamHW.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("================================");

		Stream<String> streamHW2 = Stream.of("Ciao", "mondo", "hello", "World");
	}

}
