# [2442-Count-Number-of-Distinct-Integers-After-Reverse-Operations]

**Platform:** LeetCode
**Limits:** N/A | N/A
**Link:** [Problem Statement](https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/)

---

### 📝 Problem Statement
You are given an array `nums` consisting of **positive** integers.


You have to take each integer in the array, **reverse its digits**, and add it to the end of the array. You should apply this operation to the original integers in `nums`.


Return *the number of **distinct** integers in the final array*.


 

**Example 1:**


```

**Input:** nums = [1,13,10,12,31]
**Output:** 6
**Explanation:** After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
```



**Example 2:**


```

**Input:** nums = [2,2,2]
**Output:** 1
**Explanation:** After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).

```



 

**Constraints:**



	* `1 5`
	* `1 6`

---

### 📥 Input / Output Specification
**Input:** Refer to problem description.
**Output:** Refer to problem description.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
[1,13,10,12,31]
```
**Output:**
```
N/A
```




---

### 📊 Submission History
| Attempt | Date & Time | Verdict | Language | File |
| :---: | :---: | :---: | :---: | :---: |
| 1 | 8/13/2026, 10:27:49 AM | ✅ Accepted | C++ | [`2104969130_Attempt_1_AC.cpp`](./2104969130_Attempt_1_AC.cpp) |
