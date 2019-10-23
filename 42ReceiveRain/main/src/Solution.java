/**
 * copyright: huxin3420 on github
 * Source of problem solving:
 *     windliang
 *     https://leetcode-cn.com/problems/trapping-rain-water/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-8/
 */
public class Solution {
    public static int trap(int[] height) {
        int result = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        for (int i = 1; i < height.length - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(leftMax[i], rightMax[i]);
            if (min > height[i]) {
                result = result + (min - height[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] n = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(n));
    }
}
