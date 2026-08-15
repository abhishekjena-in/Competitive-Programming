# [B---Representative-Balls](https://atcoder.jp/contests/abc466/tasks/abc466_b)

> **Platform:** `AtCoder` | **Time Limit:** `2 sec` | **Memory Limit:** `1024 MiB`  
> **Direct Link:** [Open Problem Statement](https://atcoder.jp/contests/abc466/tasks/abc466_b)

---

### 📖 Problem Statement
There are  N  balls.
The color of the  i -th ball is  C_i , and its size is  S_i . Here, the colors are represented by integers  1, 2, \ldots, M .
For  k = 1, 2, \ldots, M , output the maximum size of a ball of color  k , or -1 if there is no ball of color  k .

**Constraints:**
1 \leq N, M \leq 100 
 1 \leq C_i \leq M 
 1 \leq S_i \leq 100 
All input values are integers.

---

### 📥 Input Specification
The input is given from Standard Input in the following format:
 N   M 
 C_1   S_1 
 C_2   S_2 
 \vdots 
 C_N   S_N

---

### 📤 Output Specification
In the order  k = 1, 2, \ldots, M , output the maximum size of a ball of color  k  if such a ball exists, or -1 otherwise, separated by spaces.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
4 5
1 3
2 10
1 7
4 9
```

**Output:**
```text
7 10 -1 9 -1
```


#### Example 2
**Input:**
```text
5 5
2 6
5 12
5 2
5 9
2 7
```

**Output:**
```text
-1 7 -1 -1 12
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 77725012 | 2026-07-21 18:48:25 | ❌ RE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`77725012_Attempt_1_RTE.java`](./77725012_Attempt_1_RTE.java) |
| 2 | 77725039 | 2026-07-21 18:50:04 | ✅ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`77725039_Attempt_2_AC.java`](./77725039_Attempt_2_AC.java) |
| 3 | 78368778 | 2026-08-15 11:00:11 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78368778_Attempt_3_CE.java`](./78368778_Attempt_3_CE.java) |
| 4 | 78371563 | 2026-08-15 13:39:02 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78371563_Attempt_4_CE.java`](./78371563_Attempt_4_CE.java) |
| 5 | 78371570 | 2026-08-15 13:39:25 | ❌ CE | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78371570_Attempt_5_CE.java`](./78371570_Attempt_5_CE.java) |
| 6 | 78371580 | 2026-08-15 13:39:56 | ✅ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78371580_Attempt_6_AC.java`](./78371580_Attempt_6_AC.java) |
