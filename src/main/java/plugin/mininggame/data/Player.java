package plugin.mininggame.data;


import lombok.Getter;
import lombok.Setter;

/**
 * MiningGame2のゲームを実行する際のプレイヤー情報を扱うオブジェクト
 * プレイヤー名、合計点数、日時などの情報を持つ
 */
@Getter
@Setter
public class Player {

    private String playerName;
    private int score;
    private int gameTime;

    public Player(String playerName) {
        this.playerName = playerName;
    }
}
