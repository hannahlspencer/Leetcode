package main

import (
	"fmt"
	"sort"
)

func main() {
	var input = []string{"flower", "flow", "flight"}
	fmt.Print(longestCommonPrefix(input))
}

func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}
	sortByLength := func(i, j int) bool {
		return len(strs[i]) < len(strs[j])
	}
	sort.Slice(strs, sortByLength)
	//shortest :=
	// for _, str := range strs {

	// }
	return "x"
}
