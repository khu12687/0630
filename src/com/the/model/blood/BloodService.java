package com.the.model.blood;

public class BloodService {
	public String getAdivce(String blood) {
		String msg = null;
		if(blood.equals("A")){
			msg="짱";
		}else if(blood.equals("B")){
			msg="폭망함";
		}else if(blood.equals("O")){
			msg="ㅇㅇ";
		}else if(blood.equals("AB")){
			msg="xx";
		}
		return msg;
	}
}
