package uaslp.objetos.list.linkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ArrayListTest {

    @Test
    public void giveAnEmptyList_thenSizeIsZero(){
        LinkedList list = new LinkedList();
        int size= list.getSize();
        Assertions.assertEquals(0,size);
    }
    @Test //addAtTail
    public void giveANewList_whenAddAtTail_thenSizeIsOne(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");

        Assertions.assertEquals(1,list.getSize());

    }
    @Test //addAtFront
    public void giveANewList_whenAddAtFront_thenSizeIsOne(){
        LinkedList list = new LinkedList();
        list.addAtFront("uno");

        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("uno",list.getAt(0));

    }
    @Test //remove
    public  void giveAList_whenRemoveLessThanZero_thenReturnFalse(){
        LinkedList list = new LinkedList();
        list.addAtFront("uno");

        boolean result = list.remove(-1);

        Assertions.assertFalse(result);
    }
    @Test //remove2
    public  void giveAList_whenRemoveGraterThanSize_thenReturnFalse(){
        LinkedList list = new LinkedList();
        list.addAtFront("uno");

        boolean result = list.remove(1);

        Assertions.assertFalse(result);
    }
    @Test //remove3
    public  void giveAListWithOneElement_whenRemoveZero_thenReturnTrue(){
        LinkedList list = new LinkedList();
        list.addAtFront("uno");

        boolean result = list.remove(0);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0,list.getSize());
    }
    @Test //remove3
    public void giveAListWithTwoElement_whenRemoveZero_thenReturnTrue(){
        LinkedList list = new LinkedList();
        list.addAtFront("uno");
        list.addAtFront("dos");

        boolean result = list.remove(0);

        Assertions.assertTrue(result);
        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals(list.getAt(0),"uno");
    }
    @Test //remove3
    public void giveAListWithTwoElement_whenRemoveHead_thenReturnTrue(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtTail("dos");

        boolean result = list.remove(0);

        Assertions.assertTrue(result);
        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals(list.getAt(0),"dos");
    }

    @Test //remove3
    public void giveAListWithTwoElement_whenRemoveTail_thenReturnTrue(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtTail("dos");

        boolean result = list.remove(1);

        Assertions.assertTrue(result);
        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals(list.getAt(0),"uno");
    }
    @Test //remove3
    public void giveAListWithTreeElements_whenRemoveMiddle_thenReturnTrue(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtFront("dos");
        list.addAtTail("tres");

        boolean result = list.remove(1);

        Assertions.assertTrue(result);
        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals(list.getAt(0),"dos");
        Assertions.assertEquals(list.getAt(1),"tres");
    }
    @Test //remove3
    public void giveAListWithTreeElements_whenRemoveAll_thenSizeZero(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtFront("dos");
        list.addAtTail("tres");

        list.removeAll();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test //removeWithValue.
    public void giveANewListWithManyData_removeWithValue(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtFront("dos");
        list.addAtTail("uno");
        list.addAtTail("uno");
        list.addAtFront("dos");
        list.addAtTail("uno");
        //dos uno tres
        list.removeAllWithValue("uno");

        Assertions.assertEquals(2,list.getSize());
    }
    @Test //removeWithValue.
    public void giveANewListWithOneData_removeWithValue(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");

        list.removeAllWithValue("uno");

        Assertions.assertEquals(0,list.getSize());
    }
    @Test //removeWithValue.
    public void giveANewListWithTwoData_whenIsTheHead_removeWithValue(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtTail("dos");

        list.removeAllWithValue("uno");

        Assertions.assertEquals(1,list.getSize());
    }
    @Test //removeWithValue.
    public void giveANewListWithTreeData_whenIsNotHead_removeWithValue(){
        LinkedList list = new LinkedList();
        list.addAtTail("dos");
        list.addAtTail("uno");
        list.addAtTail("uno");

        list.removeAllWithValue("uno");

        Assertions.assertEquals(1,list.getSize());
    }
    @Test //remove3
    public void giveAListWithTreeElements_whenSetAt1_thenElementIsModify(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtFront("dos");
        list.addAtTail("tres");
        //dos uno tres
        list.setAt(1,"for");

        Assertions.assertEquals("dos",list.getAt(0));
        Assertions.assertEquals("for",list.getAt(1));
        Assertions.assertEquals("tres",list.getAt(2));
        Assertions.assertEquals(3,list.getSize());
    }
    @Test
    public void givenAList_whenGetAtAndSetAtIndexDoesntExist_thenReturnNull(){
        LinkedList list = new LinkedList();
        Object t,r;
        t = list.getAt(2);
        r = list.setAt(3,"dos");
       Assertions.assertEquals(null,t);
        Assertions.assertEquals(false,r);
    }
    @Test
    public void givenAList_whenRemoveAll_thenHeadAndTailAreZero(){
        LinkedList list = new LinkedList();
        list.addAtTail("uno");
        list.addAtFront("dos");
        list.addAtTail("tres");

        list.removeAll();
        //Check
    }
    @Test
    public void linkedListIterator(){
        LinkedList list = new LinkedList();
        list.addAtFront("dato");

        LinkedList.LinkedListIterator iterator = list.getIterator();
        Object data = iterator.next();
        Boolean statementReturn = iterator.hasNext();

        Assertions.assertNotNull(iterator);
        Assertions.assertNotNull(data);
        Assertions.assertNotNull(statementReturn);
    }
}
