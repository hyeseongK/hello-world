
public class ReadCharacters {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		
		int data;
		while((data = System.in.read()) >= 0) {
			System.out.write(data);
		}
		
	}

}
