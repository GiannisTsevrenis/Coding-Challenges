class Solution {
    public int maxScore(String s) {
        int currentOnesScore = 0;
        for (int i= 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                currentOnesScore++;
            }
        }
        int bestScore = -1;
        int currentZeroScore = 0;
        int currentScore;
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) == '1'){
                currentOnesScore--;
            }
            if (s.charAt(i) == '0'){
                currentZeroScore++;
            }
            currentScore = currentZeroScore+currentOnesScore;
            bestScore = Math.max(currentScore,bestScore);
        }
        return bestScore;
    }
}
