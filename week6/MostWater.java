


// problem description: https://neetcode.io/problems/max-water-container/question
class MostWater {
    public int maxArea(int[] heights) {
        int totalWater = 0;
        
        for (int left = 0, right = heights.length - 1; left < right; ) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            totalWater = Math.max(totalWater, area);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return totalWater;
    }
}
