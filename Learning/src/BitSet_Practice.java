import java.util.BitSet;
import java.util.Scanner;

public class BitSet_Practice {
	static BitSet b1 = new BitSet();
	static BitSet b2 = new BitSet();  
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		b1.set(0); b2.set(0);
		b1.set(1); b2.set(2);
		b1.set(4); b2.set(4);
		System.out.println("BIT 1 DETAILS: SIZE: " + b1.size()+", LENGTH: "+b1.length()+", CARDANIALITY: "+b1.cardinality()+", INDEX OF BITS SET TO 1: "+b1);
		System.out.println("BIT 2 DETAILS: SIZE: " + b2.size()+", LENGTH: "+b2.length()+", CARDANIALITY: "+b2.cardinality()+", INDEX OF BITS SET TO 1: "+b2);
		BitSet b3 = (BitSet)b1.clone();
		BitSet b4 = (BitSet)b1.clone();
		BitSet b5 = (BitSet)b1.clone();
		
		b1.or(b2);
		System.out.println("BIT 1 OR BIT 2 DETAILS: SIZE: " + b1.size()+", LENGTH: "+b1.length()+", CARDANIALITY: "+b1.cardinality()+", INDEX OF BITS SET TO 1: "+b1);
		b3.and(b2);
		System.out.println("BIT 1 AND BIT 2 DETAILS: SIZE: " + b3.size()+", LENGTH: "+b3.length()+", CARDANIALITY: "+b3.cardinality()+", INDEX OF BITS SET TO 1: "+b3);
		b4.xor(b2);
		System.out.println("BIT 1 XOR BIT 2 DETAILS: SIZE: " + b4.size()+", LENGTH: "+b4.length()+", CARDANIALITY: "+b4.cardinality()+", INDEX OF BITS SET TO 1: "+b4);
		
		System.out.println("IS BIT1 EQUAL TO BIT2 :" + b3.equals(b2));
		//System.out.println(b2.get(0, 10));
		System.out.println("INTERSCTION OF B1 AND B2: "+b4.intersects(b2));
		
		BitSet b6 = new BitSet();
		b6.set(1);
		b6.set(3);
		
		System.out.println("INTERSCTION OF B6 AND B2: "+b6.intersects(b2));
		System.out.println(b2.get(1));
	}
}
