package th.ac.utcc.cpe.tanaporn;

/*@author 5907101007 Tanaporn Roschuen
* *
*/


public class insertionSort {
	private int [] el ;
	private int esize ;


	public insertionSort (int size){ 
		if(size> 0 ) 
			this.el = new int[size] ;
		else 
			this.el = new int[20];
		
		esize = 0 ;
		
	}
	public  void insert(int e){
		this.el[esize] = e ;
		esize++;
		
	}
	public void show(){
		for(int i = 0 ; i < esize ; i++){
			System.out.print(this.el[i]+ " ");
			
		}
		System.out.print(" ");
	}
	public void insertionSorts(){
		
		int out,in,temp;
		for(out = 1 ;out < esize ;out++){
			temp =  this.el[out];
			for(in = out;in > 0 && this.el[in-1] >= temp; in--){
				this.el[in]= this.el[in-1];
			}
			this.el[in]=temp ;
		}
	}
		
		
		public static void main(String[]args){
			int max = 20 ;
			insertionSort insertion = new insertionSort(max) ;
			insertion.insert(3);
			insertion.insert(38);
			insertion.insert(44);
			insertion.insert(5);
			insertion.insert(47);
			insertion.insert(15);
		
			
			System.out.println("Original Order ::");
			insertion.show();
			insertion.insertionSorts();
			System.out.println("\nSorced order ::");
            insertion.show();
			
		}
}

			