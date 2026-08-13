# [2744-Find-Maximum-Number-of-String-Pairs]

**Platform:** LeetCode
**Limits:** N/A | N/A
**Link:** [Problem Statement](https://leetcode.com/problems/find-maximum-number-of-string-pairs/)

---

### 📝 Problem Statement
You are given a **0-indexed** array `words` consisting of **distinct** strings.


The string `words[i]` can be paired with the string `words[j]` if:



	* The string `words[i]` is equal to the reversed string of `words[j]`.
	* `0 th string with the 2nd string, as the reversed string of word[0] is &quot;dc&quot; and is equal to words[2].
- We pair the 1st string with the 3rd string, as the reversed string of word[1] is &quot;ca&quot; and is equal to words[3].
It can be proven that 2 is the maximum number of pairs that can be formed.
```



**Example 2:**


```

**Input:** words = [&quot;ab&quot;,&quot;ba&quot;,&quot;cc&quot;]
**Output:** 1
**Explanation:** In this example, we can form 1 pair of strings in the following way:
- We pair the 0th string with the 1st string, as the reversed string of words[1] is &quot;ab&quot; and is equal to words[0].
It can be proven that 1 is the maximum number of pairs that can be formed.

```



**Example 3:**


```

**Input:** words = [&quot;aa&quot;,&quot;ab&quot;]
**Output:** 0
**Explanation:** In this example, we are unable to form any pair of strings.

```



 

**Constraints:**



	* `1 <= words.length <= 50`
	* `words[i].length == 2`
	* `words` consists of distinct strings.
	* `words[i]` contains only lowercase English letters.

---

### 📥 Input / Output Specification
**Input:** Refer to problem description.
**Output:** Refer to problem description.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```
["cd","ac","dc","ca","zz"]
```
**Output:**
```
N/A
```




---

### 📊 Submission History
| Attempt | Date & Time | Verdict | Language | File |
| :---: | :---: | :---: | :---: | :---: |
| 1 | 8/13/2026, 11:02:13 AM | ❌ Time Limit Exceeded | C++ | [`2105005120_Attempt_1_TLE.cpp`](./2105005120_Attempt_1_TLE.cpp) |
