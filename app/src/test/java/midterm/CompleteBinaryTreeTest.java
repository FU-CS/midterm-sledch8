/*
 * This source file was generated by the Gradle 'init' task
 */
package midterm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompleteBinaryTreeTest {
    @Test
    void insert() {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        assertEquals(tree.toString(), "1 2 3 ", "Inserting 1, 2, 3 should return '1 2 3'");
    }

    @Test
    void insert2() {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);

        assertEquals(tree.toString(), "1 2 3 4 ", "Inserting 1, 2, 3, 4 should return '1 2 3 4'");
    }

    @Test
    void delete() {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        
        assertEquals(tree.toString(), "1 2 3 4 ", "Should return '1 2 3 4'");

        tree.delete(3);

        assertEquals(tree.toString(), "1 2 4 ", "Deleting 3 should return '1 2 4'");
    }

    @Test
    void question1test(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(9);
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);

        assertEquals(true, tree.question1());
    }

    @Test
    void question1test2(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(0);
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);

        assertEquals(false, tree.question1());
    }

    @Test
    void question1test3(){
        CompleteBinaryTree tree = new CompleteBinaryTree();

        assertEquals(true, tree.question1());
    }

    @Test
    void question1test4(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(8);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);

        assertEquals(false, tree.question1());
    }

    @Test
    void question2test1(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(8);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);

        CompleteBinaryTree newtree = tree.question2();
        assertEquals("8 6 5 7 10", newtree.toString());

    }

    @Test
    void question2test2(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(8);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);

        CompleteBinaryTree newtree = tree.question2();
        newtree.delete(8);
        assertEquals("6 5 7 10", newtree.toString());
        assertEquals("8 6 5 7 10", tree.toString());

    }

    @Test
    void question2test3(){
        CompleteBinaryTree tree = new CompleteBinaryTree();

        CompleteBinaryTree newtree = tree.question2();
        assertEquals("", newtree.toString());

    }

    @Test
    void question2test4(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(8);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(10);

        CompleteBinaryTree newtree = tree.question2();
        newtree.insert(11);
        assertEquals("8 6 5 7 10 11", newtree.toString());
        assertEquals("8 6 5 7 10", tree.toString());

    }

    @Test
    void question2test5(){
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.insert(8);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(3);

        CompleteBinaryTree newtree = tree.question2();
        newtree.insert(11);
        assertEquals(false, newtree.question1());
        assertEquals(true, tree.question1());

    }


}
