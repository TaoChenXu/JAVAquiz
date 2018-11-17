
public class GCD {
		public  static  int divisionAlgorithm(int num1 ,int num2){
		        int max = maxNumber(num1,num2);
		        int result = 0;
		        if (max == num1){
		            int remainder = num1 % num2;
		            while (remainder != 0){
		                num1 = num2;
		                num1 = remainder;
		                remainder = num1 % num2;
		            }
		            result = num2;
		        }
		        else if(max == num2){
		            int remainder = num2 % num1;
		            while(remainder != 0){
		                    num2 = num1;
		                    num1 = remainder;
		                    remainder = num2 % num1;
		            }
		            return result;
		        }
		    }

		}

	}

}
