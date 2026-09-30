package university;

import java.util.Comparator;

class HrDemo implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // If scores are equal, sort alphabetically by name
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        // Otherwise, sort by score in decreasing order
        return Integer.compare(b.score, a.score);
    }
}