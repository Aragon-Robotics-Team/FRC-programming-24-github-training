public class Main {
	public static void main(String[] args) {
        int index = 11;
        int[] fibonacci = new int[index];
		fibonacci[1] = 1;
        fibonacci[0] = 1;
		for (int n = 2; n < 11; n++) {
			fibonacci[n] = fibonacci[n-1] + fibonacci[n-2];
		}
		for (int x = 0; x < 11; x++) {
			System.out.println(fibonacci[x]);
		}
	}
}