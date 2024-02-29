public class GenericStack<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
  
  
      
      public static void main(String[] args) {
      
          GenericStack s = new GenericStack();
          for(int i=0; i<5;i++){
              s.push((Integer)i);

        }
      
      
    System.out.println(s);
    System.out.println(s.peek());
     System.out.println(s.pop());
      System.out.println(s);
    }

  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public void push(E o) {
    list.add(o);
  }

  public E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  @Override
  public String toString() {
    return "stack: " + list.toString();
  }
}


