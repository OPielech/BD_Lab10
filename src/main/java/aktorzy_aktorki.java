import javax.persistence.*;

@Entity
@Table(name = "aktorzy_aktorki")
public class aktorzy_aktorki {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    public aktorzy_aktorki(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public aktorzy_aktorki() {
    }

    public aktorzy_aktorki(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("id = " + id + ", ");
        sb.append("name = " + name);

        return sb.toString();
    }
}//end of class
