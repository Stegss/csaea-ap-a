import module java.base;
public class Show {
    
    String title;
    String creator;
    String director;
    int seasons;
    int episodes;
    int age;
    double rating;
    boolean inDevelopment;
    int watchtime;
    int views;

    public Show(String title, String creator, String director) {
        this.title = title;
        this.creator = creator;
        this.director = director;

        seasons = 0;
        episodes = 0;
        age = 0;
        rating = 0.0;
        watchtime = 0;
        views = 0;

    }


    public void premiere() {
        seasons += 1;
        System.out.println("Your show has premiered season number " + seasons + "!");
    }

    public void release() {
        episodes += 1;
        System.out.println(title + " now has " + episodes + " episodes!");
    }

    public void end() {
        boolean bowl = inDevelopment;
        if(bowl) {
            inDevelopment = false;
            System.out.println(title + " is no longer in production.");
        } else {
            inDevelopment = true;
            System.out.println(title + " has been renwed and is back in production!");
        }
    }

    public void good() {
        if (rating >= 9.0) {
            rating = 10.0;
            System.out.println("Your ratings on " + title + " can't get any better!");
        } else {
            rating += 1.5;
            System.out.println("Your ratings on " + title + " are " + rating + " out of 10 stars.");
        }
    }

    public void bad() {
        if (rating <= 0.0) {
            rating = 0.0;
            System.out.println("Your ratings on " + title + " can't get any worse!");
        } else {
            rating -= 1.5;
            System.out.println("Your ratings on " + title + " are " + rating + " out of 10 stars.");
        }
    }

    public void anniversary() {
        age += 1;
        System.out.println("Happy anniversary, " + title + "!");
        System.out.println("In year " + age + ", it has");
        System.out.println(seasons + " seasons and " + episodes + " episodes!");
    }

    public void advertise() {
        if(views < 10000) {
            views += 5;
            views = views * 3;
            watchtime += 180;
            System.out.println(title + " has gotten a boost, and is now at " + views + " views!");
        } else {
            views = views * 2;
            watchtime += 120;
            System.out.println(title + " is now at " + views + " views.");
        }
    }




}
Show arben = new Show("Arben's World", "Arben Husenaj", "John Pork");
arben.title
arben.creator
arben.director
arben.seasons
arben.episodes
arben.age
arben.rating
arben.inDevelopment
arben.watchtime
arbe.views
arben.views
arben.premiere()
arben.release()
arben.end()
arben.good()
arben.bad()
arben.anniversary()
arben.advertise
arben.advertise()
Show jp = new Show("John Pork Adventures", "John Pork", "Jane Pork");
jp.title
jp.creator
jp.director
jp.seasons
jp.episodes
jp.age
jp.rating
jp.inDevelopment
jp.watchtime
jp.views
jp.premiere()
jp.release()
jp.end()
jp.good()
jp.bad()
jp.anniversary()
jp.advertise()
Show java = new Show("How Java was Made", "Mr. Java", "Mrs. Java");
java.title
java.creator
java.director
java.seasons
java.episodes
java.age
java.rating
java.inDevelopment
java.watchtime
java.views
java.premiere()
java.release()
java.end()
java.good()
java.bad()
java.anniversary()
java.advertise()
Show rat = new Show("The Rato Show", "Joel Mouse", "Arben Mouse");
rat.title
rat.creato
rat.creator
rat.director
rat.seasons
rat.episodes
rat.age
rat.rating
rat.inDevelopment
rat.watchtime
rat.views
rat.premiere()
rat.release()
rat.end()
rat.good()
rat.bad()
rat.anniversary()
rat.advertise()
Show pc = new Show("My Personal Computer", "Patrick Computer", "Perfectly Compution");
pc.title
pc.creator
pc.director
pc.seasons
pc.episodes
pc.age
pc.rating
pc.inDevelopment
pc.watchtime
pc.views
pc.premiere()
pc.release()
pc.end()
pc.end()
pc.good()
pc.bad()
pc.anniversary()
pc.advertise()