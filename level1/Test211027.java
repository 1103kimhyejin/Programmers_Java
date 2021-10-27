/* k번째 수
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
commands의 모든 원소에 대해 
앞서 설명한 연산을 적용했을 때 나온 결과를
배열에 담아 return 하도록 solution 함수를 작성해주세요.

<제한사항>
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.

ex) array: [1, 5, 2, 6, 3, 7, 4] 
commands: [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
return: [5, 6, 3]
*/

package level_1;

import java.util.Arrays;

public class Test211027 {

	public static void main(String[] args) {
			int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
			int[] array = {1,5,2,6,3,7,4};
			int[] answer = new int[commands.length];

			for(int i=0; i<commands.length; i++){
			    int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			    //Array.copyOfRange(): 특정 배열의 원하는 범위만큼 복사하여 새로운 배열을 만드는 메소드함수
			    //=> API를 이용했다면 간단했던 문제!
			    Arrays.sort(temp);
			    answer[i] = temp[commands[i][2]-1];
			    			    
			}
			
			for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
			}
    }
}
			
/*			int[][] temp = new int[commands.length][];
			int[] answer = {};
			
			//1. array 자르고 정렬
			for(int i = 0; i<commands.length; i++ ) { 
			int k = commands[i][0];
			
			for(int j = 0; j<=commands[i][1]-k; j++) {
				temp[i][j] = array[j+k-1];			}

			for(int i = 0; i<commands.length; i++ ) { for(int j = commands[i][0]-1;
			j<commands[i][1]; j++) { for(int k =0; k<=commands[i][1]-commands[i][0]; k++)
			answer[k] = array[j]; } }
		
			//2. k번째 수 꺼내오기
			System.out.println(answer);
*/