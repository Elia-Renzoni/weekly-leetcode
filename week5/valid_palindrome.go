package week5

import "unicode"

// problem description: https://neetcode.io/problems/is-palindrome/question
func isPalindrome(s string) bool {
	filtered := make([]rune, 0)

	for _, r := range s {
		if unicode.IsLetter(r) || unicode.IsDigit(r) {
			filtered = append(filtered, unicode.ToLower(r))
		}
	}

	replica := make([]rune, 0, len(filtered))

	for i := len(filtered) - 1; i >= 0; i-- {
		replica = append(replica, filtered[i])
	}

	for i, char := range replica {
		if filtered[i] != char {
			return false
		}
	}

	return true
}
