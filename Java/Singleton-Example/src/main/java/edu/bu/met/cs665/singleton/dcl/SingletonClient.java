package edu.bu.met.cs665.singleton.dcl;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();

		System.out.println(singleton.getDescription());
	}
}
