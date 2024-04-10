package io.github.matthewjaywong.java.questions.april2024;

import java.util.*;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/reveal-cards-in-increasing-order/description/">950. Reveal Cards In Increasing Order</a>
 * </h1>
 * <h2>
 * Question of the Day: 10-04-2024
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * You are given an integer array deck. There is a deck of cards where every card has a unique integer. The integer on the ith card is deck[i].
 * </p>
 * <p>
 * You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.
 * </p>
 * <p>
 * You will do the following steps repeatedly until all cards are revealed:
 * </p>
 * <ol>
 *     <li>
 *         Take the top card of the deck, reveal it, and take it out of the deck.
 *     </li>
 *     <li>
 *         If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
 *     </li>
 *     <li>
 *         If there are still unrevealed cards, go back to step 1. Otherwise, stop.
 *     </li>
 * </ol>
 * <p>
 *     Return an ordering of the deck that would reveal the cards in increasing order.
 * </p>
 * <p>
 *     Note that the first entry in the answer is considered to be the top of the deck.
 * </p>
 */
public class RevealCardsInIncreasingOrder {

    public static void main(String[] args) {
        RevealCardsInIncreasingOrder revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
//        System.out.println(Arrays.toString(revealCardsInIncreasingOrder.solution(new int[]{17, 13, 11, 2, 3, 5, 7})));
        System.out.println(Arrays.toString(revealCardsInIncreasingOrder.solution(new int[]{17,13,11,2,3,5,7,19})));
    }

    public int[] solution(int[] deck) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int card : deck)
            priorityQueue.add(card);

        Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
        for (int i = 0; i < deck.length; i++)
            queue.add(Map.entry(i, 0));

        PriorityQueue<Map.Entry<Integer, Integer>> sorted = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getKey));
        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> cur = queue.poll();
            sorted.add(Map.entry(cur.getKey(), priorityQueue.poll()));
            if (!queue.isEmpty())
                queue.add(queue.poll());
        }

        int[] res = new int[deck.length];
        for (int i = 0; i < res.length; i++)
            res[i] = sorted.poll().getValue();

        return res;
    }
}
