package week1

// problem description: https://neetcode.io/problems/is-anagram/question
func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	sTable := make(map[rune]int)
	for _, sChar := range s {
		sTable[sChar]++
	}

	for sChar, time := range sTable {
		occs := 0
		for _, tChar := range t {
			if sChar == tChar {
				occs += 1
			}
		}

		if occs != time {
			return false
		}
	}

	return true
}
