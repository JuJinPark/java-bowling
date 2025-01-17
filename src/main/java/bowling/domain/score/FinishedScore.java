package bowling.domain.score;

public class FinishedScore implements Score {

    private final int score;

    private FinishedScore(int score) {
        this.score = score;
    }

    public static FinishedScore of(int score) {
        return new FinishedScore(score);
    }

    @Override
    public int currentScore() {
        return score;
    }

    @Override
    public boolean isNecessaryToCalculateMore() {
        return false;
    }

    @Override
    public boolean isFullyCalculated() {
        return true;
    }

    @Override
    public Score calculatedScore(int toAdd) {
        throw new IllegalStateException("이미 계산이 종료 되었습니다.");
    }
}
