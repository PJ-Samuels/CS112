package ps7;

/*
 * ListIterator.java
 *
 * Computer Science 112, Boston University
 */

/*
 * An interface for an iterator that iterates over a List.
 */
public interface ListIterator {
    /*
     * does the iterator have additional items to visit?
     */
    boolean hasNext();

    /*
     * return a reference to the next Object in the iteration
     */
    Object next();
}
