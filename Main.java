package com.chess;


import com.chess.board.Board;
import com.chess.board.BoardFactory;

public class Main {
    public static void main(String[] args) {
        Board board = (new BoardFactory()).fromFEN(
                //"k2r3R/8/8/2P1P3/2PKP3/2PPP3/8/8 w - - 0 1"
                //"k2r4/8/8/2P1P3/2PKP3/2PPP3/8/8 w - - 0 1"
                // "rnb1kbnr/pppp1ppp/8/4p3/6Pq/5P2/PPPPP2P/RNBQKBNR w KQkq - 0 1"
                //"3k4/3P4/8/3K4/8/8/8/8 w - - 0 1"
                //"8/8/8/8/6p1/3k1pP1/3p1P2/3K3N w - - 0 1"
                //3k4/8/8/b7/8/8/2PK4/5N2 w - - 0 1
                //rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1a
                //k7/6p1/4p3/8/4K3/8/8/8 w - - 0 1

                "rnbqkbnr/ppppp2p/5p2/6pQ/4P3/8/PPPP1PPP/RNB1KBNR w KQkq - 0 1"
        );

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();

        Game game = new Game(board);
        game.gameLoop();
    }
}