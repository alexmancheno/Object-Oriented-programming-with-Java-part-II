
package reference;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {
    private HashMap<Film, List<Rating>> movieRatings;
    private HashMap<Person, HashMap<Film, Rating>> personRatings;
    
    public RatingRegister() {
        movieRatings = new HashMap();
        personRatings = new HashMap();
    }
    
    public void addRating(Film film, Rating rating) {
        if (movieRatings.keySet().contains(film)) {
            movieRatings.get(film).add(rating);
        } else {
            List list = new ArrayList<Rating>();
            list.add(rating);
            movieRatings.put(film, list);
        }
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if (personRatings.keySet().contains(person)) {
            if (personRatings.get(person).keySet().contains(film)) {
                personRatings.get(person).replace(film, rating);
            } else {
                personRatings.get(person).put(film, rating);
            } 
        } else {
            HashMap<Film, Rating> newRating = new HashMap<Film, Rating>();
            newRating.put(film, rating);
            personRatings.put(person, newRating);
        }
        
        addRating(film, rating);
    }
    
    public List<Rating> getRatings(Film film) {
        if (movieRatings.containsKey(film))
            return movieRatings.get(film);
        else 
            return new ArrayList<Rating>();
    }
    
    public Rating getRating(Person person, Film film) {
        if (personRatings.containsKey(person)
            && personRatings.get(person).containsKey(film)
            && personRatings.get(person).get(film) != null) {
            
            return personRatings.get(person).get(film);
        }
        
        return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personRatings.keySet().contains(person)) {
            return personRatings.get(person);
        }
        
        HashMap<Film, Rating> newRating = new HashMap<Film, Rating>();
        return newRating;
    }
    
    public List<Person> reviewers() {
        ArrayList<Person> reviewers = new ArrayList<Person>();
        for (Person person : personRatings.keySet())
            reviewers.add(person);
        
        return reviewers;
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return movieRatings;
    }
    
}
