public abstract class worker {
    String name;
    String surname;

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public abstract void printSection();
    public abstract void printPayment();
}
