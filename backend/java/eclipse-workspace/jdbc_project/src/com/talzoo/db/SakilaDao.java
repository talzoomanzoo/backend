package com.talzoo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.CallableStatement;
import com.talzoo.model.Actor;
import com.talzoo.model.Film;
import com.talzoo.model.Store;

/* public class SakilaDao {
    // Dao Data Access Object
    private Connection conn; // field로 바꾸는 순간 default null 됨
    private PreparedStatement pStmt;
    private ResultSet rSet;

    private String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";

    private String username = "talzoomanzoo";
    private String password = "1234";

    private void getConnection() {
        try { // connection - try -catch
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    } */

//교재에서는 클래스에서 singleton 패턴 만드는 반면, 선생님 코드에서는 enum에서 singleton 패턴 만듦
public enum SakilaDao { // enum이라는 객체 하나만 만듦
    INSTANCE; // public static final SakilaDao Instance = new SakilaDao();
    // Dao Data Access Object
    private Connection conn; // field로 바꾸는 순간 default null 됨
    private PreparedStatement pStmt;
    private ResultSet rSet;
    private CallableStatement cStmt;

    private String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";

    private String username = "talzoomanzoo";
    private String password = "1234";

    private void getConnection() {
        try { // connection - try -catch
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
                if(rSet != null)
                    rSet.close();
                if(pStmt != null)
                    pStmt.close();
                if(conn != null)
                    conn.close();
                if(cStmt != null);
                    cStmt.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
    }

    public List<Film> getFilms(String genre) {
        List<Film> films = new ArrayList<Film>();

        getConnection(); //db접속

        StringBuffer sb = new StringBuffer(); // 쿼리문 만들기
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

            Film film;

            while(rSet.next()) {
                film = new Film();
                film.setFilmId(rSet.getInt(1));
                film.setTitle(rSet.getString(2));
                film.setGenre(rSet.getString(3));
                film.setReleaseYear(rSet.getString(4));
                film.setLanguage(rSet.getString(5));

                films.add(film);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            closeConnection();
    }
    return films;
}

public List<Actor> getActors(String first_name, String  last_name) {
        List<Actor> actors = new ArrayList<Actor>();

        getConnection(); //db접속

        StringBuffer sb = new StringBuffer(); // 쿼리문 만들기
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
            Actor actor;
            while(rSet.next()) {
				actor = new Actor();
                actor.setFirst_name(rSet.getString(1));
                actor.setLast_name(rSet.getString(2));
                actor.setTitle(rSet.getString(3));
                actor.setRelease_year(rSet.getInt(4));
                actor.setRental_rate(rSet.getDouble(5));

                actors.add(actor);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            closeConnection();
    }
    return actors;
}

public List<Store> getStoresByTitle(String title) {
		List<Store> stores = new ArrayList<Store>(); 
		
		getConnection();
		
		try {
			cStmt = (CallableStatement) conn.prepareCall("call SP_GET_STORE(?)");
			cStmt.setString(1, title);
			rSet = cStmt.executeQuery();
			
			Store store;
			while(rSet.next()) {
				store = new Store();
				store.setTitle(rSet.getString(1));
				store.setStoreId(rSet.getLong(2));
				store.setFirstName(rSet.getString(3));
				store.setLastName(rSet.getString(4));
				store.setAddress(rSet.getString(5));
				store.setStock(rSet.getLong(6));
				stores.add(store);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection();
		}
		
		return stores;
	}
}
