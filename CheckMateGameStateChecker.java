package com.chess;

import com.chess.board.Board;
import com.chess.board.BoardFactory;
import com.chess.board.Move;
import com.chess.piece.King;
import com.chess.piece.Piece;

import javax.crypto.KEM;
import java.util.List;
import java.util.Set;

public class CheckMateGameStateChecker extends GameStateChecker{

    @Override
    public GameState check(Board board, Color color) {
        // check if king in check
        // check that there is no move to prevent this check

        // we trust that there is king on the board
        Piece king = board.getPieceByColor(color).stream().filter(piece -> piece instanceof King).findFirst().get();

        if (!board.isSquareAttackedByColor(king.coordinates, color.opposite())) {
            return GameState.ONGOING;
        }

        List<Piece> pieces = board.getPieceByColor(color);
        for (Piece piece : pieces) {
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            for (Coordinates coordinates : availableMoveSquares) {
                Board clone = new BoardFactory().copy(board);
                clone.makeMove(new Move(piece.coordinates, coordinates));

                Piece cloneKing = clone.getPieceByColor(color).stream().filter(p -> p instanceof King).findFirst().get();

                if (!clone.isSquareAttackedByColor(king.coordinates, color.opposite())) {
                    return GameState.ONGOING;
                }
            }
        }

        if (color == Color.WHITE) {
            return GameState.CHECHMATE_TO_WHITE_KING;
        } else {
            return GameState.CHECHMATE_TO_BLACK_KING;
        }
    }
}
