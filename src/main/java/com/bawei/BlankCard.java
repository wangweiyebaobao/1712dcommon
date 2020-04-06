package com.bawei;

public class BlankCard {
	private Integer cardId;
	private String cardname;
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	@Override
	public String toString() {
		return "BlankCard [cardId=" + cardId + ", cardname=" + cardname + "]";
	}
	public BlankCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlankCard(Integer cardId, String cardname) {
		super();
		this.cardId = cardId;
		this.cardname = cardname;
	}
	
}
