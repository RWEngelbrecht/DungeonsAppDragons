package com.dungeonsappdragons.character;

public class Character {
    protected String playerName;
    protected String charName;
    protected String alignment;
    protected String hitDie;
    protected long xp;
    protected long level;
    protected long hp;
    protected int ac;

//    protected CharClass charClass;
//    protected Background background;
//    protected Race race;
//    protected Abilities abilities;

    public void newPlayer(String playerName) {
        this.playerName = playerName;
    }

    public void newCharacter(String charName) {
        this.charName = charName;
    }


}
