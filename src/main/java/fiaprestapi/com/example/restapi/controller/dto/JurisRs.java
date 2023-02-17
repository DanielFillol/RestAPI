package fiaprestapi.com.example.restapi.controller.model.dto;

public class JurisRs {

    private String lawsuit_class,lawsuit_judge,lawsuit_city,trial_date,decision_short;

    public String getLawsuit_class() {
        return lawsuit_class;
    }

    public void setLawsuit_class(String lawsuit_class) {
        this.lawsuit_class = lawsuit_class;
    }

    public String getLawsuit_judge() {
        return lawsuit_judge;
    }

    public void setLawsuit_judge(String lawsuit_judge) {
        this.lawsuit_judge = lawsuit_judge;
    }

    public String getLawsuit_city() {
        return lawsuit_city;
    }

    public void setLawsuit_city(String lawsuit_city) {
        this.lawsuit_city = lawsuit_city;
    }

    public String getTrial_date() {
        return trial_date;
    }

    public void setTrial_date(String trial_date) {
        this.trial_date = trial_date;
    }

    public String getDecision_short() {
        return decision_short;
    }

    public void setDecision_short(String decision_short) {
        this.decision_short = decision_short;
    }

    @Override
    public String toString() {
        return "JurisRS{" +
                "lawsuit_class='" + lawsuit_class + '\'' +
                ", lawsuit_judge='" + lawsuit_judge + '\'' +
                ", lawsuit_city='" + lawsuit_city + '\'' +
                ", trial_date='" + trial_date + '\'' +
                ", decision_short='" + decision_short + '\'' +
                '}';
    }
}
