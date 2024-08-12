package openclose;

//if we want to add new operation then we are violating open close principle
public class BadCalculator {
      public int calculateNumber(int num1,int num2,String type) {
    	  int result=0;
		switch (type) {
		case "Sum": 
			 result= num1+num2;
		
		case "Sub":{
			result= num1-num2;
		}
		
	}
		return result; 
    }
}

