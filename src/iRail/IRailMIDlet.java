/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iRail;

import java.util.Calendar;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Maartje
 */
public class IRailMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    
    private Connection[] connections = null;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private java.util.Hashtable __previousDisplayables = new java.util.Hashtable();
    private Form PlanForm;
    private TextField fromTextfield;
    private ChoiceGroup choiceGroup;
    private DateField dateField;
    private TextField toTextfield;
    private List fromList;
    private List toList;
    private List optionsList;
    private Form tripDetailsForm;
    private StringItem tripDetailStringItem;
    private ImageItem tripDetailImageItem;
    private Command fromOK;
    private Command cancelCommand;
    private Command searchCommand;
    private Command exitCommand;
    private Command fromListOKCommand;
    private Command cancelFromListCommand;
    private Command cancelToListCommand;
    private Command optionsListBackCommand;
    private Command toListOKCommand;
    private Command okCommand;
    private Command tripDetailsbackCommand;
    private Command exitCommand1;
    private Image ICIRImage;
    private Image SImage;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The IRailMIDlet constructor.
     */
    public IRailMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    /**
     * Switches a display to previous displayable of the current displayable.
     * The
     * <code>display</code> instance is obtain from the
     * <code>getDisplay</code> method.
     */
    private void switchToPreviousDisplayable() {
        Displayable __currentDisplayable = getDisplay().getCurrent();
        if (__currentDisplayable != null) {
            Displayable __nextDisplayable = (Displayable) __previousDisplayables.get(__currentDisplayable);
            if (__nextDisplayable != null) {
                switchDisplayable(null, __nextDisplayable);
            }
        }
    }
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize

    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
        
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getPlanForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then
     * <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        Displayable __currentDisplayable = display.getCurrent();
        if (__currentDisplayable != null && nextDisplayable != null) {
            __previousDisplayables.put(nextDisplayable, __currentDisplayable);
        }
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PlanForm ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of PlanForm component.
     *
     * @return the initialized component instance
     */
    public Form getPlanForm() {
        if (PlanForm == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            PlanForm = new Form("Plan Trip", new Item[]{getFromTextfield(), getToTextfield(), getDateField(), getChoiceGroup()});//GEN-BEGIN:|14-getter|1|14-postInit
            PlanForm.addCommand(getSearchCommand());
            PlanForm.addCommand(getExitCommand1());
            PlanForm.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return PlanForm;
    }
//</editor-fold>//GEN-END:|14-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == PlanForm) {//GEN-BEGIN:|7-commandAction|1|90-preAction
            if (command == exitCommand1) {//GEN-END:|7-commandAction|1|90-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|2|90-postAction
                // write post-action user code here
            } else if (command == searchCommand) {//GEN-LINE:|7-commandAction|3|44-preAction
                // write pre-action user code here
                
                switchDisplayable(null, getFromList());//GEN-LINE:|7-commandAction|4|44-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|46-preAction
        } else if (displayable == fromList) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|5|46-preAction
                // write pre-action user code here
                fromListAction();//GEN-LINE:|7-commandAction|6|46-postAction
                // write post-action user code here
            } else if (command == cancelFromListCommand) {//GEN-LINE:|7-commandAction|7|49-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|8|49-postAction
                // write post-action user code here
            } else if (command == fromListOKCommand) {//GEN-LINE:|7-commandAction|9|51-preAction
                // write pre-action user code here
                switchDisplayable(null, getToList());//GEN-LINE:|7-commandAction|10|51-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|65-preAction
        } else if (displayable == optionsList) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|11|65-preAction
                // write pre-action user code here
                optionsListAction();//GEN-LINE:|7-commandAction|12|65-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|13|74-preAction
                // write pre-action user code here
                Connection connection = connections[optionsList.getSelectedIndex()];
                switchDisplayable(null, getTripDetailsForm());//GEN-LINE:|7-commandAction|14|74-postAction
                // write post-action user code here
                getTripDetailImageItem().setImage(getTrainTypeImage(connection.getTrainTypes()));
                getTripDetailStringItem().setText(connection.getViaText().replace('|', '\n'));
            } else if (command == optionsListBackCommand) {//GEN-LINE:|7-commandAction|15|71-preAction
                // write pre-action user code here
                switchDisplayable(null, getPlanForm());//GEN-LINE:|7-commandAction|16|71-postAction
                // write post-action user code here
                optionsList = null;
            }//GEN-BEGIN:|7-commandAction|17|56-preAction
        } else if (displayable == toList) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|17|56-preAction
                // write pre-action user code here
                toListAction();//GEN-LINE:|7-commandAction|18|56-postAction
                // write post-action user code here
            } else if (command == cancelToListCommand) {//GEN-LINE:|7-commandAction|19|59-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|20|59-postAction
                // write post-action user code here
            } else if (command == toListOKCommand) {//GEN-LINE:|7-commandAction|21|68-preAction
                // write pre-action user code here
                switchDisplayable(null, getOptionsList());//GEN-LINE:|7-commandAction|22|68-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|23|84-preAction
        } else if (displayable == tripDetailsForm) {
            if (command == tripDetailsbackCommand) {//GEN-END:|7-commandAction|23|84-preAction
                // write pre-action user code here
                switchDisplayable(null, getOptionsList());//GEN-LINE:|7-commandAction|24|84-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|7-postCommandAction
        }//GEN-END:|7-commandAction|25|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|26|
//</editor-fold>//GEN-END:|7-commandAction|26|




//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fromTextfield ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initialized instance of fromTextfield component.
     *
     * @return the initialized component instance
     */
    public TextField getFromTextfield() {
        if (fromTextfield == null) {//GEN-END:|19-getter|0|19-preInit
            // write pre-init user code here
            fromTextfield = new TextField("From", null, 32, TextField.ANY);//GEN-LINE:|19-getter|1|19-postInit
            // write post-init user code here
        }//GEN-BEGIN:|19-getter|2|
        return fromTextfield;
    }
//</editor-fold>//GEN-END:|19-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dateField ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initialized instance of dateField component.
     *
     * @return the initialized component instance
     */
    public DateField getDateField() {
        if (dateField == null) {//GEN-END:|20-getter|0|20-preInit
            // write pre-init user code here
            dateField = new DateField("When", DateField.DATE_TIME);//GEN-BEGIN:|20-getter|1|20-postInit
            dateField.setDate(new java.util.Date(System.currentTimeMillis()));//GEN-END:|20-getter|1|20-postInit
            // write post-init user code here
        }//GEN-BEGIN:|20-getter|2|
        return dateField;
    }
//</editor-fold>//GEN-END:|20-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|21-getter|0|21-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Time type", Choice.EXCLUSIVE);//GEN-BEGIN:|21-getter|1|21-postInit
            choiceGroup.append("Departure", null);
            choiceGroup.append("Arrival", null);
            choiceGroup.setSelectedFlags(new boolean[]{false, false});//GEN-END:|21-getter|1|21-postInit
            // write post-init user code here
        }//GEN-BEGIN:|21-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|21-getter|2|









//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fromOK ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initialized instance of fromOK component.
     *
     * @return the initialized component instance
     */
    public Command getFromOK() {
        if (fromOK == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            fromOK = new Command("Ok", Command.OK, 0);//GEN-LINE:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return fromOK;
    }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelCommand ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initialized instance of cancelCommand component.
     *
     * @return the initialized component instance
     */
    public Command getCancelCommand() {
        if (cancelCommand == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            cancelCommand = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return cancelCommand;
    }
//</editor-fold>//GEN-END:|33-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|41-getter|0|41-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|41-getter|1|41-postInit
            // write post-init user code here
        }//GEN-BEGIN:|41-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|41-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: searchCommand ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initialized instance of searchCommand component.
     *
     * @return the initialized component instance
     */
    public Command getSearchCommand() {
        if (searchCommand == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            searchCommand = new Command("Search", Command.OK, 0);//GEN-LINE:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return searchCommand;
    }
//</editor-fold>//GEN-END:|43-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fromList ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initialized instance of fromList component.
     *
     * @return the initialized component instance
     */
    public List getFromList() {
        if (fromList == null) {//GEN-END:|45-getter|0|45-preInit
            // write pre-init user code here
            String[] stations = API.getStations(getFromTextfield().getString());
            fromList = new List("From", Choice.IMPLICIT);//GEN-BEGIN:|45-getter|1|45-postInit
            fromList.addCommand(getCancelFromListCommand());
            fromList.addCommand(getFromListOKCommand());
            fromList.setCommandListener(this);//GEN-END:|45-getter|1|45-postInit
            // write post-init user code here
            for (int i = 0; i < stations.length; i++) {
                if (stations[i] != null) {
                    fromList.append(stations[i], null);
                }
            }
        }//GEN-BEGIN:|45-getter|2|
        return fromList;
    }
//</editor-fold>//GEN-END:|45-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: fromListAction ">//GEN-BEGIN:|45-action|0|45-preAction
    /**
     * Performs an action assigned to the selected list element in the fromList
     * component.
     */
    public void fromListAction() {//GEN-END:|45-action|0|45-preAction
        // enter pre-action user code here
        String __selectedString = getFromList().getString(getFromList().getSelectedIndex());//GEN-LINE:|45-action|1|45-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|45-action|2|
//</editor-fold>//GEN-END:|45-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelFromListCommand ">//GEN-BEGIN:|48-getter|0|48-preInit
    /**
     * Returns an initialized instance of cancelFromListCommand component.
     *
     * @return the initialized component instance
     */
    public Command getCancelFromListCommand() {
        if (cancelFromListCommand == null) {//GEN-END:|48-getter|0|48-preInit
            // write pre-init user code here
            cancelFromListCommand = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|48-getter|1|48-postInit
            // write post-init user code here
        }//GEN-BEGIN:|48-getter|2|
        return cancelFromListCommand;
    }
//</editor-fold>//GEN-END:|48-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fromListOKCommand ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initialized instance of fromListOKCommand component.
     *
     * @return the initialized component instance
     */
    public Command getFromListOKCommand() {
        if (fromListOKCommand == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            fromListOKCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return fromListOKCommand;
    }
//</editor-fold>//GEN-END:|50-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: toList ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initialized instance of toList component.
     *
     * @return the initialized component instance
     */
    public List getToList() {
        if (toList == null) {//GEN-END:|55-getter|0|55-preInit
            // write pre-init user code here
            String[] stations = API.getStations(getToTextfield().getString());
            toList = new List("To", Choice.IMPLICIT);//GEN-BEGIN:|55-getter|1|55-postInit
            toList.addCommand(getCancelToListCommand());
            toList.addCommand(getToListOKCommand());
            toList.setCommandListener(this);//GEN-END:|55-getter|1|55-postInit
            // write post-init user code here
            for (int i = 0; i < stations.length; i++) {
                if (stations[i] != null) {
                    toList.append(stations[i], null);
                }
            }
        }//GEN-BEGIN:|55-getter|2|
        return toList;
    }
//</editor-fold>//GEN-END:|55-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: toListAction ">//GEN-BEGIN:|55-action|0|55-preAction
    /**
     * Performs an action assigned to the selected list element in the toList
     * component.
     */
    public void toListAction() {//GEN-END:|55-action|0|55-preAction
        // enter pre-action user code here
        String __selectedString = getToList().getString(getToList().getSelectedIndex());//GEN-LINE:|55-action|1|55-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|55-action|2|
//</editor-fold>//GEN-END:|55-action|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelToListCommand ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initialized instance of cancelToListCommand component.
     *
     * @return the initialized component instance
     */
    public Command getCancelToListCommand() {
        if (cancelToListCommand == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            cancelToListCommand = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return cancelToListCommand;
    }
//</editor-fold>//GEN-END:|58-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: toTextfield ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initialized instance of toTextfield component.
     *
     * @return the initialized component instance
     */
    public TextField getToTextfield() {
        if (toTextfield == null) {//GEN-END:|63-getter|0|63-preInit
            // write pre-init user code here
            toTextfield = new TextField("To", null, 32, TextField.ANY);//GEN-LINE:|63-getter|1|63-postInit
            // write post-init user code here
        }//GEN-BEGIN:|63-getter|2|
        return toTextfield;
    }
//</editor-fold>//GEN-END:|63-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Method: optionsListAction ">//GEN-BEGIN:|64-action|0|64-preAction
    /**
     * Performs an action assigned to the selected list element in the
     * optionsList component.
     */
    public void optionsListAction() {//GEN-END:|64-action|0|64-preAction
        // enter pre-action user code here
        String __selectedString = getOptionsList().getString(getOptionsList().getSelectedIndex());//GEN-LINE:|64-action|1|64-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|64-action|2|
//</editor-fold>//GEN-END:|64-action|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: toListOKCommand ">//GEN-BEGIN:|67-getter|0|67-preInit
    /**
     * Returns an initialized instance of toListOKCommand component.
     *
     * @return the initialized component instance
     */
    public Command getToListOKCommand() {
        if (toListOKCommand == null) {//GEN-END:|67-getter|0|67-preInit
            // write pre-init user code here
            toListOKCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|67-getter|1|67-postInit
            // write post-init user code here
        }//GEN-BEGIN:|67-getter|2|
        return toListOKCommand;
    }
//</editor-fold>//GEN-END:|67-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: optionsListBackCommand ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initialized instance of optionsListBackCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOptionsListBackCommand() {
        if (optionsListBackCommand == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            optionsListBackCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return optionsListBackCommand;
    }
//</editor-fold>//GEN-END:|70-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|73-getter|1|73-postInit
            // write post-init user code here
        }//GEN-BEGIN:|73-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|73-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: ICIRImage ">//GEN-BEGIN:|77-getter|0|77-preInit
    /**
     * Returns an initialized instance of ICIRImage component.
     *
     * @return the initialized component instance
     */
    public Image getICIRImage() {
        if (ICIRImage == null) {//GEN-END:|77-getter|0|77-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|77-getter|1|77-@java.io.IOException
                ICIRImage = Image.createImage("/icir-small (Custom) (2).JPG");
            } catch (java.io.IOException e) {//GEN-END:|77-getter|1|77-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|77-getter|2|77-postInit
            // write post-init user code here
        }//GEN-BEGIN:|77-getter|3|
        return ICIRImage;
    }
//</editor-fold>//GEN-END:|77-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: SImage ">//GEN-BEGIN:|79-getter|0|79-preInit
    /**
     * Returns an initialized instance of SImage component.
     *
     * @return the initialized component instance
     */
    public Image getSImage() {
        if (SImage == null) {//GEN-END:|79-getter|0|79-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|79-getter|1|79-@java.io.IOException
                SImage = Image.createImage("/S-logo_yellow130C_B-blue (Custom) (2).jpg");
            } catch (java.io.IOException e) {//GEN-END:|79-getter|1|79-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|79-getter|2|79-postInit
            // write post-init user code here
        }//GEN-BEGIN:|79-getter|3|
        return SImage;
    }
//</editor-fold>//GEN-END:|79-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: optionsList ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initialized instance of optionsList component.
     *
     * @return the initialized component instance
     */
    public List getOptionsList() {
        if (optionsList == null) {//GEN-END:|64-getter|0|64-preInit
            // write pre-init user code here
            String from = fromList.getString(fromList.getSelectedIndex());
            String to = toList.getString(toList.getSelectedIndex());
    
            Calendar c = Calendar.getInstance();
            c.setTime(getDateField().getDate());
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH) + 1;
            int day = c.get(Calendar.DATE);
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);
            
            String yearShort = (year+"").substring(2, 4); // if you read this code in the year 10000, I am so so sorry but with all this global warming i thought nobody would make it.
            String date = (day<10?"0": "")+day+(month<10? "0": "")+month+yearShort;
            String time = (hour<10? "0": "")+hour+""+(minute<10? "0": "")+minute;
            
            
            connections = API.getConnections(from, to, time, date, getChoiceGroup().getString(getChoiceGroup().getSelectedIndex()).toLowerCase());
            optionsList = new List("Options", Choice.IMPLICIT);//GEN-BEGIN:|64-getter|1|64-postInit
            optionsList.addCommand(getOptionsListBackCommand());
            optionsList.addCommand(getOkCommand());
            optionsList.setCommandListener(this);
            optionsList.setSelectedFlags(new boolean[]{});//GEN-END:|64-getter|1|64-postInit
            // write post-init user code here
            for (int i = 0; i < connections.length; i++) {
            Connection connection = connections[i];
            if (connection != null) {
                Image image = getTrainTypeImage(connection.getTrainTypes());
                optionsList.append(connection.getDepartureTime() + " - "+ connection.getArrivalTime(), image);
            }
            
            toList = null;
            fromList = null;
        }
        }//GEN-BEGIN:|64-getter|2|
        return optionsList;
    }
//</editor-fold>//GEN-END:|64-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tripDetailsForm ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initialized instance of tripDetailsForm component.
     *
     * @return the initialized component instance
     */
    public Form getTripDetailsForm() {
        if (tripDetailsForm == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            tripDetailsForm = new Form("Trip Details", new Item[]{getTripDetailImageItem(), getTripDetailStringItem()});//GEN-BEGIN:|82-getter|1|82-postInit
            tripDetailsForm.addCommand(getTripDetailsbackCommand());
            tripDetailsForm.setCommandListener(this);//GEN-END:|82-getter|1|82-postInit
            // write post-init user code he
        }//GEN-BEGIN:|82-getter|2|
        return tripDetailsForm;
    }
//</editor-fold>//GEN-END:|82-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tripDetailImageItem ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initialized instance of tripDetailImageItem component.
     *
     * @return the initialized component instance
     */
    public ImageItem getTripDetailImageItem() {
        if (tripDetailImageItem == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            tripDetailImageItem = new ImageItem("", null, ImageItem.LAYOUT_DEFAULT, "<Missing Image>");//GEN-LINE:|86-getter|1|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|2|
        return tripDetailImageItem;
    }
//</editor-fold>//GEN-END:|86-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tripDetailStringItem ">//GEN-BEGIN:|87-getter|0|87-preInit
    /**
     * Returns an initialized instance of tripDetailStringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getTripDetailStringItem() {
        if (tripDetailStringItem == null) {//GEN-END:|87-getter|0|87-preInit
            // write pre-init user code here
            tripDetailStringItem = new StringItem("Details", null);//GEN-LINE:|87-getter|1|87-postInit
            // write post-init user code here
        }//GEN-BEGIN:|87-getter|2|
        return tripDetailStringItem;
    }
//</editor-fold>//GEN-END:|87-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tripDetailsbackCommand ">//GEN-BEGIN:|83-getter|0|83-preInit
    /**
     * Returns an initialized instance of tripDetailsbackCommand component.
     *
     * @return the initialized component instance
     */
    public Command getTripDetailsbackCommand() {
        if (tripDetailsbackCommand == null) {//GEN-END:|83-getter|0|83-preInit
            // write pre-init user code here
            tripDetailsbackCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|83-getter|1|83-postInit
            // write post-init user code here
        }//GEN-BEGIN:|83-getter|2|
        return tripDetailsbackCommand;
    }
//</editor-fold>//GEN-END:|83-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|89-getter|0|89-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|89-getter|0|89-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|89-getter|1|89-postInit
            // write post-init user code here
        }//GEN-BEGIN:|89-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|89-getter|2|



    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
    private Image getTrainTypeImage(String trainTypes) {
        if (trainTypes.indexOf("S") >= 0) {
            return getSImage();
        }
        if (trainTypes.indexOf("L") >= 0) {
            return getSImage(); //TODO: L trains need a new logo
        }
        return getICIRImage();
    }
}
