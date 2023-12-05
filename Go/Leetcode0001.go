package main

import "fmt"

func l0001() {
	var input = []int{2, 7, 11, 15}
	fmt.Print(twoSum(input, 9))
}

//go through each number in nums and add each one to the map as they key, with the value being target- num
//check

func twoSum(nums []int, target int) []int {
	var m = make(map[int]int)

	for indice, value := range nums {
		var remaining = target - value
		val, ok := m[remaining]
		if ok {
			return []int{val, indice}
		}
		m[value] = indice
	}
	return []int{0, 0}
}
