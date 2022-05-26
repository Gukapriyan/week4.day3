package week4.day4;

public class Axis {
	public static class AxixBank extends Bank {
		public void deposite() {
			System.out.println("Empty");
		}

		public static void main(String[] args) {
			AxixBank amt=new AxixBank();
			amt.deposite();
			amt.saving();
			amt.fixed();
		}


	}

}
