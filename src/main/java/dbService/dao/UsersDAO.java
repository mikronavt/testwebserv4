package dbService.dao;

import dbService.dataSets.UsersDataSet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * Created by User on 30.12.2015.
 */
public class UsersDAO {

    private Session session;

    public UsersDAO(Session session){
        this.session = session;
    }

    public UsersDataSet get(long id) throws HibernateException{
        return (UsersDataSet) session.get(UsersDataSet.class, id);
    }

    public long getUserId(String name) throws HibernateException{
        Criteria criteria = session.createCriteria(UsersDataSet.class);
        return ((UsersDataSet) criteria.add(Restrictions.eq("name", name)).uniqueResult()).getId();
    }

    public long insertUser(String name, String pass) throws HibernateException{
        return (Long) session.save(new UsersDataSet(name, pass));
    }
}
