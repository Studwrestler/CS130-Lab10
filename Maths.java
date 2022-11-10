package lab10;

import java.util.Random;

public class Maths {
	public static double e = Math.E;
	public static double pi = Math.PI;
	static private Random randomNumberGenerator = new Random();
	
	private Maths() {
		
	}
	public static int getRandomNumber() {
		int num1 = randomNumberGenerator.nextInt();
		return num1;
	}
	public static int Max(int n1, int n2) {
		return Math.max(n1, n2);
		
	}
	public static double Max(long n1, long n2) {
		return Math.max(n1, n2);
	}
	public static double Sin(double n1) {
		return Math.sin(n1);
	}
	public static double Cos(double n1) {
		return Math.cos(n1);
	}
	public static double Log(double n1) {
		return Math.log(n1);
	}
	public static double Floor(double n1) {
		return Math.floor(n1);
	}
	public static double Ceil(double n1) {
		return Math.ceil(n1);
	}
	public static double pow(double n1,double n2) {
		return Math.pow(n1, n2);
	}

	public static void main(String[] args) {
		System.out.println("Random: "+ Maths.getRandomNumber());
		System.out.println("Max: "+Maths.Max(12, 45));
		System.out.println("Max: "+Maths.Max(128989, 124223423));
		System.out.println("Sin: "+Maths.Sin(pi));
		System.out.println("Cos: "+Maths.Cos(pi));
		System.out.println("Log: "+Maths.Log(e));
		System.out.println("Floor: "+Maths.Floor(pi));
		System.out.println("Ceiling: "+Maths.Ceil(pi));
		System.out.println("Power: "+Maths.pow(3,3));

	}

}
