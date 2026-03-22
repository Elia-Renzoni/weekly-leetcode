package week3

// problem description: https://neetcode.io/problems/longest-consecutive-sequence/question
func longestConsecutive(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	set := make(map[int]bool)
	for _, num := range nums {
		set[num] = true
	}

	maxLen := 0

	for num := range set {
		if !set[num-1] {
			curr := num
			currLen := 1

			for set[curr+1] {
				curr++
				currLen++
			}

			if currLen > maxLen {
				maxLen = currLen
			}
		}
	}

	return maxLen
}
