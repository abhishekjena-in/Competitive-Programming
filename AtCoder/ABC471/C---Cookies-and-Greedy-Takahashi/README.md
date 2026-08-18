# [C---Cookies-and-Greedy-Takahashi](https://atcoder.jp/contests/abc471/tasks/abc471_c)

> **Platform:** `AtCoder` | **Time Limit:** `2 sec` | **Memory Limit:** `1024 MiB`  
> **Direct Link:** [Open Problem Statement](https://atcoder.jp/contests/abc471/tasks/abc471_c)

---

### 📖 Problem Statement
There are cookies at  N  positions on a number line. The coordinate of the  i -th cookie is  A_i .
Takahashi is initially at coordinate  0  on the number line, and repeats the following action until he has picked up all  N  cookies.

Action: Move to the coordinate of the nearest cookie from his current position (if there are multiple such cookies, the one with the smallest coordinate), and pick up that cookie.

Find the total distance Takahashi travels until he picks up all the cookies.

**Constraints:**
1 \leq N \leq 3\times 10^5 
 -10^9 \leq A_i \leq 10^9 
 A_i\neq 0 
The  A_i  are distinct.
All input values are integers.

---

### 📥 Input Specification
The input is given from Standard Input in the following format:
 N 
 A_1   \dots   A_N

---

### 📤 Output Specification
Output the answer.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
4
-1 -4 2 -11
```

**Output:**
```text
23
```


#### Example 2
**Input:**
```text
10
1 2 3 4 5 -1 -2 -3 -4 -6
```

**Output:**
```text
17
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 78505292 | 2026-08-18 13:46:18 | ✅ AC | 0 ms | 0 KB | Java24 (OpenJDK 24.0.2) | [`78505292_Attempt_1_AC.java`](./78505292_Attempt_1_AC.java) |
