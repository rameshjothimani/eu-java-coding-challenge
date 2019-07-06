package com.eu.codingchallenge.Output;

import com.eu.codingchallenge.input.HelloMessageAbstract;

/**
 * @author RameshJothimani
 */

//Generate this class during runtime
public class DynamicMainClass extends ${project.basedir} {

    public void writeToConsole() {
        System.out.println("HelloWorld !");
    }


    public static void main(String args[]){
        HelloMessageAbstract Obj=new DynamicMainClass();
        Obj.writeToConsole();
        //System.out.println("${project.version}");
        System.out.println("${project.basedir}/src/main/java");

    }
}

