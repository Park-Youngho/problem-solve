import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BigInteger n,m;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));


    }

}
