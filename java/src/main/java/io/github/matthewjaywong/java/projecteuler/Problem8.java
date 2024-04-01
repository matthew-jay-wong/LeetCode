package io.github.matthewjaywong.java.projecteuler;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * <h1>
 *     <a href="https://projecteuler.net/problem=8">Problem 8: Largest Product in a Series</a>
 * </h1>
 * <h2>
 *     Difficulty: 5%
 * </h2>
 * <p>The four adjacent digits in the $1000$-digit number that have the greatest product are $9 \times 9 \times 8 \times 9 = 5832$.</p>
 * <p class="monospace center">
 * 73167176531330624919225119674426574742355349194934<br>
 * 96983520312774506326239578318016984801869478851843<br>
 * 85861560789112949495459501737958331952853208805511<br>
 * 12540698747158523863050715693290963295227443043557<br>
 * 66896648950445244523161731856403098711121722383113<br>
 * 62229893423380308135336276614282806444486645238749<br>
 * 30358907296290491560440772390713810515859307960866<br>
 * 70172427121883998797908792274921901699720888093776<br>
 * 65727333001053367881220235421809751254540594752243<br>
 * 52584907711670556013604839586446706324415722155397<br>
 * 53697817977846174064955149290862569321978468622482<br>
 * 83972241375657056057490261407972968652414535100474<br>
 * 82166370484403199890008895243450658541227588666881<br>
 * 16427171479924442928230863465674813919123162824586<br>
 * 17866458359124566529476545682848912883142607690042<br>
 * 24219022671055626321111109370544217506941658960408<br>
 * 07198403850962455444362981230987879927244284909188<br>
 * 84580156166097919133875499200524063689912560717606<br>
 * 05886116467109405077541002256983155200055935729725<br>
 * 71636269561882670428252483600823257530420752963450<br></p>
 * <p>Find the thirteen adjacent digits in the $1000$-digit number that have the greatest product. What is the value of this product?</p>
 */
public class Problem8 {

    private static final String THOUSAND_DIGIT_NUMBER =
            "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";

    public static void main(String[] args) {
        Problem8 problem8 = new Problem8();
        System.out.println(problem8.solution(13));
    }
    public BigInteger solution(int len) {
        BigInteger res = BigInteger.ZERO;
        for (int i = 0; i < THOUSAND_DIGIT_NUMBER.length() - 13; i++) {
            String substring = THOUSAND_DIGIT_NUMBER.substring(i, i + len);
            if (substring.contains("0"))
                continue;

            //noinspection OptionalGetWithoutIsPresent
            res = res.max(
                    Arrays.stream(substring.split(""))
                            .map(BigInteger::new)
                            .reduce(BigInteger::multiply)
                            .get()
            );
        }

        return res;
    }
}
