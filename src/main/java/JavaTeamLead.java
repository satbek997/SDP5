public class JavaTeamLead extends DeveloperDecarator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        System.out.println("Send Week Report to customer. ");
        return "";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
