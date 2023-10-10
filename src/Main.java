
public class Main {
    public static void main(String[] args) {

        final long C = 2;

        final long A = 1;
        final long N = 3;
        final long B = 7;
        final long M = 8;

        long S = 0;

        for (long i = A; i <= B ; i++){
            for (long j = N; j <= M ; j++){
                if(i != C) S += (i%j)/(i-C);
            }
        }
        System.out.print("S = " + S);
    }
}