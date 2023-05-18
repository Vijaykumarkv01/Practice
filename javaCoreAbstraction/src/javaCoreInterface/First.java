package javaCoreInterface;

public interface First {
	
		   void firstInterface();
		}
interface Second extends First {
		   void secondInterface();
		}
class Original implements Second {
		  
		@Override
		public void firstInterface() {
			System.out.println("First interface is running");
			
		}
		@Override
		public void secondInterface() {
			System.out.println("Second interfcae is running");
			
		}
}
