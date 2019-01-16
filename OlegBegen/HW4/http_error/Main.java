package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int err = scan.nextInt();
        System.out.println(getError(err));

    }

    static Error getError(int err) {
        switch (err) {
            case 400:
                return Error.BadRequest;

            case 401:
                return Error.Unauthorized;

            case 402:
                return Error.PaymentRequired;
            default:
                return Error.NO_ERROR;

        }
    }
}
