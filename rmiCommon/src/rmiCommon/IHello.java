package rmiCommon;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote { 
	
	// 如果方法不抛RemoteException异常，服务器是会报错的
	public int getUseTime() throws RemoteException;

    public Person getPerson() throws RemoteException; 

    public String sayHelloToSomeBody(String someBodyName) throws RemoteException; 
}
