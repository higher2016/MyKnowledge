package rmiServer;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiCommon.IHello;

public class HelloServer {
	public static void main(String args[]) {

		try {
			IHello rhello = new HelloImpl();
			LocateRegistry.createRegistry(12000);

			Naming.bind("rmi://localhost:12000/RHello", rhello);
			System.out.println(">>>>>INFO: Remote object have registered");
		} catch (RemoteException e) {
			System.out.println("Remote wrong");
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			System.out.println("Object hava registered");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println("----");
			e.printStackTrace();
		}
	}
}