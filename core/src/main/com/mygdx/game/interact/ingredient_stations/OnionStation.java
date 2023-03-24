package com.mygdx.game.interact.ingredient_stations;

import com.mygdx.game.ingredient.IngredientName;
import com.mygdx.game.interact.InteractableBase;

/**
 * @author Thomas McCarthy
 *
 * An ingredient station that gives tomato to the player
 */
public class OnionStation extends InteractableBase {

    //==========================================================\\
    //                      CONSTRUCTOR                         \\
    //==========================================================\\

    public OnionStation(float xPos, float yPos) {
        super(xPos, yPos, "station_onion.png", ingredientHashMap.get("onion-uncut"));
    }
}