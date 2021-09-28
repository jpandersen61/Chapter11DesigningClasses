package com.company;

public class Tile {
    private int value;
    private char letter;

    Tile(int val, char let)
    {
        value = val;
        letter = let;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int val)
    {
        value = val;
    }

    public char getLetter()
    {
        return letter;
    }

    public void setLetter(char let)
    {
        letter = let;
    }

    public String toString() {
        return "Tile: Value:" + value + " Letter: " + letter;
    }

    public boolean equals(Tile that)
    {
        return value == that.value && letter == that.letter;
    }

}
