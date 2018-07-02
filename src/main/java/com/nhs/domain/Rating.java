package com.nhs.domain;

public enum Rating {

	G("G"), PG("PG"), PG_13("PG-13"), R("R"), NG_17("NC-17");
	
    private String name ;

	private Rating(String name) {
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
