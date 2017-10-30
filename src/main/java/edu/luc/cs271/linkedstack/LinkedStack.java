package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  private int size = 0;

  // DONE why don't we need an explicit constructor?
  // An explicit constructor is not needed in this class because the ADT "LinkedList" has been
  // implemented

  @Override
  public E push(final E obj) {
    // DONE
    Node<E> temp = top;
    top = new Node<>(obj);
    // top.obj = obj;
    top.next = temp;
    size++;

    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
    // return null;
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      size -= 1;
      return result;
    }

    // return null;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if (top != null) {
      return false;
    }
    return true;
  }

  @Override
  public List<E> asList() {
    // DONE implement using an ArrayList preallocated with the right size
    // DONE add any instance variable(s) required to support this
    final ArrayList<E> list = new ArrayList<>(size);
    Node<E> curr = top;
    while (curr != null) {
      list.add(curr.data);
      curr = curr.next;
    }
    return list;
  }
  // return null;

}
