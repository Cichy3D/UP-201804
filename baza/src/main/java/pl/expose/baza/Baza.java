package pl.expose.baza;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import pl.expose.baza.model.Osoba;
import pl.expose.baza.model.Osoba.Plec;
import pl.expose.baza.util.HibernateUtil;

public class Baza {
	
	static Logger log = Logger.getLogger(Baza.class);

	public static void main(String[] args) {
		log.info("Start Baza");

		Session session = HibernateUtil.getSessionFactory().openSession(); //getCurrentSession();
		
		List<Osoba> osoby = session.createQuery("Select o from Osoba o").getResultList();
		
		osoby.forEach(o -> log.info(o.toString()) );
		
		Transaction tx = session.beginTransaction();
		Osoba x = new Osoba();
		x.setNazwa("nowa");
		x.setPlec(Plec.K);
		x.setWiek(150);
		session.saveOrUpdate(x);
		tx.commit();
		
		session.close();
		log.info("End Baza");
		//System.exit(0);
	}

}
