/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 20-02-2022
 */
package leetCode;

import java.util.Arrays;

public class RemoveCoveredIntervals {

    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->
                a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );
        int count = 1;
        int ind = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[ind][1] < intervals[i][1]) {
                count++;
                ind = i;
            }
        }

        return count;
    }
}
