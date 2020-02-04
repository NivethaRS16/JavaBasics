package com.java.Test;

public enum EnumInterface implements MyInterface {

	  SUM {
		    @Override
		    public String asLowercase() {
		      return SUM.toString().toLowerCase();
		    }
		  },
		  SUBTRACT {
		    @Override
		    public String asLowercase() {
		      return SUBTRACT.toString().toLowerCase();
		    }
		  };
}