package variable;

import java.io.*;

public class s11444 {
    final static int MOD =  1000000007;
    static long N;
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));;

        N = Long.parseLong(br.readLine());

        long result = 0;

        result = fibonachi(0, 1, N);

        System.out.println(result);
    }

    public static long fibonachi(long n1, long n2, long cnt) {
        if(cnt == 0L) {
            return n1%MOD;
        }
        if(cnt == 1L){
            return n2%MOD;
        }

        long result = fibonachi(n2%MOD, (n1+n2)%MOD, cnt-1);

        return result;
    }
}