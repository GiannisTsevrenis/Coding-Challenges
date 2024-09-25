    public static int[] sumPrefixScores(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int totalWords = words.length;
        for (String word : words) {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                map.merge(word.substring(0, i + 1), 1, Integer::sum);
            }
        }
        int[] result = new int[totalWords];
        int wordSum;
        int wordLength;
        for (int i = 0; i < totalWords; i++) {
            wordSum = 0;
            wordLength = words[i].length();
            for (int j = 0; j < wordLength; j++) {
                int check = map.get(words[i].substring(0, j + 1));
                if (check == 1) {
                    wordSum += wordLength - j;
                    break;
                }
                wordSum += check;
            }
            result[i] = wordSum;
        }
        return result;
    }
