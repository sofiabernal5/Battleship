package Models;

public class BoardModel {
    public enum CellState{
        EMPTY,           // No ship, not attacked
        SHIP,            // Ship here, not attacked yet
        MISS,            // Attacked, no ship was here
        HIT,             // Attacked, ship was here
        SUNK
    }
    private CellState[][] boardArray;

    public BoardModel(){
        boardArray = new CellState[10][10];
        for (int row = 1; row < 11; row++) {
            for (int col = 1; col < 11; col++) {
                boardArray[row][col] = CellState.EMPTY;
            }
        }
    }

    public CellState getCellState(int row, int col){
        return boardArray[row][col];
    }
    public void setCellState(int row, int col, CellState state){
        boardArray[row][col] = state;
    }


}
