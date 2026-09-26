# Dynamic Programming (DP)

DP is a technique where we **solve smaller subproblems, store their answers, and reuse them** to avoid repeated calculations.

### Core Idea

```text
Solve → Store → Reuse
```

---

## 3 Steps of DP

### 1. Declare
Create a DP array to store subproblem results.

```java
int[] dp = new int[n + 1];
```

`n + 1` is used when states range from `0` to `n`.

### 2. Check
Before calculating, check if the answer is already stored.

```java
if (dp[n] != -1)
    return dp[n];
```

### 3. Store
After calculating, store the result.

```java
dp[n] = answer;
return dp[n];
```

### Remember

```text
DECLARE → CHECK → STORE
```

---

# Memoization

- **Top-Down approach**
- Uses **recursion + DP**
- Start from the main problem and go toward the base case.
- Stores results to avoid redundant calculations.

```text
Memoization = Recursion + Storage
```

### Flow

```text
Problem
   ↓
Recursion
   ↓
Base Case
   ↓
Check DP
   ↓
Calculate
   ↓
Store
```

---

# Tabulation

- **Bottom-Up approach**
- Uses **iteration + DP**
- Start from the base case and build toward the final answer.
- No recursion stack.

```text
Tabulation = Iteration + Storage
```

### Flow

```text
Base Case
   ↓
Iteration
   ↓
Calculate
   ↓
Store
   ↓
Final Answer
```

---

# Memoization vs Tabulation

| Memoization | Tabulation |
|---|---|
| Top-Down | Bottom-Up |
| Recursion | Iteration |
| Recursion + DP | Iteration + DP |
| Starts from main problem | Starts from base case |
| Uses recursion stack | No recursion stack |

---

## 🧠 Remember This

```text
Memoization → Top → Down
Tabulation  → Bottom → Up

DP = Solve + Store + Reuse
```

### Before solving a DP problem, identify:

```text
1. State
2. Base Case
3. Transition / Recurrence
4. What to Store
```

> **DP is mainly used to avoid solving the same subproblem repeatedly.**