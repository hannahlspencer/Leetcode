package main

import (
	"fmt"
)

func smother() {
	//img := [][]int{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}}
	img2 := [][]int{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}, {14, 15, 16}}
	fmt.Println(imageSmoother(img2))
}

func imageSmoother(img [][]int) [][]int {
	result := make([][]int, len(img))

	for i := 0; i < len(img); i++ {
		result[i] = make([]int, len(img[0]))
	}
	for i := 0; i < len(img); i++ {
		for j := 0; j < len(img[i]); j++ {
			total := 0
			divider := 0

			if (i - 1) >= 0 {
				if (j - 1) >= 0 {
					total += img[i-1][j-1]
					divider += 1
				}
				total += img[i-1][j]
				divider += 1
				if (j + 1) <= (len(img[i]) - 1) {
					total += img[i-1][j+1]
					divider += 1
				}
			}
			if (j - 1) >= 0 {
				total += img[i][j-1]
				divider += 1
			}
			total += img[i][j]
			divider += 1

			if (j + 1) <= (len(img[i]) - 1) {
				total += img[i][j+1]
				divider += 1
			}
			if (i + 1) <= (len(img) - 1) {
				if (j - 1) >= 0 {
					total += img[i+1][j-1]
					divider += 1
				}
				total += img[i+1][j]
				divider += 1
				if (j + 1) <= (len(img[i]) - 1) {
					divider += 1
					total += img[i+1][j+1]
				}
			}
			result[i][j] = total / divider
		}
	}
	return result
}
