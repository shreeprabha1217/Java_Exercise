class ArrayList <T>{
  Object arr[];
  int s;
  int capacity;

  public ArrayList(){
    s = 0;
    capacity = 10;
    arr = new Object[capacity];
  }
  public ArrayList(int c){
    capacity=c;
    arr=new Object[capacity];
  }
  public void add(T item){
    arr[s++]=item;
  }
  public Object get(int index){
    return (T) arr[index];
  }
  public int getSize(){
    return s;
  }
  public boolean isEmpty(){
    if(s==0)
        return true;
    else
        return false;
  }
}

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList();
    System.out.println(al.isEmpty());
    al.add(1);
    al.add(30);
    //al.add("Shree");
    for(int i=0;i<al.getSize();i++){
      System.out.println(al.arr[i]);
    }
  }
}
