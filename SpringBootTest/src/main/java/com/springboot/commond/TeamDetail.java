package com.springboot.commond;

public class TeamDetail {

	private long teamId;

	private int score;
	public TeamDetail(long teamId, int score,  String teamName) {
		super();
		this.teamId = teamId;
		this.score = score;
		
		this.teamName = teamName;
	}

	private static int round =8;

	private String teamName;

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		TeamDetail.round = round;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
