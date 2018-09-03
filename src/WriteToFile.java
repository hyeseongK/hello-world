import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
	
	static FileOutputStream fout;
	public static void main (String args[]) {
		if(args.length != 1) {
			System.err.println("파일이름을 지정하여 주십시오");
		}
		try {
			int bytesRead;
			byte[] buffer = new byte[256];
			fout = new FileOutputStream(args[0]);
			while((bytesRead = System.in.read(buffer)) >=0 ) {
				fout.write(buffer, 0 , bytesRead);
			}
		}catch(IOException e) {
			System.err.println("스트림으로부터 데이터를 읽을 수 없습니다.");
		}finally {
			try {
				if(fout != null) fout.close();
			}catch(IOException e) {
				
			}
		}
	
	}
	
}
