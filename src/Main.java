import src.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Battleship Board Test ===\n");

        // Test 1: Create and initialize board
        BoardModel board = new BoardModel();
        System.out.println("✓ Board created\n");

        // Test 2: Print empty board
        System.out.println("Empty board:");
        printBoard(board);

        // Test 3: Set some cells
        System.out.println("\nSetting some cells...");
        board.setCellState(0, 0, BoardModel.CellState.SHIP);
        board.setCellState(0, 1, BoardModel.CellState.SHIP);
        board.setCellState(0, 2, BoardModel.CellState.SHIP);
        board.setCellState(5, 5, BoardModel.CellState.HIT);
        board.setCellState(3, 7, BoardModel.CellState.MISS);

        // Test 4: Print modified board
        System.out.println("\nBoard after modifications:");
        printBoard(board);

        // Test 5: Get individual cells
        System.out.println("\nTesting getCellState:");
        System.out.println("Cell (0,0): " + board.getCellState(0, 0));
        System.out.println("Cell (5,5): " + board.getCellState(5, 5));
        System.out.println("Cell (9,9): " + board.getCellState(9, 9));
    }

    // Helper method to print the board
    private static void printBoard(BoardModel board) {
        // Print column headers
        System.out.print("   ");
        for (int col = 0; col < 10; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        // Print each row
        for (int row = 0; row < 10; row++) {
            System.out.print(row + "  "); // Row number
            for (int col = 0; col < 10; col++) {
                BoardModel.CellState state = board.getCellState(row, col);
                System.out.print(getCellSymbol(state) + " ");
            }
            System.out.println();
        }
    }

    // Convert CellState to a readable symbol
    private static String getCellSymbol(BoardModel.CellState state) {
        switch (state) {
            case EMPTY: return "·";
            case SHIP: return "S";
            case HIT: return "X";
            case MISS: return "O";
            default: return "?";
        }
    }
}