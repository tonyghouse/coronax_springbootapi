package com.coronax.sbapi;

public class Coronax_stats {
	String country;
	int population;
	int alive;
	int recovered;
	int dead;
	int vaccinated;
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getAlive() {
		return alive;
	}

	public void setAlive(int alive) {
		this.alive = alive;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getDead() {
		return dead;
	}

	public void setDead(int dead) {
		this.dead = dead;
	}

	public int getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(int vaccinated) {
		this.vaccinated = vaccinated;
	}

	public Coronax_stats() {
		super();
	}

	public static void main(String[] args) {
		System.out.println("corona virus stats loading.....!");

	}

}
