package disk_store;

import java.util.ArrayList;
import java.util.List;

/**
 * An ordered index.  Duplicate search key values are allowed,
 * but not duplicate index table entries.  In DB terminology, a
 * search key is not a superkey.
 * 
 * Search key values, block key values (Multiple block numbers within search key values)
 * 
 * A limitation of this class is that only single integer search
 * keys are supported.
 *
 */

public class OrdIndex implements DBIndex {
	
	/**
	 * Create an new ordered index.
	 */
	
	// Create a new ArrayList to hold all of the indices
	private ArrayList<Integer> OrdList = new ArrayList<Integer>();
	
	public OrdIndex() {
		
		//throw new UnsupportedOperationException();
	}
	
	@Override
	public List<Integer> lookup(int key) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void insert(int key, int blockNum) {
		OrdList.add(key, blockNum);
		throw new UnsupportedOperationException();
	}

	@Override
	public void delete(int key, int blockNum) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Return the number of entries in the index
	 * @return
	 */
	public int size() {
		// you may find it useful to implement this
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		throw new UnsupportedOperationException();
	}
}
