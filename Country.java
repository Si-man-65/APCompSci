public class Country {
    private String countries;
    private String capitals;
    private String languages;
    private String fileName;

    public static void main(String[] args)
    {
        String[] countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya","Mexico", "United Kingdom", "United States", "Italy"};
        String[] capitals = {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi","Mexico City", "London", "Washington D.C", "Rome"};
        String[] languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili","Spanish", "English", "English", "Italian"};
        String[] fileName = {"China.jpg", "Egypt.jpg", "France.jpg", "Germany.jpg","India.jpg", "Japan.jpg", "Kenya.jpg", "Mexico.jpg", "UK.jpg", "US.jpg", "Italy.jpg"};

        int Random = (int)(Math.random()*10 + 1);
        Country myCountry = new Country(countries[Random], capitals[Random], languages[Random], fileName[Random]);
        myCountry.toString();

    }
    public Country(String countriesIn, String capitalsIn, String languagesIn, String fileNameIn)
    {
        countries = countriesIn;
        capitals = capitalsIn;
        languages = languagesIn;
        fileName = fileNameIn;
    }
    public String toString()
    {
        return "Country: " + countries + ", " + "Capitals: " + ", " + capitals + ", " + "Language they speak: " + languages; 
    }
}
