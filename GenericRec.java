  public class GenericRec < T extends Number > {
    
     public static void main(String[] args) {
        
    GenericRec <Double> a = new GenericRec(3.1,2.5);
    System.out.println("Area as a double: " + a.getArea());
    GenericRec<Integer> b = new GenericRec(5,10);
    System.out.println("Area as an integer: " + b.getArea());
    
    
    
  }
    private T height;
    private T width;
    public GenericRec(T height,T width){ 
        this.height = height;
        this.width = width;
    }
    
    public T getHeight(){
        return height;
    }
    public void setHeight(T height){   
    this.height = height;
 }
    
        public T getwidth(){
        return width;
    }
    public void setWidth(T width){
    this.width = width;
 }
    

  public Number getArea(){
return height.doubleValue() * width.doubleValue();


 }
}
