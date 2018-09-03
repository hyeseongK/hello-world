import java.io.IOException;

public class ReadCharactersOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int bufferCapacity = 80;
			int size = 0;
			int dataRead;
			byte buffer[] = new byte[bufferCapacity];
			while((dataRead = System.in.read(buffer, size, bufferCapacity-size)) >= 0 ) {
				size += dataRead;
			}
			System.out.write(buffer, 0, size);
			
		}catch(IOException e) {
			System.err.println("스트림으로부터 데이터를 읽을 수 없다");
		}
	}
}

