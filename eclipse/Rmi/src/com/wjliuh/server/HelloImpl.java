package com.wjliuh.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello {
    
    private static final long serialVersionUID = 8986730915902299880L;

    public HelloImpl() throws RemoteException {
    }

    public String helloWorld() throws RemoteException {
	return "Hello World!";
    }

    @Override
    public Object queryData(String parameter) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
    }
}