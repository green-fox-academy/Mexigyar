import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int votes;
    String link;

    public Post(int votes, String link) {
        this.votes = votes;
        this.link = link;
    }

    public Post() {
    }
}
