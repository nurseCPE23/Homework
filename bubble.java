package th.ac.utcc.cpe.tanaporn;

public class bubble {
	private double [] elment;
	private int esize;
	
	public bubble( int size ) {
		if (size > 0)
			this.elment = new double [size] ;
		else
			this.elment = new double [10];
		esize = 0;
		}

public void insert (int e) {
	this.elment[esize] = e;
	esize++;
	
}

public void show() {
	for ( int i=0; i < esize; i++ ) {
		System.out.print(this.elment[i] + " " );
	}
	
	System.out.println("") ;
}
public void bubbleSort () {
	int out, in;
	
	for(out = esize - 1; out > 0; out--) {
for ( in = 0; in <out; in++) {
	if (this.elment [in] < this.elment[in+1]) {
		this.swap(in , in+1);
	}
}

}
}
private void swap(int left , int right) {
	double temp = this.elment[left];
	this.elment[left] = this.elment[right];
	this.elment[right] = temp;
}

public static void main(String [] arge) {
	int max = 20;
	bubble b = new bubble(max);
	
	b.insert(87);
	b.insert(43);
	b.insert(96);
	b.insert(32);
	b.insert(91);
	b.insert(78);
	b.insert(26);
	b.insert(12);
	
	
	System.out.print("Original order ");
	b.show();
	
	b.bubbleSort();
	System.out.print(" Sorted Order : ");
	b.show();
                                               // 5907101007 Tanaporn Roschuen //
	
}
}


