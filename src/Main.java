
public class Main {
    public static void main(String[] args) {

        final long C = 2;

        final long A = 2; //початкове значення
        final long B = 7; //кінцеве значення

        final long N = 1; //початкове значення
        final long M = 8; //кінцеве значення


        if (A > B || N > M) {
            System.out.println("Некоректно введені початкові чи кінцеві значення");
        }else{
            long S = 0;

            for (long i = A; i <= B ; i++){
                for (long j = N; j <= M ; j++){
                    if(i != C) S += (i%j)/(i-C);
                }
            }
            System.out.print("S = " + S);
        }


    }
}