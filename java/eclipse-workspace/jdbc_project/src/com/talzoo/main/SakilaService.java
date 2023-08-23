package com.talzoo.main;

import java.util.Scanner;

import com.talzoo.service.DbTask;
import com.talzoo.service.JobFactory;

public class SakilaService {
    private Scanner scanner;
    private JobFactory factory;

    public SakilaService(JobFactory factory) {
        this.factory = factory;
    }

    public void doWork() {
        DbTask work = null;
        String inputString;
        scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Select Menu");
            System.out.println("=======================================");
            System.out.println("a. Films by genre");
            System.out.println("b. Films by actor");
            System.out.println("c: Stores by title");
            System.out.println("q. Quit");
            System.out.println("> ");

            inputString = scanner.nextLine();
            work = factory.createJob(inputString, scanner);

            if(work != null) {
                work.getInfo();;
                work = null;
            }
        System.out.println();
        }
    }
}
