package csc207.fall2018.gamecentreapp.ScoreManagement;

import org.junit.Test;

import csc207.fall2018.gamecentreapp.SubtractSquareGame.SubtractSquareGame;
import csc207.fall2018.gamecentreapp.SubtractSquareGame.SubtractSquareState;

import static org.junit.Assert.*;

public class SubtractSquareScoreTest {
    @Test
    public void testSetAndGet(){
        SubtractSquareState state = new SubtractSquareState("Heng", "Kan");
        SubtractSquareScore subtractSquareScore = new SubtractSquareScore();
        subtractSquareScore.takeInStateAndTime(state, 90);
        assertEquals("Heng", subtractSquareScore.returnPlayerName());
        assertEquals(SubtractSquareGame.getGameName(), subtractSquareScore.returnGameName());
    }

    @Test
    public void testCalculateScore(){
        SubtractSquareState state = new SubtractSquareState("Heng", "Kan");
        SubtractSquareScore subtractSquareScore = new SubtractSquareScore();
        subtractSquareScore.takeInStateAndTime(state, 200);
        assertEquals("0", subtractSquareScore.calculateScore());
        SubtractSquareState state2 = state.makeMove("1");
        subtractSquareScore.takeInStateAndTime(state2, 200);
        assertEquals("50", subtractSquareScore.calculateScore());

    }
}