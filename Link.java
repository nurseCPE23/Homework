package th.ac.utcc.cpe.tanaporn;

/**@5907101007 Tanaporn Roschuen
 */

public class Link {
	 public long data;
	  public Link next;

	  public Link(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  // end class

