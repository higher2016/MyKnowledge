package rmiServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmiCommon.IHello;
import rmiCommon.Person;

public class HelloImpl extends UnicastRemoteObject implements IHello {
	private static final long serialVersionUID = 2085486720158521542L;
	
	public Integer i = 0;
	
	public HelloImpl() throws RemoteException {
	}

	public Person getPerson() throws RemoteException {
		i++;
		return new Person("ss", 12);
	}

	public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
		i++;
		return "Hello " + someBodyName + "!";
	}

	public int getUseTime() throws RemoteException  {
		return i;
	}
}
