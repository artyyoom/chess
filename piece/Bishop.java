package com.chess.piece;

import com.chess.Board;
import com.chess.BoardUtils;
import com.chess.Color;
import com.chess.Coordinates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bishop extends LongRangePiece implements IBishop {

    public Bishop(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return getBishopMoves();
    }
}
