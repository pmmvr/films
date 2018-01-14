package Data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class PickRandom {

    private static SessionFactory factory;
    private static Configuration cfg=new Configuration();

    public static void main(String[] args) {

        //creating configuration object


        //creating seession factory object

        List mylist = getRandomMovies(2017);
        Film film = (Film)mylist.get(1);
        System.out.println(film.getTitle());


    }

    public static List<Film> getRandomMovies(int year){
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file

        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();

        //creating transaction object
        Transaction t = session.beginTransaction();

        List films = session.createQuery("FROM (SELECT ROW_NUMBER() OVERFilm where year =" + year).list();
        for (Iterator iterator = films.iterator(); iterator.hasNext();) {
            Film film = (Film) iterator.next();
            //System.out.println(film.getTitle());
        }
        return films;
    }
}