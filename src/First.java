
public class First {
    private String name;
    private String day;
    private boolean dry;
    private boolean undies;
    private String notes;

    public First() {
    }
        public First(String name, String day, boolean dry, boolean undies, String notes){
    this.name = name;
    this.day = day;
    this.dry = dry;
    this.undies = undies;
    this.notes = notes;
    }
    public void setName (String nameGiven)
    {   this.name = nameGiven;}

    public void setDay (String day)
    {   this.day = day;}

    public void setDry(boolean dry)
    {    this.dry = dry;}

    public void setNappie(boolean undies) {
        this.undies = undies;
    }

    public void setNotes(String info){
        this.notes = info;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public boolean getDry() {
        return dry;
    }

    public boolean getUndies() {
        return undies;
    }

    public String getNotes() {
        return notes;
    }


}

