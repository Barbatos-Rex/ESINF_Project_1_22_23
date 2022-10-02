package barbatos_rex1.utils;

import java.util.Objects;

public class Pair<F,S> {

    private final F first;

    private final S second;


    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F first() {
        return first;
    }

    public S second() {
        return second;
    }

    @Override
    public int hashCode(){
        return Objects.hash(first,second) + Objects.hash(second,first);
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Pair){
            Pair p = (Pair) o;
            return (first.equals(p.first) && second.equals(p.second)) || (first.equals(p.second) && second.equals(p.first));
        }
        return false;
    }


}
