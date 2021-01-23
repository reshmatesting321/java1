package sampConcepts;

public class ThisKeyword {

	
			int variable = 5; //this.variable inside local method like method
			
		public ThisKeyword(){
				
			}
			
			void method(int variable) {
				//variable = 10;
				//this.variable = variable;
				//variable=10;
				System.out.println("Value of Instance variable :" + this.variable);
				System.out.println("Value of Local variable :" + variable);
			}
			void method1() {
				int variable = 40;
				System.out.println("Value of Instance variable :" + this.variable);
				System.out.println("Value of Local variable :" + variable);
			}
			
			public static void main(String args[]) {
				ThisKeyword obj = new ThisKeyword();
				obj.method(20);
				obj.method1();
			}

	}


