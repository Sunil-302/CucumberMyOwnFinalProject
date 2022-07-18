package practiceJavaCode;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		
		try {
			int div = 10/0;
			System.out.println(div);
			
		} catch (Throwable t) {
			
			t.printStackTrace();
			System.out.println(t.getMessage());			
//			throw new Exception("Intentionally errorred ");
		
			
			
			
		}
		

	}

}
