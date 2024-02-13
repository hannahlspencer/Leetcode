package main

import (
	"fmt"
	"sort"
)

func findContentChildrenmain() {
	g := []int{10, 9, 8, 7}
	s := []int{5, 6, 7, 8}
	fmt.Println(findContentChildren(g, s))
}
func findContentChildren(g []int, s []int) int {
	result := 0
	sort.Ints(g)
	sort.Ints(s)
	gIndex := 0
	sIndex := 0
	if len(s) == 0 {
		return 0
	}
	for gIndex < len(g) && sIndex < len(s) {
		if g[gIndex] <= s[sIndex] {
			result += 1
			gIndex += 1
			sIndex += 1
		} else {
			sIndex += 1
		}

	}
	return result
}
