package com.wjliuh.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.wjliuh.entity.Entity;

public class SaveObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SaveObject so = new SaveObject();
		Entity e = new Entity("刘学琪", "200989657", "male", "read", 26);
		so.doSave(e);
		Entity retrive = (Entity)so.readObjectFromFile(e.getUser_id());
		System.out.println(retrive.toString());
	}

	public void doSave(Entity e) {

		try {
			File edata = new File("F:\\" + e.getUser_id() + ".dat");

			FileOutputStream out;

			out = new FileOutputStream(edata);
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(e);
			objOut.flush();
			objOut.close();
			System.out.println("write object success!");

		} catch (Exception ex) {
			System.out.println("write object failed");
		}

	}

	public Object readObjectFromFile(String id) {
		Object temp = null;
		File file = new File("F:\\"+id+".dat");
		FileInputStream in;
		try {
			in = new FileInputStream(file);
			ObjectInputStream objIn = new ObjectInputStream(in);
			temp = objIn.readObject();
			objIn.close();
			System.out.println("read object success!");
		} catch (IOException e) {
			System.out.println("read object failed");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return temp;
	}
}
