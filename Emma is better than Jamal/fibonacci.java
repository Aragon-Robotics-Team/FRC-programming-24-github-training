public class Main {
    public static void main(String[] args) {
        int n = 20;
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i = 1; i<=n; ++i){
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.println(firstTerm);
        }
    }
}

