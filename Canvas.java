package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Canvas {

  List<Points> points = new List<Points>() {
    @Override
    public int size() {
      return 0;
    }

    @Override
    public boolean isEmpty() {
      return false;
    }

    @Override
    public boolean contains(Object o) {
      return false;
    }

    @Override
    public Iterator<Points> iterator() {
      return null;
    }

    @Override
    public Object[] toArray() {
      return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
      return null;
    }

    @Override
    public boolean add(Points points) {
      this.add(5,points);
      return false;
    }

    @Override
    public boolean remove(Object o) {
      this.remove(5);
      return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
      return false;
    }

    @Override
    public boolean addAll(Collection<? extends Points> c) {
      return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Points> c) {
      return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
      return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
      return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
      return false;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public Points get(int index) {
      return null;
    }

    @Override
    public Points set(int index, Points element) {
      return null;
    }

    @Override
    public void add(int index, Points element) {

    }

    @Override
    public Points remove(int index) {
      return null;
    }

    @Override
    public int indexOf(Object o) {
      return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
      return 0;
    }

    @Override
    public ListIterator<Points> listIterator() {
      return null;
    }

    @Override
    public ListIterator<Points> listIterator(int index) {
      return null;
    }

    @Override
    public List<Points> subList(int fromIndex, int toIndex) {
      return null;
    }
  };
  

}