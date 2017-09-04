package rmiClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiCommon.IHello;

public class HelloClient { 
    public static void main(String args[]){ 
        try { 
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:12000/RHello"); 
            System.out.println(rhello.getPerson()); 
            System.out.println(rhello.sayHelloToSomeBody("Xiaoming")); 
            System.out.println(rhello.getUseTime()); 
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 
}
