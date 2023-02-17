package com.ms.hrpayroll.entities.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.hrpayroll.entities.Payment;
import com.ms.hrpayroll.entities.Worker;
import com.ms.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient wFC;
	
	public Payment getPayment(long workerId, int days) {
		Worker w = wFC.findById(workerId).getBody();
		return new Payment(w.getName(), w.getDailyIncome(), days); }

}
