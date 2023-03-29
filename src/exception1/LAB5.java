/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class LAB5 {
    public static void main(String[] args) {
        System.out.println("Method dothis() call method dothis()");
    
        try {
            dothis();
    }
        catch (Exception e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
        }
    public static void dothis()throws Exception{
        System.out.println("Method dothis() call method dothat()");
        dothat();
    }
    public static void dothat() throws Exception{
        throw new Exception();
    }
}
