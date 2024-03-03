package clients;

public interface Flyable {
    double fly = 0;

    default double fly(){
        return fly;
    }

}
