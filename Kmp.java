package kmpalgorithm;

public class Kmp {
	void search(String pat, String txt){
		int A = pat.length();
		int B = txt.length();
		int lps[] = new int[A]; // hold for the longest
		int index = 0; // index for pat
		int i =0; // index for txt 
//		compute(pat, A, lps);
		while(i< B) {
			if(pat.charAt(index) == txt.charAt(i)) {
				index++;
				i++;
			}
			if (index == A) {
				System.out.println("pattern found in a given string at index:" +(i-index));
				index = lps[index - 1];
			}
			else if(i< B && pat.charAt(index) != txt.charAt(i)) {
				if (index != 0) {
					index = lps[index - 1];
				}
				else{
					i = i+1;
				}
			}
		}
	}
	void compute(String pat ,int A, int lps[]) {
		int len = 0;
		int  i = 1;
		lps[0] = 0;
		while(i < A){
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				i++;
				lps[i]=len;
			}
			else {
				if (len != 0) {
					len = lps[len - 1];
				}
				else {
				lps[i] = len;
				i++;
			}
		}
	}
}

	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABDAB";
		new Kmp().search(pat, txt);
	}

}
