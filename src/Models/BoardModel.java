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
        boardArray = new CellState[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
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
