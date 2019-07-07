package com.eu.codingchallenge.Output;

import com.eu.codingchallenge.input.HelloMessageAbstract;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.Method;

/**
 * @author RameshJothimani
 */

//Generate this class during runtime
/*public class DynamicMainClass extends ${project.build.sourceDirectory} {

    public void writeToConsole() {
        System.out.println("HelloWorld !");
    }


    public static void main(String args[]){
        HelloMessageAbstract Obj=new DynamicMainClass();
        Obj.writeToConsole();
        //System.out.println("${project.version}");
        System.out.println("${project.basedir}/src/main/java");

    }
}*/


public class DynamicMainClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        ProxyFactory factory = new ProxyFactory();
        factory.setSuperclass(HelloMessageAbstract.class);

        factory.setHandler(new MethodHandler() {
            public Object invoke(Object arg0, Method method, Method arg2, Object[] arg3) {

                String methodName = method.getName();

                //Process the method names dynamically
                if (methodName.equals("writeToConsole")) {
                    System.out.println("Hello World!");
                    return null;
                }
                return null;
            }
        });

        Class classObj = factory.createClass();
        Object object = classObj.newInstance();

        //get the class name dynamically using maven
        //((${my-file-list}) object).writeToConsole();
        ((HelloMessageAbstract) object).writeToConsole();
    }
}