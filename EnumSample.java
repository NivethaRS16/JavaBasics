package com.java.Test;


public class EnumSample {
	
	enum Level1{
		HIGH(1),
		MEDIUM(2),
		LOW(3);
		private final int levelCode;

	    Level1(int levelCode) {
	        this.levelCode = levelCode;
	    }
	    
	    public int getLevelCode() {
	        return this.levelCode;
	    }
	    
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Level t1 = Level.MEDIUM;
		//System.out.println(t1.toString());
		for(Level1 t1 : Level1.values())
		{
			System.out.println(t1.getLevelCode());
		}
	
	}

}
