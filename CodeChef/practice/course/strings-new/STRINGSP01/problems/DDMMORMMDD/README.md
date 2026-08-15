# [DDMM-or-MMDD](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/DDMMORMMDD)

> **Platform:** `CodeChef`  
> **Direct Link:** [Open Problem Statement](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/DDMMORMMDD)

---

### 📖 Problem Statement
Chef is confused by all the different formats dates can be written in. Here's a simple problem Chef wants you to solve.

You are given a date string SSS. The date follows the Gregorian calendar, the one used in most parts of the world.

Identify whether it is of the form DD/MM/YYYY or MM/DD/YYYY, or if it can be of both forms. Here DD denotes the 2-digit day, MM denotes the 2-digit month and YYYY denotes the 4-digit year.

It is guaranteed that SSS is a valid date taking at least one of these forms.

For example,

For each test case, output "BOTH" if the date string satisfies both forms. Otherwise output "DD/MM/YYYY" if it is of the form DD/MM/YYYY, else "MM/DD/YYYY". Note that the output may be case-insensitive. So "DD/MM/YYYY", "dd/mm/yyyy" and so on will be considered the same.

Fun fact: 29/02/2024 (read as DD/MM/YYYY) is a leap year day.

---

### 📥 Input Specification
Standard Input

---

### 📤 Output Specification
Standard Output

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
4
21/05/2001
10/15/2069
05/11/1999
29/02/2024
```

**Output:**
```text
DD/MM/YYYY
MM/DD/YYYY
BOTH
DD/MM/YYYY
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | cc_1786759933372 | 8/15/2026, 7:42:21 AM | ❌ Compilation Error | 0 ms | 0 KB | Java | [`cc_1786759933372_Attempt_1_CE.java`](./cc_1786759933372_Attempt_1_CE.java) |
