package com.geeks.ApiFootballConsumer.predictions;

public class Prediction {
    private String country_name;
    private String league_name;
    private String match_date;
    private String match_time;
    private String match_status;
    private String match_hometeam_name;
    private String match_awayteam_name;
    private String prob_HW;
    private String prob_AW;
    private String prob_O;
    private String prob_U;

    public Prediction() {
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getLeague_name() {
        return league_name;
    }

    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    public String getMatch_date() {
        return match_date;
    }

    public void setMatch_date(String match_date) {
        this.match_date = match_date;
    }

    public String getMatch_time() {
        return match_time;
    }

    public void setMatch_time(String match_time) {
        this.match_time = match_time;
    }

    public String getMatch_status() {
        return match_status;
    }

    public void setMatch_status(String match_status) {
        this.match_status = match_status;
    }

    public String getMatch_hometeam_name() {
        return match_hometeam_name;
    }

    public void setMatch_hometeam_name(String match_hometeam_name) {
        this.match_hometeam_name = match_hometeam_name;
    }

    public String getMatch_awayteam_name() {
        return match_awayteam_name;
    }

    public void setMatch_awayteam_name(String match_awayteam_name) {
        this.match_awayteam_name = match_awayteam_name;
    }

    public String getProb_HW() {
        return prob_HW;
    }

    public void setProb_HW(String prob_HW) {
        this.prob_HW = prob_HW;
    }

    public String getProb_AW() {
        return prob_AW;
    }

    public void setProb_AW(String prob_AW) {
        this.prob_AW = prob_AW;
    }

    public String getProb_O() {
        return prob_O;
    }

    public void setProb_O(String prob_O) {
        this.prob_O = prob_O;
    }

    public String getProb_U() {
        return prob_U;
    }

    public void setProb_U(String prob_U) {
        this.prob_U = prob_U;
    }
}
