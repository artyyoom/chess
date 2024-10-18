package com.chess.piece;

import com.chess.Color;
import com.chess.Coordinates;

import java.util.Set;

public class King extends Piece {

    public King(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
