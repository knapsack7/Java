class JavaSingletonPattern{
     private static JavaSingletonPattern t=new JavaSingletonPattern();
     public String str;
     private JavaSingletonPattern(){
    	 
     }
     public static JavaSingletonPattern getSingleInstance(){
    	 return t;
     }
}