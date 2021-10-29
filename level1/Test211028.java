/* 같은 숫자는 싫어
배열 arr가 주어진다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다. 
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거한다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 한다. 

ex) arr = [1, 1, 3, 3, 0, 1, 1] => [1, 3, 0, 1] 
ex) arr = [4, 4, 4, 3, 3] => [4, 3]

<제한사항>
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
*/

package level_1;

import java.util.*;

public class Test211028 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1])
				list.add(arr[i]);
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			System.out.print(answer[i] + " ");
		}
	}
}
