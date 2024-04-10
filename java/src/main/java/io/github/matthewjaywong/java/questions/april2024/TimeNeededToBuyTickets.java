package io.github.matthewjaywong.java.questions.april2024;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/time-needed-to-buy-tickets/">2073. Time Needed to Buy Tickets</a>
 * </h1>
 * <h2>
 *     Question of the Day: 09-04-2024
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
 * </p>
 * <p>
 *     You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
 * </p>
 * <p>
 *     Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
 * </p>
 * <p>
 *     Return the time taken for the person at position k (0-indexed) to finish buying tickets.
 * </p>
 */
public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        TimeNeededToBuyTickets timeNeededToBuyTickets = new TimeNeededToBuyTickets();
        System.out.println(timeNeededToBuyTickets.solution(new int[]{5, 1, 1, 1}, 0));
    }
    public int solution (int[] tickets, int k) {
        Map.Entry<Integer, Integer>[] ticketsBoughtTimeTakenMap = new Map.Entry[tickets.length];
        for (int i = 0; i < tickets.length; i++)
            ticketsBoughtTimeTakenMap[i] = Map.entry(tickets[i], 0);

        Queue<Integer> queue = new LinkedList<>(IntStream.range(0, tickets.length).boxed().toList());
        while (ticketsBoughtTimeTakenMap[k].getKey() > 0) {
            int cur = queue.poll();
            for (int j = 0; j < ticketsBoughtTimeTakenMap.length; j++) {
                Map.Entry<Integer, Integer> prev = ticketsBoughtTimeTakenMap[j];
                if (j == cur)
                    ticketsBoughtTimeTakenMap[j] = Map.entry(prev.getKey() - 1, prev.getValue() + 1);
                else
                    ticketsBoughtTimeTakenMap[j] = Map.entry(prev.getKey(), prev.getValue() + 1);
            }

            if (ticketsBoughtTimeTakenMap[cur].getKey() > 0)
                queue.add(cur);
        }

        return ticketsBoughtTimeTakenMap[k].getValue();
    }
}
