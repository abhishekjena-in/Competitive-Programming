# [D---Placing-Rooks](https://atcoder.jp/contests/abc466/tasks/abc466_d)

> **Platform:** `AtCoder` | **Time Limit:** `2 sec` | **Memory Limit:** `1024 MiB`  
> **Direct Link:** [Open Problem Statement](https://atcoder.jp/contests/abc466/tasks/abc466_d)

---

### 📖 Problem Statement
There is a grid with  N  rows and  N  columns.
Initially, nothing is placed on the grid.
Starting from this state, Takahashi performs  M  operations on the grid in order. The  i -th operation  (1\leq i\leq M)  is as follows.

Remove all pieces placed on the cells in the  R_i -th row from the top.
Next, remove all pieces placed on the cells in the  C_i -th column from the left.
Finally, place a piece on the cell at the  R_i -th row from the top and the  C_i -th column from the left.

Output the number of pieces placed on the grid after the  M  operations.

**Constraints:**
1 \leq N \leq 3\times 10^5 
 1 \leq M \leq 3\times 10^5 
 1 \leq R_i \leq N 
 1 \leq C_i \leq N 
All input values are integers.

---

### 📥 Input Specification
The input is given from Standard Input in the following format:
 N   M 
 R_1   C_1 
 R_2   C_2 
 \vdots 
 R_M   C_M

---

### 📤 Output Specification
Output the number of pieces placed on the grid after the  M  operations.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
3 6
1 1
1 2
3 3
3 2
1 3
1 3
```

**Output:**
```text
2
```


#### Example 2
**Input:**
```text
2 3
1 2
2 1
1 1
```

**Output:**
```text
1
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78375215 | 2026-08-15 16:46:24 | ❌ RE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78375215_Attempt_1_RTE.java`](./78375215_Attempt_1_RTE.java) |
