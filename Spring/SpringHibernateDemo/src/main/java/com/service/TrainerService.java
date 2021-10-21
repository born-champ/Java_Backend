package com.service;

import org.springframework.stereotype.Service;

import com.bean.Trainer;
import com.orm.TrainerORM;

@Service
public class TrainerService {
	TrainerORM trainerOrm;
	public String storeTrainer(Trainer trainer) {
		if (trainerOrm.storeTrainerInfo(trainer)){
			return "stored";
		} else {
			return "didn't stored";

		}
	}
	
	

}
