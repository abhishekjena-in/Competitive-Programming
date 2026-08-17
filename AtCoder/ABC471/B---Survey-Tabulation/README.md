# [B---Survey-Tabulation](https://atcoder.jp/contests/abc471/tasks/abc471_b)

> **Platform:** `AtCoder` | **Time Limit:** `2 sec` | **Memory Limit:** `1024 MiB`  
> **Direct Link:** [Open Problem Statement](https://atcoder.jp/contests/abc471/tasks/abc471_b)

---

### 📖 Problem Statement
Takahashi is tallying the results of a survey.
 N  people answered the survey, and the  i -th person's answer is a string  S_i  consisting of English letters.
Find the maximum number of people who gave the same answer in this survey.
Here, the case of the letters in the answers is not distinguished.
For example, AtCoder, ATCODER, and atcoder are all considered the same answer.

**Constraints:**
1 \leq N \leq 100 
 S_i  is a string of length between  1  and  10  (inclusive) consisting of uppercase and lowercase English letters.
 N  is an integer.

---

### 📥 Input Specification
The input is given from Standard Input in the following format:
 N 
 S_1 
 \vdots 
 S_N

---

### 📤 Output Specification
Output the answer.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
7
ARC
abc
ahc
ABC
beginner
AbC
ahc
```

**Output:**
```text
3
```


#### Example 2
**Input:**
```text
10
x
x
x
x
x
x
x
x
x
x
```

**Output:**
```text
10
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78494383 | 2026-08-17 20:23:56 | ❌ WA | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78494383_Attempt_1_WA.java`](./78494383_Attempt_1_WA.java) |
| 2 | 78494418 | 2026-08-17 20:26:14 | ✅ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78494418_Attempt_2_AC.java`](./78494418_Attempt_2_AC.java) |
| 3 | 78494462 | 2026-08-17 20:28:52 | ✅ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78494462_Attempt_3_AC.java`](./78494462_Attempt_3_AC.java) |
