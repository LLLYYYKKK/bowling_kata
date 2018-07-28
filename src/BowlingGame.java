public class BowlingGame {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll += 1;
    }

    public int score() {
        int score = 0;
        int i =0;
        for (int frame = 0; frame < 10; frame++) {
            score += rolls[i] + rolls[i + 1];
            i += 2;
        }

        return score;
    }
}
