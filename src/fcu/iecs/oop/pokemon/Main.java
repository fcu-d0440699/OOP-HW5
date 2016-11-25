package fcu.iecs.oop.pokemon;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1,name2;
		int cp1,cp2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input pokemom1'name and cp:");
		name1 = scanner.next();
		cp1 = scanner.nextInt();
		System.out.println("input pokemom2'name and cp:");
		name2 = scanner.next();
		cp2 = scanner.nextInt();
		
		Pokemon p1 = new Pokemon(name1, cp1);
		Pokemon p2 = new Pokemon(name2, cp2);
		//Pokemon p1 = new Pokemon("Psyduck", 100);
		//Pokemon p2 = new Pokemon("Pikachu", 300);

		GYM.fight(p1, p2);
		
		scanner.close();
	}

}
