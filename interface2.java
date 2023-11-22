class TestInterfaceDefault{  
public static void main(String args[]){
interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}    
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}}  