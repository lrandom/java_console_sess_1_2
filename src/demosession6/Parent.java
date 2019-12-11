/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosession6;

/**
 *
 * @author Lrandom
 */
public class Parent implements IGrandfather,IGrandmother{
    private String name="Parent";
    static private String name1="Parent1";
    public void run(){
        System.out.println("Running 1");
    }
    
    public void run(int a){
        System.out.println("Running 2"+ a);
    }
    
    public void run(float a){
        System.out.println("Running 2"+ a);
    }
    
    public void run(int a, int b){
        System.out.println("Running 3"+ a+b);
    }

    @Override
    public void sayHi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Children children = new Children();
        children.sayHi();
    }

    @Override
    public void sayHello() {
        class Children3{
           public void sayHi(){
               System.out.println("Say hi to "+name);
           };
        }
        Children3 children3 = new Children3();
        children3.sayHi();
        
        Children4 children4 = new Children4() {
            @Override
            public void sayHi() {
                System.out.println("AAA");
            }
        };
        children4.sayHi();
    }

    @Override
    public void sayNihao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sayBongjua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void hihi(Children4 children4){
       children4.sayHi();
    }
    
    class Children{
       public void sayHi(){
           System.out.println("Say hi to "+name);
       };
    }
    
    static class Children1{
       public void sayHi(){
           System.out.println("Say hi to "+name1);
       }
    }
    
    public interface Children4{
        public void sayHi();
    }
}
