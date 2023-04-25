package com.aluriClasses.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
*
* @author Nagesh Aluri
*/

@Entity
public class Trainer {
	
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	@Override
	public String toString() {
		return "Trainer [trainerID=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	

}
