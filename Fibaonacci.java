package recursion;

public class Fibaonacci {

	public static void main(String[] args) {
		//System.out.println(fib(100));
		
		int n = 100;
		int[] mem = new int[n + 1];
		
		//System.out.println(fib(n, mem));
	}
	
	//slow and unrealistic
	public static int fib(int n) {
		if (n <= 2) {
			return 1;
		}
		
		int fib = fib(n - 2) + fib(n - 1);
		return fib;
	}
	
	//more efficient
	public static int fib(int n, int[] mem) {
		//base case
		if (n <= 2) return 1;
		
		//check if n exist in mem
		if (mem[n] != 0) {
			return mem[n];
		}
		
		int fib = fib(n - 1, mem) + fib(n - 2, mem);
		mem[n] = fib;
		return fib;
	}

}
