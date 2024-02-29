public class MoreGenerics { 

    public static void main(String[] args){
    Integer [] a = {1,2,3,4,5};
    
    display(a);
    shuffle(a);
    bubbleSort(a);
}

public static <E> void display(E[] list){
    for(int i=0;i<list.length;i++){
        System.out.println(i + ":" + list[i]);
    }
}


public static <E extends Comparable<E>> void bubbleSort(E[]a){
    boolean done = false;
    
    while(!done){
        done = true;
        for(int i=0; i < a.length-1;i++) { 
            if(a[i].compareTo(a[i+1])>1) {
                E temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                done = false;
                System.out.println("Changing " +a[i]+":"+a[i+1]);
            }
        }
        System.out.println("==========end of cycle through ========");
    }
}


public static <E> void shuffle(E[]a){
    for(int i=0; i <a.length; i++) {
        
        int index =(int)(Math.random()*a.length);
        E temp = a[i];
        a[i] = a[index];
        a[index] = temp;
        
        System.out.println("Change = " + i + " with " + index);
        //show(a);
    }
}
}