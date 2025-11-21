package Models;

import java.util.ArrayList;
import java.util.List;

public class PlayerModel {

    BoardModel playerBoard;
    BoardModel opponentBoard;

    List<ShipModel> ships = new ArrayList<>();

    public PlayerModel(){
        ships.add(new ShipModel(ShipModel.Orientation.VERTICAL,5,6));
        playerBoard = new BoardModel();
        opponentBoard = new BoardModel();
    }

    public boolean allShipsPlaced(){
        for(int i = 0; i<ships.size(); i++){
            if(ships.get(i).placed == false){
                return false;
            }
        }
        return true;
    }

}

