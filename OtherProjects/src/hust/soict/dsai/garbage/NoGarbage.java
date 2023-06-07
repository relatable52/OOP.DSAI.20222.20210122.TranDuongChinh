package hust.soict.dsai.garbage;

class NoGarbage {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		char a = 'a';
		for(int i=0; i<500000; i++) {
			sb.append(a);
		}
		String s = sb.toString();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
