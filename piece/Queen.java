package com.chess.piece;

import com.chess.Color;
import com.chess.Coordinates;

import java.util.Set;

public class Queen extends Piece {

    public Queen(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
