package pl.expose.baza;

import java.util.List;

import org.hibernate.Session;
import org.jboss.logging.Logger;

import pl.expose.baza.model.Osoba;
import pl.expose.baza.util.HibernateUtil;

public class Baza {
	
	static Logger log = Logger.getLogger(Baza.class);

	public static void main(String[] args) {
		log.info("Start Baza");

		Session session = HibernateUtil.getSessionFactory().openSession(); //getCurrentSession();
		
		List<Osoba> osoby = session.createQuery("Select o from Osoba o").getResultList();
		
		osoby.forEach(o -> log.info(o.toString()) );
		
		session.close();
		log.info("End Baza");
	}

}
