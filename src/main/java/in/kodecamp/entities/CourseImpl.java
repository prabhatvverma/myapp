package in.kodecamp.entities;

public class CourseImpl implements Course {

    private String title;
    private String duration;
    private String[] subjects;

    public CourseImpl(String title, String duration, String[] subjects){
        
        this.title = title;
        this.duration = duration;
        this.subjects = subjects; 
    }
    
    @Override
    public String title(){
    return title;
    }

    @Override
    public String duration(){
        return duration;

    }

    @Override
    public String[] subjects(){
        return subjects;
        
    }


}
