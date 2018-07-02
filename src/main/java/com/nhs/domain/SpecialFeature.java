package com.nhs.domain;

public enum SpecialFeature {

	Trailers("Trailers"), Commentaries("Commentaries"), DELETEDSCENS("Deleted Scenes"), BEHINDTHESCENS(
			"Behind the Scenes");

	private String name;

	private SpecialFeature(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
