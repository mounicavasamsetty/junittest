import org.junit.*;

public class TestBasicLinkedList {
  @Test public void testCanAdd(String[] args) {
    BasicLinkedList<Integer> list = new BasicLinkedList();
    list.add(new BasicListNode<Integer>(1));
    assertTrue(list.size() == 1);
    assertTrue(list.getFirst().getElement().equals(1));
  }
}
/*import junit.framework.TestCase;

public class TestBasicLinkedList extends TestCase {
  public void testTrue() {
    assertTrue(true);
  }
}
*/
