package practice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
	
		int score[] = {85,90,95,100,75};
		//name : score 배열 선언 및 값 입력
		int score2[] = Arrays.copyOf(score, score.length);
		//Arrays.copyOf=배열을 복사한다/(score, score.length)=복사대상 : score,0번지부터 score의 길이만큼 
		int score3[] = Arrays.copyOfRange(score, 3,5);
		//Range(score, 3,5)=복사대상 : score,3번지부터 5번지앞까지(3~4번) 복사한다.=100,75
		
		int score4[] = new int[score.length];
		//score과 길이를 담은(=같은) 배열을 생성하고 score4라고 한다.
		System.arraycopy(score,0,score4,0,score.length);
		//arraycopy()매서드:배열기능복사기능有,(복사할 원본,복사'할' 원본시작위치,복사될대상,복사'될'곳의시작위치,복사할배열의 길이)
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score3));
		System.out.println(Arrays.toString(score));
		//score함수를 문자열로 반환
		
		System.out.println(Arrays.equals(score, score2));
		//score&score2가 같은함수인지 비교해라
		Arrays.sort(score);
		// score배열을 오름차순으로 정렬해라
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.equals(score, score2));
		int index = Arrays.binarySearch(score,100);
		System.out.println(index);
//		System.out.println(score);
//		System.out.println(score);
		
	}

}
