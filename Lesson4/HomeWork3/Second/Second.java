package SoftServe.Lesson4.HomeWork3.Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String[] Args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter error number");
        int errorNum = 0;
        try {
            errorNum = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        getErrorName(errorNum);
    }

    static void getErrorName(int errorNum) {
        switch (errorNum) {
            case 400:
                System.out.println(HTTPError.E400.getErrorName());
                return;
            case 401:
                System.out.println(HTTPError.E401.getErrorName());
                return;
            case 402:
                System.out.println(HTTPError.E402.getErrorName());
                return;
            case 403:
                System.out.println(HTTPError.E403.getErrorName());
                return;
            case 404:
                System.out.println(HTTPError.E404.getErrorName());
                return;
            case 405:
                System.out.println(HTTPError.E405.getErrorName());
                return;
            case 406:
                System.out.println(HTTPError.E406.getErrorName());
                return;
            case 407:
                System.out.println(HTTPError.E407.getErrorName());
                return;
            case 408:
                System.out.println(HTTPError.E408.getErrorName());
                return;
            case 409:
                System.out.println(HTTPError.E409.getErrorName());
                return;
            case 410:
                System.out.println(HTTPError.E410.getErrorName());
                return;
            case 411:
                System.out.println(HTTPError.E411.getErrorName());
                return;
            case 412:
                System.out.println(HTTPError.E412.getErrorName());
                return;
            case 413:
                System.out.println(HTTPError.E413.getErrorName());
                return;
            case 414:
                System.out.println(HTTPError.E414.getErrorName());
                return;
            case 415:
                System.out.println(HTTPError.E415.getErrorName());
                return;
            case 416:
                System.out.println(HTTPError.E416.getErrorName());
                return;
            case 417:
                System.out.println(HTTPError.E417.getErrorName());
                return;
            case 418:
                System.out.println(HTTPError.E418.getErrorName());
                return;
            case 419:
                System.out.println(HTTPError.E419.getErrorName());
                return;
            case 420:
                System.out.println(HTTPError.E420.getErrorName());
                return;
            case 422:
                System.out.println(HTTPError.E422.getErrorName());
                return;
            case 423:
                System.out.println(HTTPError.E423.getErrorName());
                return;
            case 424:
                System.out.println(HTTPError.E424.getErrorName());
                return;
            case 426:
                System.out.println(HTTPError.E426.getErrorName());
                return;
            case 428:
                System.out.println(HTTPError.E428.getErrorName());
                return;
            case 429:
                System.out.println(HTTPError.E429.getErrorName());
                return;
            case 431:
                System.out.println(HTTPError.E431.getErrorName());
                return;
            case 440:
                System.out.println(HTTPError.E440.getErrorName());
                return;
            case 444:
                System.out.println(HTTPError.E444.getErrorName());
                return;
            case 449:
                System.out.println(HTTPError.E449.getErrorName());
                return;
            case 450:
                System.out.println(HTTPError.E450.getErrorName());
                return;
            case 451:
                System.out.println(HTTPError.E451.getErrorName());
                return;
            case 494:
                System.out.println(HTTPError.E494.getErrorName());
                return;
            case 495:
                System.out.println(HTTPError.E495.getErrorName());
                return;
            case 496:
                System.out.println(HTTPError.E496.getErrorName());
                return;
            case 497:
                System.out.println(HTTPError.E497.getErrorName());
                return;
            case 498:
                System.out.println(HTTPError.E498.getErrorName());
                return;
            case 499:
                System.out.println(HTTPError.E499.getErrorName());
                return;
            default:
                System.out.println("Sorry, but this error I can't find");
        }
    }
}
