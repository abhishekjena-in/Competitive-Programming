# [World-Chess-Championship](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/WCC)

> **Platform:** `CodeChef`  
> **Direct Link:** [Open Problem Statement](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/WCC)

---

### 📖 Problem Statement
The World Chess Championship 202220222022 is about to start. 141414 Classical games will be played between Chef and Carlsen in the championship, where each game has one of three outcomes — it can be won by Carlsen, won by Chef, or it can be a draw. The winner of a game gets 222 points, and the loser gets 000 points. If it’s a draw, both players get 111 point each.

The total prize pool of the championship is 100⋅X100 \cdot X100⋅X. At end of the 141414 Classical games, if one player has strictly more points than the other, he is declared the champion and gets 60⋅X60 \cdot X60⋅X as his prize money, and the loser gets 40⋅X40 \cdot X40⋅X.

If the total points are tied, then the defending champion Carlsen is declared the winner. However, if this happens, the winner gets only 55⋅X55 \cdot X55⋅X, and the loser gets 45⋅X45 \cdot X45⋅X.

Given the results of all the 141414 games, output the prize money that Carlsen receives.

The results are given as a string of length 141414 consisting of the characters C, N, and D.

For each test case, output in a single line the total prize money won by Carlsen.

Subtask #1 (100 points): Original constraints

Test case 111: Since Carlsen won all the games, he will be crowned the champion and will get 60⋅X60 \cdot X60⋅X as the prize money which is 60⋅100=600060 \cdot 100 = 600060⋅100=6000

Test case 222: Carlsen won 777 games and drew 777, so his score is 2⋅7+1⋅7=212 \cdot 7 + 1 \cdot 7 = 212⋅7+1⋅7=21. Chef lost 777 games and drew 777, so his score is 0⋅7+1⋅7=70 \cdot 7 + 1 \cdot 7 = 70⋅7+1⋅7=7. Since Carlsen has more points, he will be crowned the champion and will get 60⋅X60 \cdot X60⋅X as the prize money which is 60⋅400=2400060 \cdot 400 = 2400060⋅400=24000

Test case 333: Carlsen and Chef both end up with 141414 points. So, Carlsen is declared the winner, but because the points were tied, he receives 55⋅X=55⋅30=165055\cdot X = 55\cdot 30 = 165055⋅X=55⋅30=1650 in prize money.

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
100
CCCCCCCCCCCCCC
400
CDCDCDCDCDCDCD
30
DDCCNNDDDCCNND
1
NNDNNDDDNNDNDN
```

**Output:**
```text
6000
24000
1650
40
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | cc_1786758464988 | 8/15/2026, 7:17:50 AM | ❌ Compilation Error | 0 ms | 0 KB | Java | [`cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java`](./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java./cc_1786758464988_Attempt_1_CE.java) |
| 2 | cc_1786758580878 | 8/15/2026, 7:19:47 AM | ❌ Compilation Error | 0 ms | 0 KB | Java | [`cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java`](./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java./cc_1786758580878_Attempt_2_CE.java) |
| 3 | cc_1786758633339 | 8/15/2026, 7:20:42 AM | ❌ Compilation Error | 0 ms | 0 KB | Java | [`cc_1786758633339_Attempt_3_CE.java./cc_1786758633339_Attempt_3_CE.java./cc_1786758633339_Attempt_3_CE.java./cc_1786758633339_Attempt_3_CE.java`](./cc_1786758633339_Attempt_3_CE.java./cc_1786758633339_Attempt_3_CE.java./cc_1786758633339_Attempt_3_CE.java./cc_1786758633339_Attempt_3_CE.java) |
| 4 | cc_1786758686174 | 8/15/2026, 7:21:32 AM | ❌ Runtime Error | 0 ms | 0 KB | Java | [`cc_1786758686174_Attempt_4_RTE.java./cc_1786758686174_Attempt_4_RTE.java`](./cc_1786758686174_Attempt_4_RTE.java./cc_1786758686174_Attempt_4_RTE.java) |
| 5 | cc_1786758836655 | 8/15/2026, 7:24:07 AM | ✅ Accepted | 0 ms | 0 KB | Java | [`cc_1786758836655_Attempt_5_AC.java`](./cc_1786758836655_Attempt_5_AC.java) |
