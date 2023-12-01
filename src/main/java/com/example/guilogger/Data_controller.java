package com.example.guilogger;




import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class Data_controller {

    public static ObservableList<DefectlogData> defectlog;
    public static ObservableList<EffortlogData> effortlog;

    public void initData() {
        defectlog = FXCollections.observableArrayList(
                new DefectlogData("Header Misalignment", "The header on the homepage is misaligned with the page content", "2", "1", "Adjust CSS styling", "4"),
                new DefectlogData("App Crash on Load", "Application crashes when trying to load more than 100 items at once", "2", "2", "Optimize loading routine", "4"),
                new DefectlogData("Memory Leak", "Memory leak observed when processing large files", "8", "3", "Refactor file processing module", "9"),
                new DefectlogData("Settings Not Saved", "User settings changes are not being saved intermittently", "3", "4", "Debug save function", "6"),
                new DefectlogData("Authentication Flaw", "No authentication checks on the settings page", "6", "5", "Implement user authentication checks", "8")
        );
        effortlog = FXCollections.observableArrayList(
                new EffortlogData("1", "2023-11-01", "2h 30m", "Requirements Analysis", "Documentation", "User Stories", "5"),
                new EffortlogData("2", "2023-11-02", "3h 45m", "Design", "Design Review", "UI Mockups", "6"),
                new EffortlogData("3", "2023-11-03", "5h", "Coding", "Development", "Authentication Module", "8"),
                new EffortlogData("4", "2023-11-04", "4h 15m", "Testing", "Automated Testing", "API Endpoints", "10"),
                new EffortlogData("5", "2023-11-05", "1h 30m", "Deployment", "Deployment Planning", "Version 1.0 Release", "4")
        );

    }

    HelloController control1 = new HelloController();
    String life_step1 = control1.life_step;
    String categ1 = control1.categ;
    String deliv1 = control1.deliv;

    String timetoken = control1.time1;
    String effort = control1.weight;


    public void addData()
    {
        effortlog.add(new EffortlogData( String.valueOf(effortlog.size()),"2023-19-05", timetoken, ""+life_step1, ""+categ1, ""+deliv1, effort));
    }

    public void editData()
    {
        Defect_ConsoleController def1 = new Defect_ConsoleController();
        int ind = def1.ind1 - 1;
        defectlog.remove(ind);
        defectlog.add(ind, new DefectlogData(""+def1.change1, ""+def1.detail1, ""+def1.estimated1, ""+def1.index1, ""+def1.name1, ""+def1.required1));
    }

    public void editEffort()
    {
        Effort_Log_EditorController eff = new Effort_Log_EditorController();
        int ind3 = eff.ind2 - 1;
        effortlog.remove(ind3);
        effortlog.add(ind3, new EffortlogData(""+eff.ind, ""+eff.var, ""+eff.t, ""+eff.life, ""+eff.efc, ""+eff.del, ""+eff.efv));

    }

    public ObservableList<DefectlogData> getDefectlog() {
        return defectlog;
    }
    public void setDefectlog(ObservableList<DefectlogData> defectlog) {
        this.defectlog = defectlog;
    }

    public ObservableList<EffortlogData> getEffortlog() {
        return effortlog;
    }
    public void setEffortlog(ObservableList<EffortlogData> effortlog) {
        this.effortlog = effortlog;
    }
//    public void updateEffortLogData(int index, String newDate, String newTimeTaken, String newLifeCycleStep,
//                                    String newEffortCategory, String newDeliverable, int newEffort) {
//        if (index >= 0 && index < effortlog.size()) {
//            EffortlogData data = effortlog.get(index);
//            data.setDate(newDate);
//            data.setTimeTaken(newTimeTaken);
//            data.setLifeCycleStep(newLifeCycleStep);
//            data.setEffortCategory(newEffortCategory);
//            data.setDeliverable(newDeliverable);
//            data.setEffort(newEffort);
//
//        }
//    }

}
