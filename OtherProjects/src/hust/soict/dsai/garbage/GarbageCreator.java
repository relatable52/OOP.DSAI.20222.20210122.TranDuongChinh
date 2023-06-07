package hust.soict.dsai.garbage;

class GarbageCreator {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String s = "";
		char a = 'a';
		for(int i=0; i<500000; i++) {
			s += a;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
