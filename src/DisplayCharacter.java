import java.io.*;

public class DisplayCharacter {
	
	public static void main(String args[]) throws java.io.IOException{
		for(int i=32 ; i<127 ; i++) {
			System.out.write(i);
			if(i%8 ==7) {
				System.out.write('\n');
			}else {
				System.out.write('\t');
			}
			
		}
		
		System.out.write('\n');
	}
	
	
}
