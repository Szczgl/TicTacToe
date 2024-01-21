package com.example.tictactoe;

import com.tictactoe.board.CreateBoard;
import com.tictactoe.check.CheckLine;
import com.tictactoe.language.LanguageText;
import com.tictactoe.user.UserGetName;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

public class TicTacToeApplicationTests {

    private CheckLine checkLine;
    private CreateBoard createBoard;
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
        createBoard = new CreateBoard();

        when(mockUserGetName.getText()).thenReturn(mockText);
    }

    @DisplayName("One line with O in row")
    @Test
    void testWinOInRowOneLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"O");
        createBoard.setBoard(0,1,"O");
        createBoard.setBoard(0,2,"O");

        //When
        checkLine.checkLineRow(createBoard, mockUserGetName);


        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with O in row")
    @Test
    void testWinOInRowFullLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard.setBoard(i, j, "O");
            }
        }

        //When
        checkLine.checkLineRow(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }
    @DisplayName("One line with X in row")
    @Test
    void testWinXInRowOneLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"X");
        createBoard.setBoard(0,1,"X");
        createBoard.setBoard(0,2,"X");

        //When
        checkLine.checkLineRow(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with X in row")
    @Test
    void testWinXInRowFullLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard.setBoard(i, j, "X");
            }
        }

        //When
        checkLine.checkLineRow(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }

    @DisplayName("One line with O in column")
    @Test
    void testWinOInColumnOneLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"O");
        createBoard.setBoard(1,0,"O");
        createBoard.setBoard(2,0,"O");

        //When
        checkLine.checkLineCol(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with O in column")
    @Test
    void testWinOInColumnFullLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard.setBoard(i, j, "O");
            }
        }

        //When
        checkLine.checkLineCol(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }
    @DisplayName("One line with X in column")
    @Test
    void testWinXInColumnOneLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"X");
        createBoard.setBoard(1,0,"X");
        createBoard.setBoard(2,0,"X");

        //When
        checkLine.checkLineCol(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Three line with X in column")
    @Test
    void testWinXInColumnFullLine() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                createBoard.setBoard(i, j, "X");
            }
        }

        //When
        checkLine.checkLineCol(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(3)).userWin();
    }

    @DisplayName("One line with O in slash")
    @Test
    void testWinOInSlash() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"O");
        createBoard.setBoard(1,1,"O");
        createBoard.setBoard(2,2,"O");

        //When
        checkLine.checkLineSlash(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("One line with X in slash")
    @Test
    void testWinXInSlash() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"X");
        createBoard.setBoard(1,1,"X");
        createBoard.setBoard(2,2,"X");

        //When
        checkLine.checkLineSlash(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("One line with O in backslash ")
    @Test
    void testWinOInBackslash() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,2,"O");
        createBoard.setBoard(1,1,"O");
        createBoard.setBoard(2,0,"O");

        //When
        checkLine.checkLineBackslash(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("One line with X in backslash")
    @Test
    void testWinXInBackslash() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(2,0,"X");
        createBoard.setBoard(1,1,"X");
        createBoard.setBoard(0,2,"X");

        //When
        checkLine.checkLineBackslash(createBoard, mockUserGetName);

        //Then
        verify(mockText, times(1)).userWin();
    }

    @DisplayName("Draw, no win")
    @Test
    void testDrawNoWin() {
        //Given
        createBoard.setBoardSize(3);
        createBoard.declarationEmptyBoard();
        createBoard.setBoard(0,0,"X");
        createBoard.setBoard(0,1,"O");
        createBoard.setBoard(0,2,"X");
        createBoard.setBoard(1,0,"X");
        createBoard.setBoard(1,1,"O");
        createBoard.setBoard(1,2,"X");
        createBoard.setBoard(2,0,"O");
        createBoard.setBoard(2,1,"X");
        createBoard.setBoard(2,2,"O");

        //When
        checkLine.checkLineAll(createBoard, mockUserGetName);

        //Then
        verify(mockText, never()).userWin();
        assertFalse(checkLine.isEndGame());
    }


}
