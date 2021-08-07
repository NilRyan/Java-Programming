/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Team {
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int gamesPlayed = 0;
    
    public Team (String name) {
        this.name = name;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
    public int getGamesPlayed() {
        return this.gamesPlayed;
    }
    
    public void addWins() {
        this.wins++;
        this.gamesPlayed++;
    }
    
    public void addLosses() {
        this.losses++;
        this.gamesPlayed++;
    }
    
}
