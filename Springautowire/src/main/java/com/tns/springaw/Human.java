package com.tns.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
            
	     private Heart heart;
	     
		// DipInj using constructor
	     public Human(Heart heart) {
			super();
			this.heart = heart;
		}
	     
        public Human() {
			super();
			// TODO Auto-generated constructor stub
		}

		// DepInj using setter method
	     @Autowired
	     @Qualifier("octopousHeart")
		public void setHeart(Heart heart) {
			this.heart = heart;
		}
		
		public void startPumping()
	     {
	    	 heart.pump();
	    	 System.out.println("name of the animal is :" + heart.getNameOfAnimal() + " no of heart present is :" + heart.getNoOfHeart());
	     }
	      
}
