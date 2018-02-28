public class InsertionSort {
	public static int[] sort(int[] input) {
		for(int i = 1;i<input.length;i++) {
			int tmp = input[i];
			int j;
			for(j = i;j>0&&tmp>input[j-1];j--) {
				input[j] = input[j-1];
			}
			input[j] = tmp;
			
		}
		return input;
		
	}
	public static void main(String[] args) {
		int[] a = {10,50,0,21,2};
		System.out.println(sort(a)[1]);
		 
	}

}
