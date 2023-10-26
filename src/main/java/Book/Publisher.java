package Book;

public class Publisher {
    private String namePublisher;  // название издательство
    private String city; // город

    public Publisher(String namePublisher, String city) {
        setNamepublisher(namePublisher);
        setCity(city);

    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamepublisher(String namePublisher) {
        if(namePublisher.isBlank()){
            throw new IllegalArgumentException("Укажите название издательство");
        }else{
            this.namePublisher = namePublisher;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.isBlank()){
            throw new IllegalArgumentException("Укажите город ");
        }else {
            this.city = city;
        }

    }
    public void print(){
        System.out.print(namePublisher+" , "+city+",");
    }
}




