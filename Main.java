package com.chess;


public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecePositions();

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        renderer.render(board);

        int a = 123;
    }
}