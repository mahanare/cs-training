package in.careerscale.training.hibernate.model;

// Generated 17 Feb, 2014 8:09:01 PM by Hibernate Tools 4.0.0


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Designation.
 * @see in.careerscale.training.hibernate.model.Designation
 * @author Hibernate Tools
 */

public class DesignationHome {

	private static final Log log = LogFactory.getLog(DesignationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Designation transientInstance) {
		log.debug("persisting Designation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Designation persistentInstance) {
		log.debug("removing Designation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Designation merge(Designation detachedInstance) {
		log.debug("merging Designation instance");
		try {
			Designation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Designation findById(Integer id) {
		log.debug("getting Designation instance with id: " + id);
		try {
			Designation instance = entityManager.find(Designation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
