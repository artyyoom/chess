package com.chess.piece;

import com.chess.Color;
import com.chess.Coordinates;

import java.util.Set;

abstract public class Piece {
    public final Color color;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }


//    Set<Coordinates> getAvailableMoveSquares() {
//        for (CoordinatesShift shift : getPieceMoves()) {
//            
//        }
//    }

    protected abstract Set<CoordinatesShift> getPieceMoves();
}
