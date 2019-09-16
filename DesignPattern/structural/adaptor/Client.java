package adaptor;

public class Client extends AdaptorX{
	
//	@Override
//	public void m1() {
//		System.out.println("client impl of m1 method");
//	}
//
	public static void main(String[] args) {
		
		AdaptorX  client =  new Client();
		client.m1();
	}

}
