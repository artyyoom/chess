package com.chess;

import com.chess.board.Board;
import com.chess.piece.Piece;

import java.util.List;
import java.util.Set;

public class StalemateGameChecker extends GameStateChecker {

    @Override
    public GameState check(Board board, Color color) {
        List<Piece> pieces = board.getPieceByColor(color);

        for (Piece piece : pieces) {
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            if (availableMoveSquares.size() > 0) {
                return GameState.ONGOING;
            }
        }

        return GameState.STALEMATE;
    }
}
