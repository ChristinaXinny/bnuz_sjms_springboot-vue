package salary_system.javafxUI.javasrc;



import com.sun.xml.internal.bind.v2.model.core.ID;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import salary_system.db.javabean.bean.Employee;
import salary_system.db.javabean.bean.WageCard;
import salary_system.javafxUI.table.EmployeeTable;
import salary_system.server.nowdatebase.NowEmployee;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


/**
 * @author ChristinaXinny
 * @create 2021-05-20 12:25 AM
 */


public class EmployeeTableController implements Initializable {

    //@FXML
    //private ResourceBundle resources;
    //@FXML
    //private URL location;

    @FXML private TableColumn<EmployeeTable, Integer> IDCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, String> nameCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, String> sexCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, Integer> ageCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, String> addressCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, String> bankCardCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, String> departmentCol = new TableColumn<>();
    @FXML private TableColumn<EmployeeTable, String> wageCardCol = new TableColumn<>();
    @FXML private TableView<EmployeeTable> EmpTableView = new TableView<>();    //tableView
    @FXML private List<EmployeeTable> materialList = new ArrayList<>(); //放置数据的集合


    public void showList(){
        ObservableList<EmployeeTable> list = FXCollections.observableArrayList(); //javaFX 的数据集合

        NowEmployee nowEmployeeTable = new NowEmployee();

        IDCol.setCellValueFactory(new PropertyValueFactory<>("ID"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        sexCol.setCellValueFactory(new PropertyValueFactory<>("sex"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        bankCardCol.setCellValueFactory(new PropertyValueFactory<>("bankCard"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        wageCardCol.setCellValueFactory(new PropertyValueFactory<>("wageCard"));

        //list.add(new EmployeeTable(12,"23","34",2,"23","43","xx","asa"));

        List<Employee> employeeList = nowEmployeeTable.getAll();
        for (Employee em : employeeList){
            EmployeeTable et = new EmployeeTable(em.getEmpId(), em.getName(), em.getSex(), em.getAge(), em.getAddress(), em.getBankCard(), em.getDepartment(),em.getWageCard());
            //materialList.add(et);
            list.add(et);
        }







        //list.addAll(materialList);
        //System.out.println("ddddd");
        //list.forEach(System.out::println);
        EmpTableView.setItems(list);

        //for (EmployeeTable em : materialList){
        //    list.add(em);
        //
        //}

        EmpTableView.setItems(list);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showList();
    }


    //private TableColumn<EmployeeTable, Integer> ID ;
    //@FXML
    //private TableColumn<EmployeeTable, String> Name;
    //@FXML
    //private TableColumn<EmployeeTable, String> Sex ;
    //@FXML
    //private TableColumn<EmployeeTable, Integer> Age;
    //@FXML
    //private TableColumn<EmployeeTable, String> Address ;
    //@FXML
    //private TableColumn<EmployeeTable, String> BankCard;
    //@FXML
    //private TableColumn<EmployeeTable, String> Department ;
    //@FXML
    //private TableColumn<EmployeeTable, String> WageCard  ;
    //
    //@FXML
    //private TableView<EmployeeTable> EmployeeTableTableView ;    //tableView
    //private ObservableList<EmployeeMessage> data = FXCollections.observableArrayList();

    //@FXML
    //private Label nowDate;
    //
    //@FXML
    //private Button showData;
    //
    //@FXML
    //private Button udateDate;


    //@Override
    //public void initialize(URL location, ResourceBundle resources) {
    //    Date date = new Date();
    //    String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    //    nowDate.setText(now);
    //    dataTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    //    configTableView();
    //    initButton();
    //}



    ///**
    // * 配置表格，绑定表格的每列
    // */
    //private void configTableView() {
    //
    //    //前面的是TableColumn的名字 后面是来自类的属性名字
    //    ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
    //    Name.setCellValueFactory(new PropertyValueFactory<>("name"));
    //    Sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
    //    Age.setCellValueFactory(new PropertyValueFactory<>("age"));
    //    Address.setCellValueFactory(new PropertyValueFactory<>("address"));
    //    BankCard.setCellValueFactory(new PropertyValueFactory<>("bankCard"));
    //    Department.setCellValueFactory(new PropertyValueFactory<>("department"));
    //    WageCard.setCellValueFactory(new PropertyValueFactory<>("wageCard"));
    //    EmployeeTableTableView.setItems(list);
    //}
    //
    //public void showEmpTable(){
    //    //if(generateDate()!=null){
    //    materialList = generateDate();
    //    //}
    //    //System.out.println(materialList.size()+"----"+materialList.get(0).getName());
    //    //EmployeeTableTableView.setItems(list);
    //    list.addAll(materialList);
    //    EmployeeTableTableView.setItems(list);
    //}

    //填充TableColumn中的单元格,表格中的TableColumn与模型类中属性一一对应
    //emp

    ///**
    // * 生成数据
    // * @return List
    // */
    //private List<EmployeeTable> generateDate() {
    //    System.out.println("=====employeeList===generateDate=======");
    //    List<Employee> employeeList = nowEmployeeTable.getAll();
    //    employeeList.forEach(System.out::println);
    //
    //
    //    List<EmployeeTable> miList = new ArrayList<>();
    //
    //
    //    System.out.println("========generateDate=======");
    //    for (Employee em : employeeList){
    //        //System.out.println(em);
    //        EmployeeTable et = new EmployeeTable(em.getEmpId(), em.getName(), em.getSex(), em.getAge(), em.getAddress(), em.getBankCard(), em.getDepartment(),em.getWageCard());
    //        //System.out.println(et);
    //        miList.add(et);
    //    }
    //    System.out.println("====miList====generateDate=======");
    //
    //    miList.forEach(System.out::println);
    //
    //    return miList;
    //}

    //@Override
    //public void initialize(URL location, ResourceBundle resources) {
    //    //configTableView();
    //    //前面的是TableColumn的名字 后面是来自类的属性名字
    //
    //    ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
    //    Name.setCellValueFactory(new PropertyValueFactory<>("name"));
    //    Sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
    //    Age.setCellValueFactory(new PropertyValueFactory<>("age"));
    //    Address.setCellValueFactory(new PropertyValueFactory<>("address"));
    //    BankCard.setCellValueFactory(new PropertyValueFactory<>("bankCard"));
    //    Department.setCellValueFactory(new PropertyValueFactory<>("department"));
    //    WageCard.setCellValueFactory(new PropertyValueFactory<>("wageCard"));
    //    EmployeeTableTableView.setItems(list);
    //
    //
    //    List<Employee> employeeList = nowEmployeeTable.getAll();
    //    for (Employee em : employeeList){
    //        EmployeeTable et = new EmployeeTable(em.getEmpId(), em.getName(), em.getSex(), em.getAge(), em.getAddress(), em.getBankCard(), em.getDepartment(),em.getWageCard());
    //        materialList.add(et);
    //    }
    //
    //    list.addAll(materialList);
    //    list.forEach(System.out::println);
    //    EmployeeTableTableView.setItems(list);
    //
    //
    //}

    //
    //public static void main(String[] args) {
    //
    //}

}
