package Exp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author 旭尧！
 * @version JDK17.0
 */
public class tes1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        in.close();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(in.nextInt());
        }

        arr.sort(Comparator.naturalOrder());
        int max=0;
        BigInteger bi = null;
        for(int i=0;i<A;i++){

        }
    }
}
