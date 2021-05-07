package it.progr.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CreazioneDiStream {

	public static void main(String... args) {
//		metodo 1) creazione di uno stream a partire da un array
		String[] strings = new String[] {"cioa", "hello", "salut", "hola"};
		Stream<String> streamStringhe = Arrays.stream(strings);	// metodo statico stream della classe Arrays 
		
		Integer[] numbers = new Integer[] {1, 2, 3, 4, 5};
		Stream<Integer> streamInteri = Arrays.stream(numbers);	// metodo statico stream della classe Arrays 
		
//		metodo 2) creazione di uno stream a partire da una collection
		List<Double> listDouble = new ArrayList<>();
		listDouble.add(21.3);
		listDouble.add(221.3);
		listDouble.add(212.3212);
		Stream<Double> streamDouble = listDouble.stream();	// metodo di istanza stream definito nell'intefaccia Collection
		
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		Stream<Character> streamChar = set.stream();	// metodo di istanza stream definito nell'intefaccia Collection
		
//		metodo 3) creazione di uno stream da una lista di valori
		Stream<String> altroStreamStringhe = Stream.of("uno", "due", "tre", "..."); // metodo statico stream della classe Stream 
		Stream<Character> altroStreamChar = Stream.of('1', '2', 'a');	// metodo statico stream della classe Stream
		Stream<Integer> altroStreamInteri = Stream.of(1, 2, 3, 4, 5, 6);	// metodo statico stream della classe Stream
		
		int[] arrayInteri = new int[] {1, 9, 99};
		Stream<int[]> altroStreamInteri2 = Stream.of(arrayInteri);	// metodo statico stream della classe Stream
	}
}
