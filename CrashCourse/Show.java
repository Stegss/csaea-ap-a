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
        System.out.println(title + " now has " + episodes + " epidoes!");
    }

    public void end() {
        boolean bowl = inDevelopment;
        if(bowl) {
            inDevelopment = false;
            System.out.println(title + "is no longer in production.");
        } else {
            inDevelopment = true;
            System.out.println(title + "has been renwed and is back in production!");
        }
    }

    public void good() {
        if (rating >= 10.0) {
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
        System.out.println(seasons + " seasons and " + episodes + "episodes!");
    }

    public void advertise() {
        if(views < 10000) {
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
