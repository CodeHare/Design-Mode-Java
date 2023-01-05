public class TeacherController {
    private Teacher model;
    private TeacherView view;

    TeacherController(Teacher model, TeacherView view){
        this.model = model;
        this.view = view;
    }

    public String getName(){
        return model.getName();
    }

    public void setName(String name){
        model.setName(name);
    }

    public String getSubject(){
        return model.getSubject();
    }

    public void setSubject(String subject){
        model.setSubject(subject);
    }

    public int getGender(){
        return model.getGender();
    }

    public void setGender(int gender){
        model.setGender(gender);
    }

    public int getCode(){
        return model.getCode();
    }

    public void setCode(int code){
        model.setCode(code);
    }

    public void updateView(){
        view.printTeacherDetails(model.getName(), model.getSubject(), model.getGender(), model.getCode());
    }
}
