package _06_vault;

public class SecretAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vault code = new Vault();
		for (int count = 0; count < 1000001; count ++) {
			if (code.tryCode(count) == true) {
				System.out.println("The Code is "+ count);
				System.exit(0);
			}
			
		}
		System.err.println("-1");
	}

}
