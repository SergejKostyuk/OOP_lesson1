package clients;

public interface Swimable {
    double swim = 0;

    default double swim(){
        return swim;
    }

}
