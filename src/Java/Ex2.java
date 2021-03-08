package Java;

public class Ex2 {

	public static void main(String[] args) {
		boolean b = false; //논리 자료형 참 거짓을 나타낼때 쓴다
		b= true;
		
		boolean toBe = false;
		b = toBe || !toBe;
		if(b) {
			System.out.println(toBe);
		}
		

	}

}
