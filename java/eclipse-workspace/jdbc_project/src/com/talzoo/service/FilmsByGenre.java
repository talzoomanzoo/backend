package com.talzoo.service;

import java.util.List;
import java.util.Scanner;

import com.talzoo.db.SakilaDao;
import com.talzoo.model.Film;

public class FilmsByGenre implements DbTask {
    private Scanner scanner;
    
    public FilmsByGenre(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        System.out.print("Input genre: ");
        String genre = scanner.nextLine(); // next는 space전까지, nextline은 enter까지 가져옴
        SakilaDao sakila = SakilaDao.INSTANCE; 
      //  SakilaDao sakila = new SakilaDao();

        List <Film>  films = sakila.getFilms(genre);
        
        /* String url = "mysql://localhost:3306/sakila?serverTimezone=UTC"; //db url

        String username = "talzoomanzoo";
        String password = "1234";

        Connection conn = null;    // maven repository download as sql version by checking sql version from terminal: mysql -u talzoomanzoo -p
        PreparedStatement pStmt = null;
        ResultSet rSet = null; */

        if(films.size() == 0) {
            System.out.println("No data found");
        } else {
            for(Film film: films) {
                System.out.printf("%d    %30s     %15s       %5s        %15s\n", 
                		film.getFilmId(), film.getTitle(), film.getGenre(), film.getReleaseYear(), film.getLanguage());
            }
        }

        scanner.nextLine();
    }
    
}
