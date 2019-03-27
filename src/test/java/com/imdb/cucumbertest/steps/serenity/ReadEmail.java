package com.imdb.cucumbertest.steps.serenity;

import java.io.*;
import java.util.*;
import javax.mail.*;

public class ReadEmail {

	public static void main(String args[]) throws Exception {

		String host = "pop.gmail.com";
		String user = "tester160891@gmail.com";
		String password = "tester123";

		// Get system properties
		Properties properties = System.getProperties();

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);

		// Get a Store object that implements the specified protocol.
		Store store = session.getStore("pop3");

		// Connect to the current host using the specified username and password.
		store.connect(host, user, password);

		// Create a Folder object corresponding to the given name.
		Folder folder = store.getFolder("inbox");

		// Open the Folder.
		folder.open(Folder.READ_ONLY);

		Message[] message = folder.getMessages();

		// Display message.
		for (int i = 0; i < message.length; i++) {

			System.out.println("------------ Message " + (i + 1) + " ------------");

			System.out.println("SentDate : " + message[i].getSentDate());
			System.out.println("From : " + message[i].getFrom()[0]);
			System.out.println("Subject : " + message[i].getSubject());
			System.out.print("Message : ");

			InputStream stream = message[i].getInputStream();
			while (stream.available() != 0) {
				System.out.print((char) stream.read());
			}
			System.out.println();
		}

		folder.close(true);
		store.close();
	}
}