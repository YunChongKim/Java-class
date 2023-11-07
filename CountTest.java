package Chap06;

class Count {
	public static int totalCount; //클래스 필드 선언(static)
	int count; //인스턴스 필드 선언
}

public class CountTest { //파일명과 동일한 클래스만 public 지정 가능
		public static void main(String[] args) {
			Count c1 = new Count();
			Count c2 = new Count();
			Count c3 = new Count();
			
			c1.count++; //필드값 증가
			Count.totalCount++; //count는 각기 다른 독립된 인스턴스여서 각 1씩 증가하지만
			c2.count++; // totalcount는 모든 인스턴스가 공유하기때문에 증가값이 누적됨.
			Count.totalCount++;
			c3.count++;
			Count.totalCount++;
			System.out.println(Count.totalCount + " : " + c1.count);
			System.out.println(Count.totalCount + " : " + c2.count);
			System.out.println(Count.totalCount + " : " + c3.count);
		
		}

}
