package com.chess;


import com.chess.piece.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Board board = new Board();
//        board.setupDefaultPiecePositions();

        Board board = new BoardFactory().fromFEN("k7/6p1/4p3/8/4K3/8/8/8 w - - 0 1");
        //rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1a/

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
//        renderer.render(board);
//
//        Piece piece = board.getPiece(new Coordinates(File.G, 8));
//        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);
//
//        int a = 123;

        Game game = new Game(board);
        game.gameLoop();
    }
}