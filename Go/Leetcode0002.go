package main

import (
	"fmt"
	"strconv"
)

func NOTDONE() {
	fmt.Print(addTwoNumbers)
}

// You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	var result *ListNode

	first := fetchInt(l1)
	second := fetchInt(l2)

	var strResult int = first + second
	result = stringToListNode(strconv.Itoa(strResult), nil)
	return result
}

func fetchInt(node *ListNode) int {
	current := node
	stringInt := strconv.Itoa(node.Val)

	for current.Next != nil {
		current = current.Next
		currentVal := current.Val
		stringInt = strconv.Itoa(currentVal) + stringInt
	}

	finalInt, _ := strconv.Atoi(stringInt)
	fmt.Println(finalInt)
	return finalInt
}

func stringToListNode(num string, node *ListNode) *ListNode {
	if len(num) == 0 {
		return node
	}
	digit := string(num[len(num)-1])
	val, _ := strconv.Atoi(digit)

	newNode := &ListNode{Val: val}
	newNode.Next = node

	remaining := num[:len(num)-1]
	return stringToListNode(remaining, newNode)
}

func reverseSlice(s []rune) {
	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		s[i], s[j] = s[j], s[i]
	}
}
