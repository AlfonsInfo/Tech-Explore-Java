package iterasi.review1._2javaoop.exampleinheritance.character;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player extends Character{
    private String playerName;
    private int playerLevel;
    private int playerHeal;
}
