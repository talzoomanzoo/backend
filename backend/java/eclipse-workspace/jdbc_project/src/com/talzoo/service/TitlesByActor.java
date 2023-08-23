package com.talzoo.service;

import java.util.List;
import java.util.Scanner;

import com.talzoo.db.SakilaDao;
import com.talzoo.model.Actor;

public class TitlesByActor implements DbTask {
    private Scanner scanner;

    public TitlesByActor(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        String fullName, firstName, lastName;
        System.out.print("Input first_name, last_name: ");
        fullName = scanner.nextLine();
        firstName = fullName.split("\\s+")[0]; // space 기준 (개수와 상관없이)
        lastName = fullName.split("\\s+")[1];
        //String first_name = scanner.next();
        //String last_name = scanner.nextLine(); // 앞의 next 종료 시 공백도 데이터를 받음
        //String first_name = scanner.next();
        //String last_name = scanner.next(); // 남은 공백 안받음
        //scanner.nextLine();

        /* SakilaDao sakila = new SakilaDao(); */
        SakilaDao sakila = SakilaDao.INSTANCE; // 객체레퍼런스 가져옴

        List <Actor>  actors = sakila.getActors(firstName, lastName);
        if(actors.size() == 0) {
            System.out.println("No data found");
        } else {
            for(Actor actor: actors) {
                System.out.printf("%s    %30s     %15s       %5d        %15f\n", 
                		actor.getFirst_name(), actor.getLast_name(), actor.getTitle(), actor.getRelease_year(), actor.getRental_rate());
            }
        }

        scanner.nextLine();
    }
}
