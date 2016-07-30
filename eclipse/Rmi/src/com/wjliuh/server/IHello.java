package com.wjliuh.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {

    public String helloWorld() throws RemoteException;
    
    public Object queryData(String parameter) throws RemoteException;
}