package th.ac.utcc.cpe.tanaporn;

/**@5907101007 Tanaporn Roschuen
 */



class LinkList2App
{
public static void main(String[] args)
{
Linklist theList = new Linklist(); 	// make list
theList.insertFirst(22 , 2.99);		// insert 4 items
theList.insertFirst(44 , 4.99);
theList.insertFirst(66 , 6.99);
theList.insertFirst(88 , 8.99);
theList.displayList();		//display list
Link f = theList.find(44);
if(f != null)
	System.out.println("Found link with key "+ f.iData);
else
	System.out.println("Can't find link");
Link d = theList.delete(66);		// delete item
if (d != null)
	System.out.println("Deleted link with key "+ d.iData);
else
	System.out.println("Can't delete link");
theList.displayList();			//display list
} // end main()
} // end class LinkList2App