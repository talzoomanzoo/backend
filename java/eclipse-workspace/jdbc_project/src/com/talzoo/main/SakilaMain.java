package com.talzoo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import com.talzoo.db.SakilaDao;
import com.talzoo.model.Actor;
import com.talzoo.model.Film;
import com.talzoo.service.JobFactory;

/**
 * SakilaMain
 */
public class SakilaMain {
    /* private static Scanner scanner = new Scanner(System.in); */
    public static void main(String[] args) {
        /* String inputString; */
        SakilaService service = new SakilaService(new JobFactory());
        service.doWork();

        /* while(true) {
            System.out.println("Select Menu");
            System.out.println("=======================================");
            System.out.println("a. Films by genre");
            System.out.println("b. Films by actor");
            System.out.println("q. Quit");
            System.out.println("> ");

            inputString = scanner.nextLine();

            if(inputString.equals("a")) {
                getFilms();
            } else if(inputString.equals("q")) {
                System.out.println("Program Terminated!");
                scanner.close();
                break;
            } else if(inputString.equals("b")) {
                getFilms2();
            }
        }
    } */

/*     public static void getFilms() {
        System.out.print("Input genre: ");
        String genre = scanner.nextLine(); // next는 space전까지, nextline은 enter까지 가져옴
        SakilaDao sakila = SakilaDao.INSTANCE; 
      //  SakilaDao sakila = new SakilaDao();

        List <Film>  films = sakila.getFilms(genre); */
        
        /* String url = "mysql://localhost:3306/sakila?serverTimezone=UTC"; //db url

        String username = "talzoomanzoo";
        String password = "1234";

        Connection conn = null;    // maven repository download as sql version by checking sql version from terminal: mysql -u talzoomanzoo -p
        PreparedStatement pStmt = null;
        ResultSet rSet = null; */

 /*        if(films.size() == 0) {
            System.out.println("No data found");
        } else {
            for(Film film: films) {
                System.out.printf("%d    %30s     %15s       %5s        %15s\n", 
                		film.getFilmId(), film.getTitle(), film.getGenre(), film.getReleaseYear(), film.getLanguage());
            }
            }
        } */

       /*  try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        StringBuffer sb = new StringBuffer();
        sb.append("select F.film_id, F.title, C.name, F.release_year, L.name ");
        sb.append("from film F join language L on F.language_id = L.language_id ");
        sb.append("join film_category FC on F.film_id = FC.film_id ");
        sb.append("join category C on FC.category_id = C.category_id ");
        sb.append("where C.name = ? ");

        String sql = sb.toString();
        try {
            pStmt = conn.prepareStatement(sql); // query문 준비해줌
            pStmt.setString(1, genre); // ?의 첫번째, 파라미터 주기
            rSet = pStmt.executeQuery(); // query문 실행 (실행결과가 rSet에 들어옴)
            System.out.println("   Film ID               Title               	    Genre  	    Release Year        Language");
            while(rSet.next()) {
                System.out.printf("%d    %30s     %15s       %5s        %15s\n", 
                		rSet.getInt(1), rSet.getString(2), rSet.getString(3), rSet.getString(4), rSet.getString(5));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                if(rSet != null)
                    rSet.close();
                if(pStmt != null)
                    pStmt.close();
                if(conn != null)
                    conn.close();
            } catch (Exception e) {
                // TODO: handle exception
            } */
       // }
    //}
    
   /*  public static void getFilms2() {
        System.out.print("Input first_name, last_name: ");
        String first_name = scanner.nextLine(); // next는 space전까지의 데이터를, nextline은 enter 전까지의 데이터를 가져옴
        String last_name = scanner.nextLine();
        //String first_name = scanner.next();
        //String last_name = scanner.nextLine(); // 앞의 next 종료 시 공백도 데이터를 받음
        //String first_name = scanner.next();
        //String last_name = scanner.next(); // 남은 공백 안받음
        //scanner.nextLine();

        /* SakilaDao sakila = new SakilaDao(); */
      /*   SakilaDao sakila = SakilaDao.INSTANCE; // 객체레퍼런스 가져옴

        List <Actor>  actors = sakila.getActors(first_name, last_name);
        if(actors.size() == 0) {
            System.out.println("No data found");
        } else {
            for(Actor actor: actors) {
                System.out.printf("%s    %30s     %15s       %5d        %15f\n", 
                		actor.getFirst_name(), actor.getLast_name(), actor.getTitle(), actor.getRelease_year(), actor.getRental_rate());
            }
            }
        } */ 
        /* String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC"; //db url

        String username = "talzoomanzoo";
        String password = "1234";

        Connection conn = null;    // maven repository download as sql version by checking sql version from terminal: mysql -u talzoomanzoo -p
        PreparedStatement pStmt = null;
        ResultSet rSet = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        StringBuffer sb = new StringBuffer();
        sb.append("select A.first_name, A.last_name, F.title, F.release_year, F.rental_rate "); //마지막에 띄워줘야 함
        sb.append("from film F join film_actor FA on F.film_id = FA.film_id ");
        sb.append("join actor A on FA.actor_id = A.actor_id ");
        sb.append("where A.first_name = ? and A.last_name = ?");
        sb.append("order by F.title asc; ");

        String sql = sb.toString();
        try {
            pStmt = conn.prepareStatement(sql); // query문 준비해줌
            pStmt.setString(1, first_name); // ?의 첫번째, 파라미터 주기
            pStmt.setString(2, last_name);
            rSet = pStmt.executeQuery(); // query문 실행 (실행결과가 rSet에 들어옴)
            System.out.println("First Name        Last Name        Title               Release Year         Rental rate");
            while(rSet.next()) {
                System.out.printf("%5s    %30s     %15s       %5d        %15f\n",  // 뜰 때 빈칸
						rSet.getString(1), rSet.getString(2), rSet.getString(3), rSet.getInt(4), rSet.getDouble(5));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                if(rSet != null)
                    rSet.close();
                if(pStmt != null)
                    pStmt.close();
                if(conn != null)
                    conn.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        } */
    }
}    