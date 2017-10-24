/**
 * @author 5907101007 Tanaporn Roschuen 
 */
package th.ac.utcc.cpe.tanaporn;

import th.ac.utcc.cpe.tanaporn.test.StackArray;

public class StackSubjectRecord {
	
	
		private int maxSize ;
		private SubjectRecord []stackArray ;
		private int top ;
		
		public StackSubjectRecord(int maxSize){
			this.maxSize = maxSize;
			this.stackArray  = new SubjectRecord[this.maxSize];
			this.top = -1 ;
		}
		public void push(SubjectRecord i){
			stackArray[++top] = i ;
		}
		public SubjectRecord pop(){
			return stackArray[top--];
		}
		public boolean isEmpty(){
			return(top == -1);
			
		}
		public boolean isFull(){
			return (top==maxSize-1);
			
		}
		public static void main (String[] args){
			SubjectRecord sr1 = new SubjectRecord();
			sr1.setName("Nurse");
			sr1.setCodeName("NC252");
			sr1.setUnit(4);
			sr1.setGrade("a");
			
			SubjectRecord sr2 = new SubjectRecord();
			sr2.setName("Nice");
			sr2.setCodeName("NC252");
			sr2.setUnit(5);
			sr2.setGrade("b");
			
			SubjectRecord sr3 = new SubjectRecord();
			sr3.setName("Nep");
			sr3.setCodeName("NC252");
			sr3.setUnit(6);
			sr3.setGrade("c");
			
			StackSubjectRecord stacksubject = new StackSubjectRecord(5);
			
			stacksubject.push(sr1);
			stacksubject.push(sr2);
			stacksubject.push(sr3);
			
			SubjectRecord sr4 = stacksubject.pop();
			System.out.println (sr4) ;
			SubjectRecord sr5 = stacksubject.pop();
			System.out.println (sr5) ;
			SubjectRecord sr6 = stacksubject.pop();
			System.out.println (sr6) ;

}
	}
	
