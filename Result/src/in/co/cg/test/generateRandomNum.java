package in.co.cg.test;

// program to generate random numbers in a file
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class generateRandomNum {

	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the path");
		String filePath = sc.nextLine();

		WriteFile writefile = new WriteFile(filePath, true);
		for (int i = 0; i < 100; i++) {
			writefile.writeToFile("" + rand.nextInt(50));
			// generate random numbers
			System.out.println("\n");
		}

		Scanner s = new Scanner(new File(filePath));
		Set<Integer> set = new TreeSet<>();

		while (s.hasNextInt()) {
			set.add(s.nextInt());

		}
		s.close();

		// only distinct generated random numbers are sorted and then printed
		set.stream().distinct().sorted().forEach(System.out::println);
	}

}
