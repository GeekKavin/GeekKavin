public class Main {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedAlternatives = new StringBuilder();
        int i = 0, j = 0;


        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                mergedAlternatives.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                mergedAlternatives.append(word2.charAt(j++));
            }
        }
            return mergedAlternatives.toString();

        }

        public static void main (String[]args){
            Main m = new Main();
            String word1 = "kavi";
            String word2 = "chithan";
            String result = m.mergeAlternately(word1, word2);
            System.out.println(result);
        }
    }

