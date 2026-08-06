# [71A---Way-Too-Long-Words]

**Platform:** Codeforces
**Limits:** 1 second | 256 megabytes
**Link:** [Problem Statement](https://codeforces.com/problemset/problem/71/A)

---

### 📝 Problem Statement
Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

---

### 📥 Input / Output Specification
**Input:** Input

The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
**Output:** Output

Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
```
**Output:**
```
word
l10n
i18n
p43s
```




---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 384788797 | Jul/29/2026 22:35UTC+5.5 | ✅ Accepted | 140 ms | 0 KB | Java 8 | [`384788797_Attempt_1_AC.java`](./384788797_Attempt_1_AC.java) |
| 2 | 385233812 | Aug/02/2026 11:49UTC+5.5 | ✅ Accepted | 218 ms | 1300 KB | Java 21 | [`385233812_Attempt_2_AC.java`](./385233812_Attempt_2_AC.java) |
| 3 | 385895046 | Aug/06/2026 19:23UTC+5.5 | ❌ Wrong answer on test 1 | 15 ms | 0 KB | C++20 (GCC 13-64) | [`385895046_Attempt_3_WA.cpp`](./385895046_Attempt_3_WA.cpp) |
| 4 | 385895244 | Aug/06/2026 19:25UTC+5.5 | ❌ Wrong answer on test 1 | 31 ms | 0 KB | C++20 (GCC 13-64) | [`385895244_Attempt_4_WA.cpp`](./385895244_Attempt_4_WA.cpp) |
| 5 | 385895455 | Aug/06/2026 19:26UTC+5.5 | ❌ Wrong answer on test 1 | 15 ms | 0 KB | C++20 (GCC 13-64) | [`385895455_Attempt_5_WA.cpp`](./385895455_Attempt_5_WA.cpp) |
| 6 | 385895573 | Aug/06/2026 19:27UTC+5.5 | ❌ Wrong answer on test 2 | 78 ms | 0 KB | C++20 (GCC 13-64) | [`385895573_Attempt_6_WA.cpp`](./385895573_Attempt_6_WA.cpp) |
| 7 | 385895757 | Aug/06/2026 19:28UTC+5.5 | ✅ Accepted | 46 ms | 100 KB | C++20 (GCC 13-64) | [`385895757_Attempt_7_AC.cpp`](./385895757_Attempt_7_AC.cpp) |
