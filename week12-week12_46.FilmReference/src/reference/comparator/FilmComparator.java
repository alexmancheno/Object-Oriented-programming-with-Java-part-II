
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> map;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        map = ratings;
    }
    
    public double getAverage(List<Rating> list) {
        double average = 0;
        for (Rating rating : list)
            average += rating.getValue();
        
        return average / list.size();
    }
    
    @Override
    public int compare(Film one, Film two) {
        return (int) getAverage(map.get(two)) - (int) getAverage(map.get(one));
    }

}
