public class Main {
    public static void main(String[] args) {
        int index = 11;
        int[] fibonacci = new int[index];
        fibonacci[0] = 1; 
        fibonacci[1] = 1;

        for (int n = 2; n < index; n++) {
            fibonacci[n] = fibonacci[n - 1] + fibonacci[n - 2];
        }

        for (int x = 0; x < index; x++) {
            System.out.println(fibonacci[x]);
        }
    }
}
