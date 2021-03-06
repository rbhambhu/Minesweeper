package com.example.ancelnicolas91.minesweeper;

public class Scores {

    private int _id;
    private String pseudo;
    private Integer cases;
    private Integer mines;
    private String time;
    private String win;

    public Scores(){}

    public Scores(String pseudo, Integer cases, Integer mines, String time, String win){
        this.pseudo = pseudo;
        this.cases = cases;
        this.mines = mines;
        this.time = time;
        this.win = win;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Integer getCases() {
        return cases;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getMines() {
        return mines;
    }

    public void setMines(Integer mines) {
        this.mines = mines;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

}