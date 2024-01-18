package com.example.tictactoe;

import com.tictactoe.board.CreateBoard3x3;
import com.tictactoe.check.CheckLine;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

public class TicTacToeApplicationTests {

    private CheckLine checkLine;
    private CreateBoard3x3 createBoard3x3;
    private UserGetName mockUserGetName;
    private LanguageText mockText;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("\nTest Suite: end");
    }

    @BeforeEach
    void setUp() {
        //Given
        mockUserGetName = mock(UserGetName.class);
        mockText = mock(LanguageText.class);
        checkLine = new CheckLine();
        createBoard3x3 = new CreateBoard3x3();

        when(mockUserGetName.getText()).thenReturn(mockText);
    }

    @DisplayName("One line with O in row")
    @Test
    void testWinOInRowOneLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"O");
        createBoard3x3.setBoard(0,1,"O");
        createBoard3x3.setBoard(0,2,"O");

        //When
        checkLine.checkLineRow(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with O in row")
    @Test
    void testWinOInRowFullLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard3x3.setBoard(i, j, "O");
            }
        }

        //When
        checkLine.checkLineRow(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }
    @DisplayName("One line with X in row")
    @Test
    void testWinXInRowOneLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"X");
        createBoard3x3.setBoard(0,1,"X");
        createBoard3x3.setBoard(0,2,"X");

        //When
        checkLine.checkLineRow(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with X in row")
    @Test
    void testWinXInRowFullLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard3x3.setBoard(i, j, "X");
            }
        }

        //When
        checkLine.checkLineRow(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }

    @DisplayName("One line with O in column")
    @Test
    void testWinOInColumnOneLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"O");
        createBoard3x3.setBoard(1,0,"O");
        createBoard3x3.setBoard(2,0,"O");

        //When
        checkLine.checkLineCol(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with O in column")
    @Test
    void testWinOInColumnFullLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard3x3.setBoard(i, j, "O");
            }
        }

        //When
        checkLine.checkLineCol(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }
    @DisplayName("One line with X in column")
    @Test
    void testWinXInColumnOneLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"X");
        createBoard3x3.setBoard(1,0,"X");
        createBoard3x3.setBoard(2,0,"X");

        //When
        checkLine.checkLineCol(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with X in column")
    @Test
    void testWinXInColumnFullLine() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard3x3.setBoard(i, j, "X");
            }
        }

        //When
        checkLine.checkLineCol(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }

    @DisplayName("One line with O in slash")
    @Test
    void testWinOInSlash() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"O");
        createBoard3x3.setBoard(1,1,"O");
        createBoard3x3.setBoard(2,2,"O");

        //When
        checkLine.checkLineSlash(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("One line with X in slash")
    @Test
    void testWinXInSlash() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"X");
        createBoard3x3.setBoard(1,1,"X");
        createBoard3x3.setBoard(2,2,"X");

        //When
        checkLine.checkLineSlash(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("One line with O in backslash ")
    @Test
    void testWinOInBackslash() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,2,"O");
        createBoard3x3.setBoard(1,1,"O");
        createBoard3x3.setBoard(2,0,"O");

        //When
        checkLine.checkLineBackslash(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("One line with X in backslash")
    @Test
    void testWinXInBackslash() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(2,0,"X");
        createBoard3x3.setBoard(1,1,"X");
        createBoard3x3.setBoard(0,2,"X");

        //When
        checkLine.checkLineBackslash(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Draw, no win")
    @Test
    void testDrawNoWin() {
        //Given
        createBoard3x3.declarationEmptyBoard();
        createBoard3x3.setBoard(0,0,"X");
        createBoard3x3.setBoard(0,1,"O");
        createBoard3x3.setBoard(0,2,"X");
        createBoard3x3.setBoard(1,0,"X");
        createBoard3x3.setBoard(1,1,"O");
        createBoard3x3.setBoard(1,2,"X");
        createBoard3x3.setBoard(2,0,"O");
        createBoard3x3.setBoard(2,1,"X");
        createBoard3x3.setBoard(2,2,"O");

        //When
        checkLine.checkLineAll(createBoard3x3, mockUserGetName);

        //Then
        verify(mockText, never()).userWin();
        assertFalse(checkLine.isEndGame());
    }


}
