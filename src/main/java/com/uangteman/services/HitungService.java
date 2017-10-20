package com.uangteman.services;

import org.springframework.stereotype.Service;

@Service("hitungService")
public class HitungService {

	public int add(int a, int b){
		return a+b;
	}
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public double devided(double a, double b){
		return a/b;
	}
}
