
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!observations.keySet().contains(bird)) 
            observations.put(bird, new ArrayList<String>());
        observations.get(bird).add(place);
    }

    public void observations(Bird bird) {
        System.out.print(bird.toString() + " observations: "); 
        if (observations.get(bird) != null) {
        System.out.println(observations.get(bird).size());
        for (String place : observations.get(bird)) 
            System.out.println(place);        
        }
        else 
            System.out.println("0");
    }
}
