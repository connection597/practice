package Java;

public class Ex2 {

	public static void main(String[] args) {
		boolean b = false; //�� �ڷ��� �� ������ ��Ÿ���� ����
		b= true;
		
		boolean toBe = false;
		b = toBe || !toBe;
		if(b) {
			System.out.println(toBe);
		}
		

	}

}
