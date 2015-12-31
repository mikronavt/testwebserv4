package dbService.dataSets;

/**
 * Created by User on 30.12.2015.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class UsersDataSet implements Serializable{
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name", unique = true, updatable = false)
    private String name;

    @Column(name = "pass")
    private String pass;

    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet(){

    }

    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet(long id, String name, String pass){
        this.setId(id);
        this.setName(name);
        this.setPass(pass);
    }

    public UsersDataSet(String name, String pass){
        this.setId(-1);
        this.setName(name);
        this.setPass(pass);
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setPass(String pass){this.pass = pass;}

    public String getPass(){return pass;}

    @Override
    public String toString(){
        return "UserDataSet(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass=" + pass +
                '}';
    }
}
