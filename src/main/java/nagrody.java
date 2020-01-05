import javax.persistence.*;

@Entity
@Table(name = "nagrody")
public class nagrody {
    @Id
    @GeneratedValue
    @Column(name = "award_id")
    private String award_id;

    @Column(name = "award_year")
    private int award_year;

    @Column(name = "award_aktor_age")
    private int award_aktor_age;

    @Column(name = "award_actor_id")
    private String award_actor_id;

    @Column(name = "award_actor_movie")
    private String award_actor_movie;

    public nagrody() {
    }

    public nagrody(String award_id, int award_year, int award_aktor_age, String award_actor_id, String award_actor_movie) {
        this.award_id = award_id;
        this.award_year = award_year;
        this.award_aktor_age = award_aktor_age;
        this.award_actor_id = award_actor_id;
        this.award_actor_movie = award_actor_movie;
    }

    public nagrody(int award_year, int award_aktor_age, String award_actor_id, String award_actor_movie) {
        this.award_year = award_year;
        this.award_aktor_age = award_aktor_age;
        this.award_actor_id = award_actor_id;
        this.award_actor_movie = award_actor_movie;
    }

    public String getAward_id() {
        return award_id;
    }

    public void setAward_id(String award_id) {
        this.award_id = award_id;
    }

    public int getAward_year() {
        return award_year;
    }

    public void setAward_year(int award_year) {
        this.award_year = award_year;
    }

    public int getAward_aktor_age() {
        return award_aktor_age;
    }

    public void setAward_aktor_age(int award_aktor_age) {
        this.award_aktor_age = award_aktor_age;
    }

    public String getAward_actor_id() {
        return award_actor_id;
    }

    public void setAward_actor_id(String award_actor_id) {
        this.award_actor_id = award_actor_id;
    }

    public String getAward_actor_movie() {
        return award_actor_movie;
    }

    public void setAward_actor_movie(String award_actor_movie) {
        this.award_actor_movie = award_actor_movie;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("award_id = " + award_id + ", ");
        sb.append("award_year = " + award_year + ", ");
        sb.append("award_aktor_age = " + award_aktor_age + ", ");
        sb.append("award_actor_id = " + award_actor_id + ", ");
        sb.append("award_actor_movie = " + award_actor_movie);

        return sb.toString();
    }
}//end of class
