/*
 함수 solution은 정수 n을 매개변수로 입력받습니다. 
 n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 
 <제한 조건>
 n은 1이상 8000000000 이하인 자연수입니다.
*/
package level_1;

import java.util.Arrays;

public class Test211103 {

	public static void main(String[] args) {
		String str = "118372";
		char[] c = str.toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder(new String(c,0,c.length));  
		int answer = Integer.parseInt(((sb.reverse()).toString()));
		System.out.println(answer);
	}
}
