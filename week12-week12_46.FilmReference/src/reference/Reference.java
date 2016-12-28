
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {
    private RatingRegister register;
    
    public Reference (RatingRegister register) {
        this.register = register;
    }
    
    public Film recommendFilm(Person person) {
        HashMap<Film, List<Rating>> map = (HashMap<Film, List<Rating>>) register.filmRatings();
        ArrayList<Film> films = new ArrayList<Film>(map.keySet());        
        Collections.sort(films, new FilmComparator(map));
        return films.get(0);
    }
}
