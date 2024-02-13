package main

import "fmt"

func l2706() {
	var input = []int{98, 54, 6, 34, 66, 63, 52, 39}
	fmt.Print(buyChoco(input, 62))
}

func buyChoco(prices []int, money int) int {
	lowest := money
	mostLeftover := -1

	for _, s := range prices {
		if (money - (s + lowest)) >= mostLeftover {
			mostLeftover = money - (s + lowest)
		}
		if s < lowest {
			lowest = s
		}
	}

	if mostLeftover >= 0 {
		return mostLeftover
	}
	return money
}
