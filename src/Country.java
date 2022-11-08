public class Country {
    private String name;
    private  int population;
    private  int S;
    private  String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Country(String name, int population, int s, String language){
         this.name=name;
         this.population=population;
         this.S=s;
         this.language=language;
     }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", S=" + S +
                ", language='" + language + '\'' +
                '}';
    }
}
