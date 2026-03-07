package week1

// problem description: https://neetcode.io/problems/duplicate-integer/question?list=neetcode150
func hasDuplicate(nums []int) bool {
	times := make(map[int]int)
	for _, value := range nums {
		times[value]++
	}

	for _, value := range times {
		if value > 1 {
			return true
		}
	}

	return false
}
