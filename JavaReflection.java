import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;
public class JavaReflection{
            public static void main(String[] args){
            Class<?> student =Student.class;
            Method[] methods =student.getDeclaredMethods();
            ArrayList<String> methodList = new ArrayList<>();
            for(Method i:methods){
                methodList.add(i.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
