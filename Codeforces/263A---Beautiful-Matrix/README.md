# [263A---Beautiful-Matrix](https://codeforces.com/problemset/problem/263/A)

> **Platform:** `Codeforces` | **Time Limit:** `2 seconds` | **Memory Limit:** `256 megabytes`  
> **Direct Link:** [Open Problem Statement](https://codeforces.com/problemset/problem/263/A)

---

### 📖 Problem Statement
You've got a  *5 × 5*  matrix, consisting of  *24*  zeroes and a single number one. Let's index the matrix rows by numbers from  *1*  to  *5*  from top to bottom, let's index the matrix columns by numbers from  *1*  to  *5*  from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.

---

### 📥 Input Specification
The input consists of five lines, each line contains five integers: the  *j* -th integer in the  *i* -th line of the input represents the element of the matrix that is located on the intersection of the  *i* -th row and the  *j* -th column. It is guaranteed that the matrix consists of  *24*  zeroes and a single number one.

---

### 📤 Output Specification
Print a single integer — the minimum number of moves needed to make the matrix beautiful.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
```

**Output:**
```text
3
```


#### Example 2
**Input:**
```text
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
```

**Output:**
```text
1
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 387852598 | Aug/21/2026 12:27UTC+5.5 | ✅ Accepted | 92 ms | 100 KB | C++20 (GCC 13-64) | [`387852598_Attempt_1_AC.cpp`](./387852598_Attempt_1_AC.cpp) |
