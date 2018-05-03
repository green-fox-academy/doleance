import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BlogPost {

    String authorName;
    String title;
    String text;
    Date publicationDate;

    BlogPost(String authorName, String title, String text, String itsDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        SimpleDateFormat dateFormat = new SimpleDateFormat( "ddMMyyyy" );
        try {
            this.publicationDate = dateFormat.parse(itsDate);
        } catch (ParseException e) {
            System.out.println("Something went wrong with the parse thingy.");
        }
    }
}
