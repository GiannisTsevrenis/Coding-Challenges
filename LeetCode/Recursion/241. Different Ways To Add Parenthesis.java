public class Solution {
  
    private static Map<String, List<Integer>> memoization = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        
        if (memoization.containsKey(expression)) {
            return memoization.get(expression);
        }
        List<Integer> results = new ArrayList<>();
      
        if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            results.add(Integer.parseInt(expression));
            return results;
        }
      
        for (int i = 0; i < expression.length(); i++) {
            char operation = expression.charAt(i);
          
            if (operation == '-' || operation == '+' || operation == '*') {
                List<Integer> resultsLeft = diffWaysToCompute(expression.substring(0, i));
                List<Integer> resultsRight = diffWaysToCompute(expression.substring(i + 1));
                for (int leftResult : resultsLeft) {
                    for (int rightResult : resultsRight) {
                      
                        if (operation == '-') {
                            results.add(leftResult - rightResult);
                        } else if (operation == '+') {
                            results.add(leftResult + rightResult);
                        } else if (operation == '*') {
                            results.add(leftResult * rightResult);
                        }
                    }
                }
            }
        }
        memoization.put(expression, results);
        return results;
    }
}
