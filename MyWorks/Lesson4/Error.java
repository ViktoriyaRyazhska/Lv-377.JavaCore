package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Error {

	HttpError error;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of error: ");
		String err = br.readLine();

		switch (err) {
		case "Bad Request":
			System.out.println(HttpError.ERROR400);
			break;
		case "Unauthorized":
			System.out.println(HttpError.ERROR401);
			break;
		case "Payment Required":
			System.out.println(HttpError.ERROR402);
			break;
		case "Forbidden":
			System.out.println(HttpError.ERROR403);
			break;
		}

	}

}

enum HttpError {
	ERROR400, ERROR401, ERROR402, ERROR403;
}
