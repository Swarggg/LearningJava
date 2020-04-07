public class RandomPhraseGenerator {
    public static void main(String[] args) {
        //задаем массивы слов
        for (int i=0; i<=10; i++) {
            String[] word1 = {"bad", "good", "poor", "clean", "stupid", "great"};
            String[] word2 = {"red", "blue", "yellow", "green"};
            String[] word3 = {"horse", "mouse"};

            int word1Length = word1.length;
            int word2Length = word2.length;
            int word3Length = word3.length;

            int randIndex1 = (int) (Math.random() * word1Length);
            int randIndex2 = (int) (Math.random() * word2Length);
            int randIndex3 = (int) (Math.random() * word3Length);

            System.out.println(word1[randIndex1] + " " + word2[randIndex2] + " " + word3[randIndex3]);
        }
    }
}
