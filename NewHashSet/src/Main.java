import java.util.*;

public class Main {

	public static void main(String[] args) {

		//Esercizio Modulo
//		int range = 10;
//		System.out.println(199%10); // % restituisce il resto della divisione
		// questo è il trucco alla base dell'algoritmo di compressione --> il resto mi dà il range finale
		
//		Set<Impiegato> impiegati = new HashSet<>();
//		Impiegato i1 = new Impiegato (27, "Andrea", "Marcelli");
//		Impiegato i2 = new Impiegato (45, "Fulvio", "Corno");
//		Impiegato i3 = new Impiegato (45, "Giovanni", "Squilleri");
//		
//		impiegati.add(i1);
//		impiegati.add(i2);
//		impiegati.add(i3);
//		
//		Iterator<Impiegato> it = impiegati.iterator();  //non ho la certezza che l'ordine di inserimento sia rispettato
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		HashSet<String> set = new HashSet<>();
		
		Long t1 = System.nanoTime();
		for (int i=0; i<100000; i++) {
			arrayList.add("tag_"+i);
		}
		Long t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=0; i<100000; i++) {
			linkedList.add("tag_"+i); // la più veloce dei tre
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=0; i<100000; i++) {
			set.add("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=0; i<10000; i++) {
			arrayList.remove("tag_"+i); // particolarmente lenta
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
//		t1 = System.nanoTime();
//		for (int i=0; i<100000; i++) {
//			linkedList.remove("tag_"+i); // è veloce perchè rimuove a partire dal primo elemento in questo caso, ed è subito disponibile
//		}
//		t2 = System.nanoTime();
//		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=9999; i>=0; i--) {
			linkedList.remove("tag_"+i); // il comportamento è simile ora a quello dell' ArrayList
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=0; i<100000; i++) {
			set.remove("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
	}

}
