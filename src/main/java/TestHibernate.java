import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.*;

public class TestHibernate {

    private static SessionFactory factory;

    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

//        PODPUNKT A):
//        System.out.println("a) Wyświetl średni wiek zwycięzcy i zwyciężczyni (osobno).");
//        showQueryResults("select avg(award_aktor_age) from nagrody where award_actor_id like 'AF%'");
//        showQueryResults("select avg(award_aktor_age) from nagrody where award_actor_id like 'AM%'");

//        PODPUNKT B):
//        System.out.println("b) Wyświetl, ile nagród dostali razem członkowie rodziny Fonda.");
//        showQueryResults("select id from aktorzy_aktorki where name like '%Fonda'");
//        showQueryResults("select count(award_id) from nagrody where award_actor_id='AF100' or award_actor_id='AM179' or award_actor_id='AM37'");

//        PODPUNKT C):
//        System.out.println("c) Wyświetl wiek najmłodszego i najstarszego zwycięzcy oraz najmłodszej i najstarszej zwyciężczyni (osobno).");
//        showQueryResults("select min(award_aktor_age) from nagrody where award_actor_id like 'AM%'");
//        showQueryResults("select max(award_aktor_age) from nagrody where award_actor_id like 'AM%'");
//        showQueryResults("select min(award_aktor_age) from nagrody where award_actor_id like 'AF%'");
//        showQueryResults("select max(award_aktor_age) from nagrody where award_actor_id like 'AF%'");

//        PODPUNKT D):
//        System.out.println("d) Oblicz, ile procent nagród zdobyły kobiety.");
//        showQueryResults("select count(award_id)/(select count(award_id) from nagrody)*100 from nagrody where award_actor_id like 'AF%'");

//        PODPUNKT E):
//        String select = "select a.name, count(b.award_id) from nagrody b join aktorzy_aktorki a on b.award_actor_id=a.id group by b.award_actor_id having count(b.award_id)>1 order by count(b.award_id) desc";
//        Query query = session.createQuery(select);
//        List list = query.list();
//
//        System.out.println("e) Wyświetl imiona i nazwiska aktorów/aktorek, którzy zdobyli więcej niż jednego Oskara i uszereguj ich wg malejącej liczby nagród.");
//        System.out.println(Arrays.deepToString(list.toArray()));


//        PODPUNKT F):
//        System.out.println("f) W pierwszych latach Oskary były przyznawane więcej niż jednej osobie w danej kategorii. Wyznacz, ile było rozdań nagród.");
//        showQueryResults("select count(award_id)/2 from nagrody");

//        PODPUNKT G):
//        String select1 = "select a.name, b.award_year, b.award_actor_movie from aktorzy_aktorki a join nagrody b on a.id=b.award_actor_id and (a.name='Anthony Hopkins' or a.name='Sidney Poitier' or a.name='Jeff Bridges')";
//        Query query1 = session.createQuery(select1);
//        List list1 = query1.list();
//        System.out.println("g) Wybierz trzech aktorów z listy stu najwybitniejszych aktorów wg serwisu IMDb2 i wyświetl dla nich zestawienie w formie: imię i nazwisko, rok nagrody i film. ");
//        System.out.println(Arrays.deepToString(list1.toArray()));

//        PODPUNKT H):
//        System.out.println("h) Wyznacz, ile było różnych laureatów pośród kobiet i mężczyzn (osobno).");
//        showQueryResults("select count(distinct award_actor_id) from nagrody where award_actor_id like 'AM%'");
//        showQueryResults("select count(distinct award_actor_id) from nagrody where award_actor_id like 'AF%'");

    }//end of main


    public static void showQueryResults(String queryString) {

        Session session = factory.openSession();
        Query query = session.createQuery(queryString);
        List list = query.list();

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
