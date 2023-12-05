package main

import (
	"fmt"
	"strconv"
)

func main() {
	fmt.Print(isPalindrome(1221))
}

func isPalindrome(x int) bool {
	number := strconv.Itoa(x)
	for i := 0; i < (len(number) / 2); i++ {
		if (string(number[i])) != string(number[(len(number)-1)-i]) {
			return false
		}
	}
	return true
}
