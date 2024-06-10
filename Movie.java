//Movie.java
public class Movie{
  private String name;
  private String format;
  private double rating;

  public Movie(String name, String format, double rating){
    this.name=name;
    this.format=format;
    this.rating=rating;
  }
  public Movie(Movie source){
    this.name=source.name;
    this.format=source.format;
    this.rating=source.rating;
  }
  public String getName(){
    return name;
  }
  public String getFormat(){
    return format;
  }
  public double getRating(){
    return rating;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setFormat(String format){
    this.format=format;
  }
  public void setRating(double rating){
    this.rating=rating;
  }
  public String toString(){
    return this.rating + "\t" + this.format + "\t\t" + this.name + "";
  }
  
}

//Main.java
public class Main {
  public static void main(String[] args) {
Movie movie[]={new Movie("The Shawshank Redemption", "BlueRay", 9.2),
              new Movie("The Godfather", "BlueRay", 9.1),
              new Movie("The Godfather: Part II", "DVD", 9.0),
              new Movie("The Dark Knight", "BlueRay", 9.0),
              new Movie("Schindler's List", "DVD", 8.9),
              new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
              new Movie("Pulp Fiction", "DVD", 8.8),
              new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
};
    System.out.println("******************************MOVIE STORE*****************************");
    for(int i=0;i<movie.length;i++){
      System.out.println(movie[i]);
    }
  }
}
