/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sefinal;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import static javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.WHITE;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Random;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import static javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import static javafx.scene.paint.Color.WHITE;
import javafx.stage.Window;
import org.hibernate.Query;
/**
 *
 * @author vip
 */
public class Sefinal extends Application {
    
    Button exitBtn;
    Scene HP;
    Scene HP2;
    Scene Addmr ;  //Clinic Reception Scene
    Scene Update ; 
    Scene sceneforD;
    Scene Create;
    Scene Md;
    Scene SI;
    Scene acount;
    Scene enteryforM;
    Scene history ;
    Scene View ;
    Scene Viewc;
             String NameC=null;

    @Override
    public void start(Stage primaryStage) {
       ObservableList<String> themd=FXCollections.observableArrayList();
         ComboBox<String> cbohistory = new ComboBox<>(); 
          ComboBox<String> cboview = new ComboBox<>(); 
           Text text =new Text();
       //  String NameC=null;
     //الشاشة الرئيسية
         ImageView ac = new ImageView("Image/ac.png");
         ac.setFitWidth(39);
         ac.setFitHeight(41);
         
        
         ImageView lo = new ImageView("Image/lo.png");
         lo.setFitWidth(39);
         lo.setFitHeight(41);
         
         ImageView mr = new ImageView("Image/mr.png");
         mr.setFitWidth(42);
         mr.setFitHeight(42);
         
         
     Button bac = new Button("إنشاء حساب", ac);
     bac.setStyle("-fx-background-color:657889");
     bac.setTextFill(Color.web("657889"));
     bac.setContentDisplay(ContentDisplay.TOP);
              bac.setOpacity(0.5);
              

     
     Button blo = new Button("تسجيل الدخول", lo);
     blo.setStyle("-fx-background-color:657889");
     blo.setTextFill(Color.web("657889"));
     blo.setContentDisplay(ContentDisplay.TOP);
              blo.setOpacity(0.5);

     
     
     Button bmr = new Button("دخول المرافقين", mr);
     bmr.setStyle("-fx-background-color:657889");
     bmr.setTextFill(Color.web("657889"));
     bmr.setContentDisplay(ContentDisplay.TOP);
              bmr.setOpacity(0.6);

   
 
       HBox paneForButtons = new HBox(2);
       paneForButtons.getChildren().addAll(bac,blo,bmr);
       paneForButtons.setAlignment(Pos.BOTTOM_CENTER);
       paneForButtons.setPadding(new Insets(500, 300, 400, 40));
       
       
       Label latext = new Label("هل تعاني من نسيان مواعيد الأدويةبشكل مستمر؟\n"
            + "وتجهل تاريخك المرضي؟\n "
            + "لك تطبيق معين الذي يساعد على حل هذه\n المشكلات بأسهل طريقة\n "
            + "يمكنك إنشاء حساب للتعرف على\n المزيد من الخدمات التي تساعدك\n"
            + "وتساعد افراد أ سرتك\n");
        latext.setStyle("-fx-background-color:#A6D4DD;"
                + "-fx-border-color:#A6D4DD;"+"-fx-border-width:2");
       latext.setTextFill(Color.WHITE);
       latext.setTextAlignment(TextAlignment.CENTER);
       latext.setTranslateY(215);
       latext.setTranslateX(90);
                            latext.setStyle("-fx-font: 13 Calibri;");


        Rectangle rec= new Rectangle(63,210,265,150);
         rec.setFill(Color.web("#A6D4DD"));
         rec.setArcWidth(50);
         rec.setArcHeight(60);
             
         Rectangle rec1= new Rectangle(40,500,328,70);
         rec1.setFill(Color.web("#F1FBFF"));
         rec1.setArcWidth(50);
         rec1.setArcHeight(60);
         rec1.setOpacity(0.5);
       
         
        Image p = new Image("Image/صورة1.png");
        ImageView pe = new ImageView(p);
        pe.setX(190);
        pe.setY(13);
        pe.setFitHeight(231);
        pe.setFitWidth(217);
        
        Image back = new Image("Image/back.png");
        ImageView backe = new ImageView(back);

  
        
       Pane forpane = new Pane();
       forpane.setStyle("-fx-background-color:fbf2f1");
       forpane.getChildren().addAll(backe,rec1,paneForButtons,rec,pe,latext);
 
        HP = new Scene(forpane, 400, 600);
     
         
        blo.setOnAction(e->{
            primaryStage.setScene(SI);
        });
        bac.setOnAction(e->{
            primaryStage.setScene(Create);
        });
           bmr.setOnAction(e->{
           primaryStage.setScene(enteryforM);
        });
       
        ////اضافه دواء
      Image img = new Image("https://cdn-icons-png.flaticon.com/128/898/898620.png");
        ImageView imgadd = new ImageView(img);
        imgadd.setX(170);
        imgadd.setY(20);
        imgadd.setFitHeight(60);
        imgadd.setFitWidth(65);
        
        Text tx = new Text(155, 100, "إضافة وصفة");
        tx.setFill(Color.web("#998488"));
        tx.setStyle("-fx-font: 17 Calibri;");
         Line li2 = new Line(0,135,400,135);
        li2.setFill(Color.web("#657889"));
        
    
         ComboBox<String> cbo = new ComboBox<>(); 
        cbo.setEditable(true);
        cbo.setPrefWidth(250);
        cbo.setValue("إضافة وصفة لـ");
        cbo.getItems().addAll();
        cbo.setVisibleRowCount(3);
        cbo.setStyle("-fx-font: 17 Calibri;");
        
        HBox hhb1 = new HBox(50);
        TextField tf1 = new TextField();
        Label llt1 = new Label("اسم الدواء");
        hhb1.getChildren().addAll(tf1, llt1);
        hhb1.setAlignment(Pos.CENTER);
        llt1.setTextFill(Color.web("#998488"));
        llt1.setStyle("-fx-font: 17 Calibri;");
        
        HBox hhb2 = new HBox(50);
        TextField tf2 = new TextField();
        Label llt2 = new Label("وقت النوم");
        hhb2.getChildren().addAll(tf2, llt2);
        hhb2.setAlignment(Pos.CENTER);
        llt2.setTextFill(Color.web("#998488"));
        llt2.setStyle("-fx-font: 17 Calibri;");
        
        HBox hhb3 = new HBox(5);
        TextField tf3 = new TextField();
        Label llt3 = new Label("عدد الحبوب المتوفر");
        hhb3.getChildren().addAll(tf3, llt3);
        hhb3.setAlignment(Pos.CENTER);
        llt3.setTextFill(Color.web("#998488"));
        llt3.setStyle("-fx-font: 17 Calibri;");
        
        RadioButton big2 = new RadioButton();
        Label lllt3 = new Label("مدة العلاج طويلة؟");
         HBox hhb33 = new HBox(5);
        hhb33.getChildren().addAll(lllt3, big2);
        hhb33.setAlignment(Pos.CENTER);
        lllt3.setTextFill(Color.web("#998488"));
        lllt3.setStyle("-fx-font: 17 Calibri;");
        
        HBox hhb4 = new HBox(5);

      
        TextField date1 = new TextField();
        
        
        
        Label llt4 = new Label(" حدد تاريخ إنتهاء الدواء");
        hhb4.getChildren().addAll(date1, llt4);
        hhb4.setAlignment(Pos.CENTER);
        llt4.setTextFill(Color.web("#998488"));
        llt4.setStyle("-fx-font: 17 Calibri;");
        
        RadioButton small2 = new RadioButton();
         Label lllt4 = new Label("مدة العلاج قصيـرة؟");
         HBox hhb34 = new HBox(5);
        hhb34.getChildren().addAll(lllt4, small2);
        hhb34.setAlignment(Pos.CENTER);
                        lllt4.setTextFill(Color.web("#998488"));
        lllt4.setStyle("-fx-font: 17 Calibri;");
        HBox hhb5 = new HBox(15);
        TextField tf4 = new TextField();
        
        Label llt5 = new Label("حدد المدة بالأرقام");
        hhb5.getChildren().addAll(tf4, llt5);
        hhb5.setAlignment(Pos.CENTER);
                llt5.setTextFill(Color.web("#998488"));
        llt5.setStyle("-fx-font: 17 Calibri;");
        
        ToggleGroup group1 = new ToggleGroup();
        small2.setToggleGroup(group1);
        big2.setToggleGroup(group1);
        
        CheckBox eat2 = new CheckBox();
        Label lllt5 = new Label("بإشتراط الأكل قبل الدواء");
         HBox hhb35 = new HBox(5);
        hhb35.getChildren().addAll(lllt5, eat2);
        hhb35.setAlignment(Pos.CENTER);
        lllt5.setTextFill(Color.web("#998488"));
        lllt5.setStyle("-fx-font: 17 Calibri;");
        
        VBox vb3 = new VBox(15);
        vb3.getChildren().addAll(cbo, hhb1, hhb2, hhb3, hhb33, hhb4, hhb34, hhb5, hhb35);
        vb3.setAlignment(Pos.CENTER);
        vb3.setPadding(new Insets(150, 10, 10, 30));

        Button butt = new Button("إضــافة");
        butt.setTextFill(Color.WHITE);
        butt.setAlignment(Pos.CENTER);
        butt.setTranslateX(145);
        butt.setTranslateY(535);
        butt.setStyle("-fx-background-color: #e2c3c9;");
        butt.setTextFill(Color.web("#FFFFFF"));
                 butt.setPrefHeight(32.0);
         butt.setPrefWidth(126.0);
        
        butt.setOnAction(e->{
               Session session5 = HibernateUtil.getSessionFactory().openSession();
             Transaction txx = session5.beginTransaction();
             
         medicne medicne2= new medicne();
      medicne2.setName(tf1.getText());
      medicne2.setExpiryDate(date1.getText());
      medicne2.setSleepT(tf2.getText());
      medicne2.setNumcap(tf3.getText());
      medicne2.setPeriod(tf4.getText());
      medicne2.setUsername(cbo.getValue());
     
        medicne2.setEat(eat2.isSelected());
    
             session5.save(medicne2);
  
             txx.commit();
             
             session5.close();
           
             
           history history= new history();
      history.setName(tf1.getText());
      history.setExpiryDate(date1.getText());
      history.setSleepT(tf2.getText());
      history.setNumcap(tf3.getText());
      history.setPeriod(tf4.getText());
      history.setUsername(cbo.getValue());
    
           history.setEat(eat2.isSelected());
     
         Session sessionhistory = HibernateUtil.getSessionFactory().openSession();
           Transaction thistory = sessionhistory.beginTransaction();
           
            sessionhistory.save(history);
        tf1.clear();
    date1.clear();
      tf2.clear();
     tf3.clear();
      tf4.clear();
             thistory.commit();
             sessionhistory.close();
             
        System.out.println("inserted medicne: "+medicne2.getName());
        
            primaryStage.setScene(HP2);
         
         });
     
         ImageView backi4=new ImageView(new Image("Image/ba.png"));
        backi4.setFitHeight(40.0);
        backi4.setFitWidth(30.0);
        backi4.setLayoutX(20.0);
        backi4.setLayoutY(30.0);
        backi4.setPickOnBounds(true);
        backi4.setPreserveRatio(true);
         
         Image backg = new Image("Image/back1.png");

        ImageView backee9 = new ImageView(backg);
        backee9.setFitWidth(400);
        backee9.setFitHeight(600); 
        
       Pane forAddme = new Pane();
       forAddme.setStyle("-fx-background-color:fbf2f1");
       forAddme.getChildren().addAll(backee9,imgadd,li2, tx, vb3, butt,backi4);
        Md = new Scene(forAddme, 400, 600);    
           
      
        
        //دخول مرافق 
        
            ImageView imglogo1=new ImageView("/Image/صورة1.png");
        imglogo1.setFitHeight(271.0);
        imglogo1.setFitWidth(218.0);
        imglogo1.setLayoutX(100.0);
        imglogo1.setLayoutY(33.0);
        imglogo1.setPickOnBounds(true);
        imglogo1.setPreserveRatio(true);
        
        Label lbcomp=new Label("دخول المـرافق");
        lbcomp.setAlignment(Pos.CENTER);
        lbcomp.setLayoutX(111.0);
        lbcomp.setLayoutY(190.0);
        lbcomp.setPrefHeight(38.0);
        lbcomp.setPrefWidth(196.0);
        lbcomp.setTextAlignment(TextAlignment.CENTER);
        lbcomp.setTextFill(Color.web("#998488"));
        lbcomp.setStyle("-fx-font: 17 Calibri;");
        
        Label lbcomp2=new Label("رقم المستخدم");
        lbcomp2.setAlignment(Pos.CENTER);
        lbcomp2.setLayoutX(290.0);
        lbcomp2.setLayoutY(280.0);
        lbcomp2.setPrefHeight(26.0);
        lbcomp2.setPrefWidth(98.0);
        lbcomp2.setTextAlignment(TextAlignment.CENTER);
        lbcomp2.setTextFill(Color.web("#998488"));
        lbcomp2.setStyle("-fx-font: 14 Calibri;");
        
      TextField num1=new TextField();
         num1.setAlignment(Pos.CENTER);
         num1.setLayoutX(62.0);
         num1.setOpacity(0.54);
         num1.setStyle("-fx-font: 21 Calibri;");
      
           Label lbcomp11=new Label();
           
          Button btcomp1=new Button();
         btcomp1.setLayoutX(187.0);
         btcomp1.setLayoutY(468.0);
         btcomp1.setMnemonicParsing(false);
         btcomp1.setPrefHeight(32.0);
         btcomp1.setPrefWidth(126.0);
         btcomp1.setStyle("-fx-background-color: #e2c3c9;");
         btcomp1.setText("دخول");
         btcomp1.setTextFill(Color.WHITE);
         
         Label ll = new Label();
         btcomp1.setOnAction(e->{
                        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx22 = session.beginTransaction();
        Query query = session.createQuery("from user where id = '"+ num1.getText()+"' ");
        tx22.commit();
        List<user> uu = query.list();
        session.close();
         if(!uu.isEmpty()){
            if(num1.getText().equals(uu.get(0).getId())){
            NameC=uu.get(0).getName();
              primaryStage.setScene(Viewc);
              lbcomp11.setText(NameC);
            }
                
        }  });

        VBox vbforcomp = new VBox(20);
         vbforcomp.setPadding(new Insets(20, 50, 50, 70));
                  vbforcomp.setAlignment(Pos.CENTER);

        vbforcomp.getChildren().addAll(imglogo1,lbcomp,num1,btcomp1);
        
       ImageView backi8=new ImageView(new Image("Image/ba.png"));
        backi8.setFitHeight(40.0);
        backi8.setFitWidth(30.0);
        backi8.setLayoutX(20.0);
        backi8.setLayoutY(30.0);
        backi8.setPickOnBounds(true);
        backi8.setPreserveRatio(true);  
        backi8.setOpacity(0.5);
       
        ImageView backee = new ImageView(backg);
        backee.setFitWidth(400);
        backee.setFitHeight(600);
        
         AnchorPane rooot=new AnchorPane();
        rooot.setStyle("-fx-background-color: fbf2f1;");
        rooot.getChildren().addAll(backee,lbcomp2,vbforcomp,backi8);
    enteryforM = new Scene(rooot,400,600);
              
          /// شاشه الجداولل للمرافق 

        ImageView imgView2= new ImageView(new Image("Image/notification.png"));
        imgView2.setX(170);
        imgView2.setY(20);
        imgView2.setFitHeight(60);
        imgView2.setFitWidth(65);
        
        Text tView2 = new Text(155, 100, "المواعيد ");
        tView2.setFill(Color.web("#998488"));
        tView2.setStyle("-fx-font: 17 Calibri;");
         Line lView1  = new Line(0,135,370,135);
        lView1.setFill(Color.web("#657889"));
  
  
    //   Label lbcomp11=new Label();
        lbcomp11.setText(NameC);
          lbcomp11.setStyle("-fx-font: 17 Calibri;");
            
         ObservableList <medicne> dataView1 =FXCollections.observableArrayList();
        tView2.setOnMouseClicked(e->{
            dataView1.clear();
               Session session = HibernateUtil.getSessionFactory().openSession();
             Transaction tx2 = session.beginTransaction();
             List<medicne> list =null;
             String queryp ="from medicne";
             Query query = session.createQuery(queryp);
             list=query.list();
                for(medicne m:list){ 
                  if (lbcomp11.getText().equals(m.getUsername()) ){
                   medicne mm=new medicne(m.getName(),m.getEat(),String.valueOf(24-Integer.valueOf(m.getSleepT())/Integer.valueOf(m.getPeriod()))); 
                   dataView1.add(mm);}
                    
                }
                tx2.commit();
                 session.close();});


         TableView<medicne> tableView1 = new TableView<medicne>(dataView1);  
  
        tableView1.setEditable(true); 
        tableView1.setMaxSize(320, 400);

        TableColumn ViewNameCol1 = new TableColumn("اسم الدواء");  
        ViewNameCol1.setMaxWidth(65);  
        ViewNameCol1.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("name")); 

        TableColumn ViewEatCol1 = new TableColumn("إشتراط الأكل قبل الدواء");  
        ViewEatCol1.setMinWidth(130);  
       ViewEatCol1.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("eat")); 
       
          TableColumn ViewTimeCo1l = new TableColumn("الموعد");  
        ViewTimeCo1l.setMaxWidth(65);  
        ViewTimeCo1l.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("Time")); 

        TableColumn ViewcheckCol1 = new TableColumn("تم");  
       ViewcheckCol1.setMaxWidth(60); 
  ViewcheckCol1.setCellFactory(
           new PropertyValueFactory<medicne , String>("done")); 
ViewcheckCol1.setCellFactory(TextFieldTableCell.forTableColumn());  
        ViewcheckCol1.setOnEditCommit(  
            new EventHandler<CellEditEvent<medicne, String>>() {  
                @Override  
                public void handle(CellEditEvent<medicne, String> t) {  
                    ((medicne) t.getTableView().getItems().get(  
                        t.getTablePosition().getRow())  
                        ).setCheck(t.getNewValue());  
                }  
            }  
        );  
 

        tableView1.getColumns().addAll(ViewNameCol1,ViewTimeCo1l, ViewEatCol1,ViewcheckCol1);
        
        Text ttx1 = new Text( "  يشترط الأكل قبل تناول الدواء"+
                " (true) "
                + " \n"
              + "(false)"
             + " لا يشترط الأكل قبل تناول الدواء "
                );
        ttx1.setStyle("-fx-font: 17 Calibri;");
        

        VBox Viewvbox1 = new VBox();  
        Viewvbox1.setSpacing(5);  
        Viewvbox1.setPadding(new Insets(10, 0, 0, 10)); 
        Viewvbox1.getChildren().addAll(imgView2,tView2,lView1,lbcomp11,tableView1,ttx1);
        Viewvbox1.setAlignment(Pos.CENTER);
        
        
        ImageView backee77 = new ImageView(backg);
        backee77.setFitWidth(400);
        backee77.setFitHeight(600); 
        
        Pane viewww = new Pane();
        viewww.getChildren().addAll(backee77,Viewvbox1);

         
            Viewc= new Scene(viewww, 400, 600);
         
      //شاشة تعديل الوصفة 
      
        Image imap = new Image("Image/pnc.png");
        ImageView impn = new ImageView(imap);
        impn.setX(160);
        impn.setY(15);
        impn.setFitHeight(60);
        impn.setFitWidth(60);
      
        Label lup = new Label("تعديل الوصفة");
        lup.setTranslateX(145);
        lup.setTranslateY(90);
                lup.setTextFill(Color.web("#998488"));
        lup.setStyle("-fx-font: 17 Calibri;");
        
          ComboBox<String> cbo22 = new ComboBox<>(); 
        cbo22.setEditable(true);
        cbo22.setPrefWidth(250);
        cbo22.setValue("اختيار التعديل لـ ");
        cbo22.setVisibleRowCount(3);
      
         ListView <String>listmd = new ListView<String>(themd);
             listmd.setPrefWidth(50);
             listmd.setPrefHeight(50);
        
    cbo22.setOnAction(e ->{
    
        List<String> options = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        
         medicne m = new medicne(); 
      List<medicne> list =null;
             String queryp ="from medicne";
             Query query = session.createQuery(queryp);
             list=query.list();
             for(medicne mm:list){
                     if(cbo22.getValue().equals(mm.getUsername())){
                      themd.addAll(mm.getName());
       
                       session.save(mm);   }
             }
        t1.commit();
        session.close();
    });
 
    
    
        HBox hb2 = new HBox(50);
        TextField tup2 = new TextField();
        Label lup2 = new Label("وقت النوم");
        hb2.getChildren().addAll(tup2, lup2);
        hb2.setAlignment(Pos.CENTER);
        lup2.setTextFill(Color.web("#998488"));
        lup2.setStyle("-fx-font: 17 Calibri;");
        
        HBox hb3 = new HBox(5);
        TextField tup3 = new TextField();
        Label lup3 = new Label("عدد الحبوب المتوفر");
        hb3.getChildren().addAll(tup3, lup3);
        hb3.setAlignment(Pos.CENTER);
        lup3.setTextFill(Color.web("#998488"));
        lup3.setStyle("-fx-font: 17 Calibri;");
        
         RadioButton big = new RadioButton();
        Label lllt = new Label("مدة العلاج طويلة؟");
         HBox hhb = new HBox(5);
        hhb.getChildren().addAll(lllt, big);
        hhb.setAlignment(Pos.CENTER);
        lllt.setTextFill(Color.web("#998488"));
        lllt.setStyle("-fx-font: 17 Calibri;");
        HBox hhb11 = new HBox(5);
      
        TextField date2 = new TextField();
        Label llt = new Label(" حدد تاريخ إنتهاء الدواء");
        hhb11.getChildren().addAll(date2, llt);
        hhb11.setAlignment(Pos.CENTER);
        llt.setTextFill(Color.web("#998488"));
        llt.setStyle("-fx-font: 17 Calibri;");
        
        RadioButton small = new RadioButton();
         Label lll = new Label("مدة العلاج قصيرة؟");
         HBox hhb37 = new HBox(5);
        hhb37.getChildren().addAll(lll, small);
        hhb37.setAlignment(Pos.CENTER);
         lll.setTextFill(Color.web("#998488"));
        lll.setStyle("-fx-font: 17 Calibri;");
        
        HBox hhb55 = new HBox(15);
        TextField tf66 = new TextField();
        Label llt55 = new Label("حدد المدة بالأرقام");
        hhb55.getChildren().addAll(tf66, llt55);
        hhb55.setAlignment(Pos.CENTER);
        llt55.setTextFill(Color.web("#998488"));
        llt55.setStyle("-fx-font: 17 Calibri;");
        
        ToggleGroup group11 = new ToggleGroup();
        small.setToggleGroup(group11);
        big.setToggleGroup(group11);
        
        CheckBox eat22 = new CheckBox();
        Label lllt55 = new Label("بإشتراط الأكل قبل الدواء");
         HBox hhb355 = new HBox(5);
        hhb355.getChildren().addAll(lllt55, eat22);
        hhb355.setAlignment(Pos.CENTER);
        lllt55.setTextFill(Color.web("#998488"));
        lllt55.setStyle("-fx-font: 17 Calibri;");
        
        VBox vb33 = new VBox(15);
        vb33.getChildren().addAll(cbo22 ,listmd,hb2, hb3,hhb, hhb11, hhb37, hhb55, hhb355);
   
        vb33.setAlignment(Pos.CENTER);
        vb33.setPadding(new Insets(150, 10, 10, 30));
        
     listmd.setOnMouseClicked(e -> { 
     medicne m = new medicne(); 
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<medicne> pList = null;
        String queryStr = "from medicne";
        Query query = session.createQuery(queryStr);
        
        pList = query.list();
        
      String ss =listmd.getSelectionModel().getSelectedItem();
        System.out.println("medicne list size: "+pList.size());
    
        for(medicne s: pList)
        { if (ss.equals(s.getName())){
            System.out.println(s.getName());
            tup2.setText(s.getSleepT());
            tup3.setText(s.getNumcap());
            date2.setText(s.getExpiryDate());
            tf66.setText(s.getPeriod());}
        } 
         session.close();
    
    });
     Button bsaveup = new Button("حــفـظ");
         bsaveup.setStyle("-fx-background-color: #e2c3c9;");
     bsaveup.setTextFill(Color.WHITE);
     bsaveup.setAlignment(Pos.CENTER);
     bsaveup.setTranslateX(220);
     bsaveup.setTranslateY(550);
     
     bsaveup.setOnAction(e -> {
          
            medicne m = new medicne(); 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
           String ss =listmd.getSelectionModel().getSelectedItem();
        
        m = (medicne)session.get(medicne.class, ss);
         m.setSleepT(tup2.getText());
           m.setNumcap(tup3.getText());
           m.setExpiryDate(date2.getText());
           m.setPeriod(tf66.getText()); 
           m.setEat(eat22.isSelected());

           session.getTransaction().commit();
           session.close();
           
               history history= new history();
      history.setName(ss+" "+" * ");
      history.setExpiryDate(date2.getText());
      history.setSleepT(tup2.getText());
      history.setNumcap(tup3.getText());
      history.setPeriod(tf66.getText());
      history.setUsername(cbo22.getValue());
         history.setEat(eat22.isSelected());
           Session sessionhistory = HibernateUtil.getSessionFactory().openSession();
             Transaction thistory = sessionhistory.beginTransaction();
             sessionhistory.save(history);
             thistory.commit();
             sessionhistory.close();
           
              Alert a = new Alert(AlertType.INFORMATION);   
              a.setContentText("تم التعديل");
              a.showAndWait();
       primaryStage.setScene(HP2);
   
     });

         Button bdeup = new Button("حــذف");
         bdeup.setStyle("-fx-background-color: #B65656;");
         bdeup.setTextFill(Color.WHITE);
         bdeup.setAlignment(Pos.CENTER);
         bdeup.setTranslateX(115);
         bdeup.setTranslateY(550);
         
        bdeup.setOnAction(e->{
                   medicne m = new medicne(); 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String ss =listmd.getSelectionModel().getSelectedItem();
        
        m = (medicne)session.get(medicne.class, ss);
         session.delete(m);
           session.getTransaction().commit();
           session.close();
           
                  Alert a = new Alert(AlertType.INFORMATION);   
              a.setContentText("تم الحذف");
              a.showAndWait();
       primaryStage.setScene(HP2);});
        
        
           ImageView backi3=new ImageView(new Image("Image/ba.png"));
        backi3.setFitHeight(40.0);
        backi3.setFitWidth(30.0);
        backi3.setLayoutX(20.0);
        backi3.setLayoutY(30.0);
        backi3.setPickOnBounds(true);
        backi3.setPreserveRatio(true);
        
      ImageView backee10 = new ImageView(backg);
        backee10.setFitWidth(400);
        backee10.setFitHeight(600);
        
        Pane forup = new Pane();
       forup.setStyle("-fx-background-color:fbf2f1");
       forup.getChildren().addAll(backee10,impn,li2,lup,vb33,bdeup,bsaveup,backi3);
        
  Update= new Scene(forup,400, 600);
  
       
       //تسجيل الدخول
    

    Image im8=new Image("/Image/صورة1.png");

    ImageView imv8=new ImageView(im8);

    imv8.setFitHeight(217.0);
    imv8.setFitWidth(271.0);
    imv8.setLayoutX(100.0);
    imv8.setLayoutY(16.0);
    imv8.setPickOnBounds(true);
    imv8.setPreserveRatio(true);

 

    Text text1 =new Text("تسجيل الدخول");

    text1.setFill(Color.web("#9b8589"));
    text1.setLayoutX(145.0);
    text1.setLayoutY(211.0);
    text1.setStrokeType(StrokeType.OUTSIDE);
    text1.setStyle("-fx-font: 24 Calibri;");

    Text text2 =new Text("البـريد الإلكتروني:");
    text2.setFill(Color.web("#9b8589"));
    text2.setLayoutX(245.0);
    text2.setLayoutY(270.0);
    text2.setStrokeType(StrokeType.OUTSIDE);
    text2.setStyle("-fx-font: 16 Calibri;");

    TextField tf=new TextField();
    tf.setLayoutX(64.0);
    tf.setLayoutY(285.0);
    tf.setPrefHeight(25.0);
    tf.setPrefWidth(279.0);
    tf.setStyle("-fx-border-color: #9b8589; -fx-border-width: 1; -fx-border-style: non;");

    TextField tff2=new TextField();
    tff2.setLayoutX(64.0);
    tff2.setLayoutY(377.0);
    tff2.setPrefHeight(25.0);
    tff2.setPrefWidth(279.0);
    tff2.setStyle("-fx-border-color: #9b8589; -fx-border-width: 1; -fx-border-style: non;");
   
    
    Text text3 =new Text("كلمة المرور:");
    text3.setFill(Color.web("#9b8589"));
    text3.setLayoutX(276.0);
    text3.setLayoutY(358.0);
    text3.setStrokeType(StrokeType.OUTSIDE);
    text3.setStyle("-fx-font: 16 Calibri;");

   Text msg=new Text();
   msg.setFill(Color.RED);
   msg.setLayoutX(80.0);
   msg.setLayoutY(432.0);
   msg.setStrokeType(StrokeType.OUTSIDE);
   msg.setFont(Font.font ("System Bold Italic", 12));
   
    Button b=new Button("دخول");
    b.setLayoutX(123.0);  
    b.setLayoutY(450.0);
    b.setMnemonicParsing(false);
b.setPrefHeight(32.0);
         b.setPrefWidth(126.0);
    b.setStyle("-fx-background-color: e2c3c9;");
    b.setTextFill(Color.WHITE);   
    b.setFont(Font.font ("System Bold Italic", 12));

    b.setOnAction(e->{
    int j = 0;
    
     Session session = HibernateUtil.getSessionFactory().openSession();
             Transaction tx222 = session.beginTransaction();
             List<user> list =null;
             String queryp ="from user";
             Query query = session.createQuery(queryp);
                  tx222.commit();
            list=query.list();
               for(user u:list){
                if(tf.getText().equals(u.getEmail()) && tff2.getText().equals(u.getPassword())){
                            j=1;
                            cbo.getItems().add(u.getName());
                            cbo22.getItems().add(u.getName());
                            cbohistory.getItems().add(u.getName());
                            cboview.getItems().add(u.getName());
                            text.setText(u.getName());
                            primaryStage.setScene(HP2);
             }
                else 
                       msg.setText("البريد الإلكتروني أو  كلمة السر غير صحيحة");
                  
                }
                
                
              /**    user u = list.get(0);
                   primaryStage.setScene(HP2);
                    cbo.getItems().add(u.getName());
                            cbo22.getItems().add(u.getName());
                            cbohistory.getItems().add(u.getName());
                            cboview.getItems().add(u.getName());
                            text.setText(u.getName());
                     if(tf.getText().equals(u.getEmail()) && tff2.getText().equals(u.getPassword())){
                             cbo.getItems().add(u.getName());
                            cbo22.getItems().add(u.getName());
                            cbohistory.getItems().add(u.getName());
                            cboview.getItems().add(u.getName());
                            text.setText(u.getName());
                            primaryStage.setScene(HP2);
           
        }**/
    
    
    });
    
        ImageView backi1=new ImageView(new Image("Image/ba.png"));
        backi1.setFitHeight(40.0);
        backi1.setFitWidth(30.0);
        backi1.setLayoutX(20.0);
        backi1.setLayoutY(30.0);
        backi1.setPickOnBounds(true);
        backi1.setPreserveRatio(true);
        
        ImageView backee1 = new ImageView(backg);
        backee1.setFitWidth(400);
        backee1.setFitHeight(600);   
        
        backi1.setOnMouseClicked(e -> {
             primaryStage.setScene(HP);
             });
        
    AnchorPane root2=new AnchorPane();

    root2.setStyle("-fx-background-color: fbf2f1;");
    root2.getChildren().addAll(backee1,imv8,text1,text2,tf,tff2,text3,b,msg,backi1);

      SI=new Scene(root2,400,600);
      
         //////انشاء حساب

         Image imgg = new Image("Image/صورة2.png");
        ImageView vi = new ImageView(imgg);
        vi.setX(115);
        vi.setY(20);
        vi.setFitHeight(80);
        vi.setFitWidth(150);
        
        Label l = new Label("إنشــاء حســاب");
        l.setTextFill(Color.web("657889"));
        l.setTranslateX(158);
        l.setTranslateY(108);
            l.setStyle("-fx-font: 17 Calibri;");
                    l.setTextFill(Color.web("#998488"));


        
        TextField ttf1 = new TextField();
        Label ltf1 = new Label("الإســم",ttf1);
        ltf1.setContentDisplay(ContentDisplay.BOTTOM);
                    ltf1.setStyle("-fx-font: 15 Calibri;");
          ltf1.setTextFill(Color.web("#998488"));


        TextField ttf2 = new TextField();
        Label ltf2 = new Label("الـعمر",ttf2);
        ltf2.setContentDisplay(ContentDisplay.BOTTOM);
                            ltf2.setStyle("-fx-font: 15 Calibri;");
          ltf2.setTextFill(Color.web("#998488"));

          TextField ttf3 = new TextField();
        Label ltf3 = new Label("رقم الجــوال",ttf3);
        ltf3.setContentDisplay(ContentDisplay.BOTTOM);
       ltf3.setStyle("-fx-font: 15 Calibri;");
          ltf3.setTextFill(Color.web("#998488"));

        
        TextField ttf4 = new TextField();
        Label ltf4 = new Label("البـريد الإلكـتروني",ttf4);
        ltf4.setContentDisplay(ContentDisplay.BOTTOM);
               ltf4.setStyle("-fx-font: 15 Calibri;");
          ltf4.setTextFill(Color.web("#998488"));

        
        TextField tf5 = new TextField();
        Label ltf5 = new Label("كلمـة المـرور",tf5);
        ltf5.setContentDisplay(ContentDisplay.BOTTOM);
               ltf5.setStyle("-fx-font: 15 Calibri;");
          ltf5.setTextFill(Color.web("#998488"));

        
        VBox vbtext = new VBox(5);
        vbtext.getChildren().addAll( ltf1, ltf2, ltf3, ltf4, ltf5);
        vbtext.setAlignment(Pos.CENTER);
        vbtext.setPadding(new Insets(150, 150, 150, 100));
        
        Button but = new Button("إنشـــاء");
but.setPrefHeight(32.0);
         but.setPrefWidth(126.0);
        but.setStyle("-fx-background-color:e2c3c9");
        but.setTextFill(Color.WHITE);
        but.setAlignment(Pos.CENTER);
        but.setTranslateX(130);
        but.setTranslateY(470);
         
        Line lii = new Line(0,135,400,135);
        lii.setFill(Color.web("#657889"));
        
        ImageView backi5=new ImageView(new Image("Image/ba.png"));
        backi5.setFitHeight(40.0);
        backi5.setFitWidth(30.0);
        backi5.setLayoutX(20.0);
        backi5.setLayoutY(30.0);
        backi5.setPickOnBounds(true);
        backi5.setPreserveRatio(true);
        
        ImageView backee2 = new ImageView(backg);
        backee2.setFitWidth(400);
        backee2.setFitHeight(600);  
        
        Pane forcre = new Pane();
        forcre.setStyle("-fx-background-color:fbf2f1");
        forcre.getChildren().addAll(backee2,l,lii,vi,vbtext, but,backi5);
         Create = new Scene(forcre, 400, 600);
  
         but.setOnAction(e->{
  if (ttf4.getText().isEmpty() || tf5.getText().isEmpty()||ttf1.getText().isEmpty() || ttf2.getText().isEmpty()||ttf3.getText().isEmpty()) {
     Alert a = new Alert(AlertType.ERROR);   
              a.setContentText("تأكد من ان جميع الحقول ممتلئة ");
              a.showAndWait();
  
        } else if (tf5.getText().length() < 8) {
            Alert a = new Alert(AlertType.ERROR);   
              a.setContentText("يجب ان تكون كلمة المرور اطول من ثمانية رموز ");
              a.showAndWait();
        }else if (ttf3.getText().length() < 10) {
            Alert a = new Alert(AlertType.ERROR);   
              a.setContentText("يجب ان يكون رقم الجوال اكثر من او يساوي عشر ارقام  ");
              a.showAndWait();
       }else if (Integer.valueOf(ttf2.getText())<18) {
            Alert a = new Alert(AlertType.ERROR);   
              a.setContentText("يجب ان يكون العمر اكبر من ثمانية عشر عاما ");
              a.showAndWait();
        } else {
            int j = 0;
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            List<user> list = null;
            String queryp = "from user";
            Query query = session.createQuery(queryp);
            list = query.list();
            for (user u : list) {
                if (u.getName().equals(ttf1.getText())){
               Alert a = new Alert(AlertType.ERROR);   
              a.setContentText( "اسم المستخدم مسجل بالفعل ");
              a.showAndWait();}
                else if(u.getEmail()==ttf4.getText()){
                Alert a = new Alert(AlertType.ERROR);   
              a.setContentText( "البريد الالكتروني مسجل بالفعل ");
              a.showAndWait();}
                 else {
                    j = 1;
         user user= new user ();
         user.setName(ttf1.getText());
         user.setAge(ttf2.getText());
         user.setMobile(ttf3.getText());
         user.setEmail(ttf4.getText());
         user.setPassword(tf5.getText());
         user.setId(null);
           session.save(user); 
         cbo.getItems().add(user.getName());
        cbo22.getItems().add(user.getName());
        cbohistory.getItems().add(user.getName()) ; 
         cboview.getItems().add(user.getName());
         text.setText(user.getName());
 
        System.out.println("inserted user: "+u.getName());
         primaryStage.setScene(HP2);}
                        t.commit();
                  session.close();}}
 
        });
    
        //شاشه الحساب الشخصي 
        ImageView imgg1=new ImageView("/Image/account.png");
        imgg1.setFitHeight(115.0);
        imgg1.setFitWidth(90.0);
        imgg1.setLayoutX(150.0);
        imgg1.setLayoutY(20.0);
        imgg1.setPickOnBounds(true);
        imgg1.setPreserveRatio(true);

      Line liii = new Line(0,135,400,135);
      liii.setFill(Color.web("#657889"));
        
         Label lbb1=new Label("الاسم");
         lbb1.setLayoutX(289.0);
         lbb1.setLayoutY(179.0);
         TextField tff1=new TextField();
         tff1.setEditable(false);
         tff1.setLayoutX(110.0);
         tff1.setLayoutY(171.0);
         tff1.setFocusTraversable(false);
                        lbb1.setStyle("-fx-font: 15 Calibri;");
          lbb1.setTextFill(Color.web("#998488"));


        
        HBox hhbb2 = new HBox(50);
        hhbb2.getChildren().addAll(tff1, lbb1);
    
        
        Label lbb2=new Label("البريد الإلكتروني");
        lbb2.setLayoutX(265.0);
        lbb2.setLayoutY(216.0);
        TextField tfff2=new TextField();
        tfff2.setLayoutX(111.0);
        tfff2.setLayoutY(208.0);
        tfff2.setFocusTraversable(false);
        tfff2.setEditable(false);
         lbb2.setStyle("-fx-font: 15 Calibri;");
          lbb2.setTextFill(Color.web("#998488"));


        HBox hhbb3 = new HBox(50);
        hhbb3.getChildren().addAll(tfff2, lbb2);
    
        
         Label lb3=new Label("العمر");
         lb3.setLayoutX(290.0);
         lb3.setLayoutY(254.0);
         TextField tff3=new TextField();
         tff3.setEditable(false);
         tff3.setLayoutX(111.0);
         tff3.setLayoutY(246.0);
         tff3.setFocusTraversable(false);
         lb3.setStyle("-fx-font: 15 Calibri;");
          lb3.setTextFill(Color.web("#998488"));
         
        HBox hhbb4 = new HBox(50);
        hhbb4.getChildren().addAll(tff3, lb3);
     
         
        Label lb4=new Label("رقم الجوال");
        lb4.setLayoutX(274.0);
        lb4.setLayoutY(291.0);
        TextField tff4=new TextField();
        tff4.setEditable(false);
        tff4.setLayoutX(111.0);
        tff4.setLayoutY(283.0);
        tff4.setFocusTraversable(false);
         lb4.setStyle("-fx-font: 15 Calibri;");
                   lb4.setTextFill(Color.web("#998488"));

         
        HBox hhbb5 = new HBox(50);
        hhbb5.getChildren().addAll(tff4, lb4);
  
        
         Label lb5=new Label("  المرافقين");
         lb5.setLayoutX(280.0);
         lb5.setLayoutY(291.0);
                  lb5.setStyle("-fx-font: 15 Calibri;");
                   lb5.setTextFill(Color.web("#998488"));

         
         ComboBox tff6=new ComboBox();
         tff6.setLayoutX(112.0);
         tff6.setLayoutY(291.0);
         tff6.setPrefWidth(150.0);
         tff6.setStyle("-fx-background-color: #e2c3c9;");
         tff6.setFocusTraversable(false);
         

    HBox hhb8 = new HBox(50);
    hhb8.getChildren().addAll(tff6, lb5);
    hhb8.setAlignment(Pos.CENTER);
    hhb8.setPadding(new Insets(445, 50, 50, 60));
        
        

         Label lb6=new Label("تغيير كلمة المرور");
         lb6.setLayoutX(250.0);
         lb6.setLayoutY(369.0); 
       
                           lb6.setStyle("-fx-font: 15 Calibri;");
                   lb6.setTextFill(Color.web("#998488"));

         TextField tff5=new TextField();
         tff5.setLayoutX(110.0);
         tff5.setLayoutY(392.0);
         tff5.setPromptText("ادخل كلمة المرور الحالية" );
      //   tff5.setFocusTraversable(false);
         tff5.setEditable(true);
                                    tff5.setStyle("-fx-font: 12.5 Calibri;");

        HBox hhbb6 = new HBox(50);
        hhbb6.getChildren().addAll(tff5, lb6);
    
          
         Label lb7=new Label("كلمة المرور الجديدة");
         lb7.setLayoutX(242.0);
         lb7.setLayoutY(431.0);
         TextField tf7=new TextField();  
         tf7.setLayoutX(110.0);
         tf7.setLayoutY(457.0);
       tf7.setPromptText("***" );
      //   tf7.setFocusTraversable(false);
         tf7.setEditable(true);
         lb7.setStyle("-fx-font: 15 Calibri;");
                            lb7.setTextFill(Color.web("#998488"));


        HBox hhbb7 = new HBox(50);
        hhbb7.getChildren().addAll(tf7, lb7);

        
        VBox vbbb3 = new VBox(15);
        vbbb3.getChildren().addAll(hhbb2,hhbb3,hhbb4,hhbb5,hhbb6,hhbb7);
        vbbb3.setAlignment(Pos.CENTER);
        vbbb3.setPadding(new Insets(150, 10, 10, 30));

         Button bt1=new Button();
         bt1.setLayoutX(129.0);
         bt1.setLayoutY(500.0);
         bt1.setMnemonicParsing(false);
         bt1.setPrefHeight(32.0);
         bt1.setPrefWidth(120.0);
         bt1.setStyle("-fx-background-color: #e2c3c9;");
         bt1.setText("حفظ");
           bt1.setTextFill(Color.web("#FFFFFF"));


        ImageView backi7=new ImageView(new Image("Image/ba.png"));
        backi7.setFitHeight(40.0);
        backi7.setFitWidth(30.0);
        backi7.setLayoutX(20.0);
        backi7.setLayoutY(30.0);
        backi7.setPickOnBounds(true);
        backi7.setPreserveRatio(true);
        
                ImageView backee4 = new ImageView(backg);
        backee4.setFitWidth(400);
        backee4.setFitHeight(600); 
       
      AnchorPane root9=new AnchorPane();
       root9.setStyle("-fx-background-color: fbf2f1;");
        
        root9.getChildren().addAll(backee4,imgg1,liii,vbbb3 ,hhb8,bt1,backi7);
        
        acount=new Scene(root9,400,600);
        
        bt1.setOnAction(e->{
            if(!tff5.getText().isEmpty()){
        Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            List<user> list = null;
            String queryp = "from user";
            Query query = session.createQuery(queryp);
            list = query.list();
            for (user u : list) {
                if (!u.getPassword().equals(tff5.getText())){
               Alert a = new Alert(AlertType.ERROR);   
              a.setContentText( "كلمة المرور غير صحيحة ");
              a.showAndWait();}
              else if (tf7.getText().equals(tff5.getText())){
                  Alert a = new Alert(AlertType.ERROR);   
              a.setContentText( "كلمة المرور متشابهة ");
              a.showAndWait();}
              else{
               u.setPassword(tf7.getText());   
               Alert a = new Alert(AlertType.CONFIRMATION);   
              a.setContentText( "تم تغير كلمة المرور ");
              a.showAndWait();
              }
            }
                   t.commit();
                  session.close();}});
        
        ///الشااشة هوم بيج
         Image im=new Image("/Image/account.png");
        ImageView imv=new ImageView(im);
        imv.setFitHeight(74.0);
        imv.setFitWidth(73.0);
        imv.setLayoutX(159.0);
        imv.setLayoutY(31.0);
        imv.setPickOnBounds(true);
        imv.setPreserveRatio(true);
        imv.setOpacity(0.5);
        
        imv.setOnMouseClicked(e ->{
              primaryStage.setScene(acount);
                Session sessionn = HibernateUtil.getSessionFactory().openSession();
           Transaction tn = sessionn.beginTransaction();
           List<user> listn = null;
           String querypn = "from user";
           Query queryn = sessionn.createQuery(querypn);
          listn = queryn.list();
          for (user u : listn) {
              if(tf.getText().equals(u.getEmail())){
                  
            tff1.setText(u.getName());
             tfff2.setText(u.getEmail());
             tff3.setText(u.getAge());
             tff4.setText(u.getMobile());
              }
              else if (ttf1.getText().equals(u.getName())){
              tff1.setText(u.getName());
             tfff2.setText(u.getEmail());
             tff3.setText(u.getAge());
             tff4.setText(u.getMobile());
              } }
              tn.commit();
                sessionn.close();
             });
        
       
        text.setLayoutX(176.0);
        text.setLayoutY(127.0);
        text.setStrokeType(StrokeType.OUTSIDE);
        text.setTextAlignment(TextAlignment.CENTER);
               text.setStyle("-fx-font: 15 Calibri;");
        
        Line l2=new Line();
        l2.setEndX(170.00003051757812);
        l2.setEndY(131.50001525878906);
        l2.setLayoutX(232.0);
        l2.setLayoutY(5.0);
        l2.setStartX(-230.0);
        l2.setStartY(131.50001525878906);
        
         Image out = new Image("Image/exit.png");
        ImageView ouut = new ImageView(out);
         ouut.setFitHeight(40.0);
        ouut.setFitWidth(30.0);
        ouut.setLayoutX(20.0);
        ouut.setLayoutY(30.0);
        ouut.setPickOnBounds(true);
        ouut.setPreserveRatio(true);
        ouut.setOnMouseClicked(e -> {
        primaryStage.setScene(HP);
        });
        
        Button b1=new Button("إضافة وصفة");
        b1.setLayoutX(61.0);
        b1.setLayoutY(221.0);
        b1.setMnemonicParsing(false);
        b1.setPrefHeight(87.0);
        b1.setPrefWidth(113.0);
        b1.setStyle("-fx-background-color: #A7D4DD; -fx-background-radius: 15;");
        b1.setTextFill(WHITE);
        b1.setTextOverrun(CENTER_WORD_ELLIPSIS);
        b1.setPadding(new Insets(50.0, 0, 0, 0));
        b1.setFont(Font.font ("Calibri Bold Italic", 12));
        
          
           b1.setOnAction(e->{
            primaryStage.setScene(Md);
        });
        
        
        Button b2=new Button("إضافة مرافق");
        b2.setLayoutX(224.0);
        b2.setLayoutY(221.0);
        b2.setMnemonicParsing(false);
        b2.setPrefHeight(87.0);
        b2.setPrefWidth(113.0);
        b2.setStyle("-fx-background-color: #A7D4DD; -fx-background-radius: 15;");
        b2.setTextFill(WHITE);
        b2.setTextOverrun(CENTER_WORD_ELLIPSIS);
        b2.setPadding(new Insets(50.0, 0, 0, 0));
        b2.setFont(Font.font ("Calibri Bold Italic", 12));
        
         b2.setOnAction(e->{
            primaryStage.setScene(Addmr);
        });
         
        Button b3=new Button("تعديل الوصفة");
        b3.setLayoutX(145.0);
        b3.setLayoutY(343.0);
        b3.setMnemonicParsing(false);
        b3.setPrefHeight(87.0);
        b3.setPrefWidth(113.0);
        b3.setStyle("-fx-background-color: #A7D4DD; -fx-background-radius: 15;");
        b3.setTextFill(WHITE);
        b3.setTextOverrun(CENTER_WORD_ELLIPSIS);
        b3.setPadding(new Insets(50.0, 0, 0, 0));
        b3.setFont(Font.font ("Calibri Bold Italic", 12));
        
        
         b3.setOnAction(e->{
            primaryStage.setScene(Update);
        });
         
         
        Image im2=new Image("/Image/addl.png");
        ImageView imv2=new ImageView(im2);
        imv2.setFitHeight(60.0);
        imv2.setFitWidth(52.0);
        imv2.setLayoutX(89.0);
        imv2.setLayoutY(228.0);
        imv2.setPickOnBounds(true);
        imv2.setPreserveRatio(true);
        
           imv2.setOnMouseClicked(e ->{
          primaryStage.setScene(Md);
         });
           
        Image im3=new Image("/Image/addm.png");
        ImageView imv3=new ImageView(im3);
        imv3.setFitHeight(60.0);
        imv3.setFitWidth(52.0);
        imv3.setLayoutX(255.0);
        imv3.setLayoutY(229.0);
        imv3.setPickOnBounds(true);
        imv3.setPreserveRatio(true);
        
         imv3.setOnMouseClicked(e ->{
          primaryStage.setScene(Addmr);
         });
        
        Image im4=new Image("/Image/edit.png");
        ImageView imv4=new ImageView(im4);
        imv4.setFitHeight(60.0);
        imv4.setFitWidth(52.0);
        imv4.setLayoutX(179.0);
        imv4.setLayoutY(350.0);
        imv4.setPickOnBounds(true);
        imv4.setPreserveRatio(true);
        
           imv4.setOnMouseClicked(e ->{
          primaryStage.setScene(Update);
         });
           
        Rectangle r=new Rectangle();
        r.setArcHeight(5.0);
        r.setArcWidth(5.0);
        r.setHeight(66.0);
        r.setLayoutY(534.0);
        r.setFill(Color.web("#e2c3c9"));
        r.setHeight(66.0);
        r.setLayoutY(534.0);
        r.setStroke(Color.web("#e2c3c9"));
        r.setStrokeType(StrokeType.INSIDE);
        r.setWidth(400.0);
        
        Image im5=new Image("/Image/history1.png");
        ImageView imv5=new ImageView(im5);
        imv5.setFitHeight(66.0);
        imv5.setFitWidth(52.0);
        imv5.setLayoutX(44.0);
        imv5.setLayoutY(540.0);
        imv5.setPickOnBounds(true);
        imv5.setPreserveRatio(true);
        imv5.setOnMouseClicked(e -> {
          primaryStage.setScene(history);
         });
        
        
        Circle c=new Circle(42.0);
        c.setFill(Color.web("#d9a6b0"));
        c.setLayoutX(195.0);
        c.setLayoutY(542.0);
        c.setStroke(Color.web("#d9a6b0"));
        c.setStrokeType(StrokeType.INSIDE);
        
        Image im6=new Image("/Image/view.png");
        ImageView imv6=new ImageView(im6);
        imv6.setFitHeight(60.0);
        imv6.setFitWidth(59.0);
        imv6.setLayoutX(164.0);
        imv6.setLayoutY(513.0);
        imv6.setPickOnBounds(true);
        imv6.setPreserveRatio(true);
          imv6.setOnMouseClicked(e -> {
          primaryStage.setScene(View);
         });
          
        Image im7=new Image("/Image/contact.png");
        ImageView imv7=new ImageView(im7);
        imv7.setFitHeight(66.0);
        imv7.setFitWidth(73.0);
        imv7.setLayoutX(280.0);
        imv7.setLayoutY(533.0);
        imv7.setPickOnBounds(true);
        imv7.setPreserveRatio(true);
        
        imv7.setOnMouseClicked(e -> {
          primaryStage.setScene(sceneforD);
         });
                Image backg2=new Image("/Image/back3.png");
                ImageView backee3 = new ImageView(backg2);
        backee3.setFitWidth(400);
        backee3.setFitHeight(600); 
        
        AnchorPane root=new AnchorPane();
        
        root.setStyle("-fx-background-color: fbf2f1;");
        
        root.getChildren().addAll(backee3,ouut,imv,text,l2,b1,b2,b3,imv2,imv3,imv4,r,imv5,c,imv6,imv7);
         HP2=new Scene(root,400,600);
        
      
        
        
        
      //// شاشه اضافة مرافق 
        
        
        Image imMr = new Image("Image/addm_1.png");
        ImageView imm = new ImageView(imMr);
        imm.setX(160);
        imm.setY(25);
        imm.setFitHeight(60);
        imm.setFitWidth(60);
        
        Label lad = new Label("إضافة مرافق ");
        lad.setTranslateX(155);
        lad.setTranslateY(90);
        lad.setStyle("-fx-font: 15 Calibri;");
        lad.setTextFill(Color.web("#998488"));
        
        Line li = new Line(0,135,400,135);
        li.setFill(Color.web("#657889"));
        
        TextField t1 = new TextField();
        Label lt1 = new Label("الإسم",t1);
        lt1.setContentDisplay(ContentDisplay.BOTTOM);
        lt1.setStyle("-fx-font: 15 Calibri;");
        lt1.setTextFill(Color.web("#998488"));

        TextField t2 = new TextField();
        Label lt2 = new Label("القرابــة",t2);
        lt2.setContentDisplay(ContentDisplay.BOTTOM);
        lt2.setStyle("-fx-font: 15 Calibri;");
        lt2.setTextFill(Color.web("#998488"));

        TextField t3 = new TextField();
        Label lt3 = new Label("الــعمر",t3);
        lt3.setContentDisplay(ContentDisplay.BOTTOM);
        lt3.setStyle("-fx-font: 15 Calibri;");
        lt3.setTextFill(Color.web("#998488"));

        VBox vb0 = new VBox(20);
        vb0.getChildren().addAll(lt1,lt2,lt3);
        vb0.setAlignment(Pos.CENTER);
        vb0.setPadding(new Insets(190, 200, 200, 110));
       
       
        Label msgmr = new Label("");
        msgmr.setTranslateX(100);
        msgmr.setTranslateY(500);
        msgmr.setStyle("-fx-font: 15 Calibri;");
        msgmr.setTextFill(Color.web("#998488"));
        
        
        Button bsave = new Button("حــفـظ");
        bsave.setTextFill(Color.WHITE);
        bsave.setAlignment(Pos.CENTER);
        bsave.setTranslateX(140);
        bsave.setTranslateY(400);
         bsave.setPrefHeight(32.0);
         bsave.setPrefWidth(120.0);
         bsave.setStyle("-fx-background-color: #e2c3c9;");
        
         bsave.setOnAction(e->{
             
         user user= new user ();
         user.setName(t1.getText());
         user.setAge(t3.getText());
         user.setRelation(t2.getText());
         int id ;
         Random rand = new Random(); 
         int upperbound = 7;
           id = rand.nextInt(999999);     
          user.setId(String.valueOf(id));
          
          msgmr.setText("كود الدخول الخاص بــ    "+t1.getText()+" : "+id);
          tff6.getItems().add(t1.getText());
            cbo.getItems().add(t1.getText());
        cbo22.getItems().add(t1.getText());  
        cbohistory.getItems().add(t1.getText()) ; 
        cboview.getItems().add(t1.getText()) ;
           Session session22 = HibernateUtil.getSessionFactory().openSession();
             Transaction tx55 = session22.beginTransaction();
             session22.save(user);
             tx55.commit();
             session22.close();
        System.out.println("inserted user: "+user.getName());
 // primaryStage.setScene(HP2);
         });
         
        ImageView backi2=new ImageView(new Image("Image/ba.png"));
        backi2.setFitHeight(40.0);
        backi2.setFitWidth(30.0);
        backi2.setLayoutX(20.0);
        backi2.setLayoutY(30.0);
        backi2.setPickOnBounds(true);
        backi2.setPreserveRatio(true);
        
        ImageView backee5 = new ImageView(backg);
        backee5.setFitWidth(400);
        backee5.setFitHeight(600); 
        
       Pane forAddm = new Pane();
       forAddm.setStyle("-fx-background-color:fbf2f1");
       forAddm.getChildren().addAll(backee5,vb0,imm,li,lad,msgmr,bsave,backi2);
       
      Addmr = new Scene(forAddm,400, 600);
      
    
         
  //شاشةالدكاتره 
  
  Image iqD = new Image("Image/call.png");
  
        ImageView imD = new ImageView(iqD);
        imD.setX(140);
        imD.setY(10);
        imD.setFitHeight(60);
        imD.setFitWidth(65);
        
        Text tx0 = new Text(130, 90, "للتواصل و الإستشـا رة");
                tx0.setStyle("-fx-font: 15 Calibri;");
        tx0.setFill(Color.web("#998488"));
        
        Line lin = new Line(0, 110, 400, 110);
        lin.setFill(Color.web("#657889"));
        
        Rectangle r1 = new Rectangle(20, 150, 310, 120);
        r1.setFill(Color.WHITE);
        r1.setOpacity(0.7);
        Text tx1 = new Text(110, 190, "دكتور محمد ضيف الله");
        tx1.setStyle("-fx-font: 15 Calibri;");
        tx1.setFill(Color.web("#998488"));
        Text tx22 = new Text(125, 225, "تشـريح و علم الأجنة");
        tx22.setStyle("-fx-font: 15 Calibri;");
        tx22.setFill(Color.web("#998488"));
        Text tx3 = new Text(130, 260, "+201147747768");
        tx3.setStyle("-fx-font: 15 Calibri;");
        tx3.setFill(Color.web("#998488"));
        Image img1 = new Image("Image/d2.png");
        ImageView iv1 = new ImageView(img1);
        iv1.setX(240);
        iv1.setY(180);
        iv1.setFitHeight(70);
        iv1.setFitWidth(70);
        
        Rectangle r2 = new Rectangle(20, 300, 310, 120);
        r2.setFill(Color.WHITE);
                r2.setOpacity(0.7);
        Text tx4 = new Text(125, 340, "دكتورة شهد هاني");
       tx4.setStyle("-fx-font: 15 Calibri;");
        tx4.setFill(Color.web("#998488"));
        Text tx5 = new Text(160, 375, "طب أسنان");
       tx5.setStyle("-fx-font: 15 Calibri;");
        tx5.setFill(Color.web("#998488"));
        Text tx6 = new Text(125, 410, "+201147747768");
       tx6.setStyle("-fx-font: 15 Calibri;");
        tx6.setFill(Color.web("#998488"));
        Image img2 = new Image("Image/d1.png");
        ImageView iv2 = new ImageView(img2);
        iv2.setX(240);
        iv2.setY(325);
        iv2.setFitHeight(70);
        iv2.setFitWidth(70);
        
        Rectangle r3 = new Rectangle(20, 450, 310, 120);
         r3.setOpacity(0.7);
        r3.setFill(Color.WHITE);
        Text tx7 = new Text(135, 490, "دكتورة نبأ العنزي");
       tx7.setStyle("-fx-font: 15 Calibri;");
        tx7.setFill(Color.web("#998488"));
        Text tx8 = new Text(130, 525, "أخصائي تمريض");
       tx8.setStyle("-fx-font: 15 Calibri;");
        tx8.setFill(Color.web("#998488"));
        Text tx9 = new Text(125, 560, "+201147747768");
       tx9.setStyle("-fx-font: 15 Calibri;");
        tx9.setFill(Color.web("#998488"));
        Image img3 = new Image("Image/d3.png");
        ImageView iv3 = new ImageView(img3);
        iv3.setX(240);
        iv3.setY(475);
        iv3.setFitHeight(70);
        iv3.setFitWidth(70);
        
        ImageView backi6=new ImageView(new Image("Image/ba.png"));
        backi6.setFitHeight(40.0);
        backi6.setFitWidth(30.0);
        backi6.setLayoutX(20.0);
        backi6.setLayoutY(30.0);
        backi6.setPickOnBounds(true);
        backi6.setPreserveRatio(true);

        ImageView backee6 = new ImageView(backg);
        backee6.setFitWidth(400);
        backee6.setFitHeight(600); 
        
        Pane forAddD = new Pane();
        forAddD.setStyle("-fx-background-color:fbf2f1");
        forAddD.getChildren().addAll(backee6,imD, tx0, lin, r1, tx1, tx22, tx3, iv1, r2, tx4, tx5, tx6, iv2, r3, tx7, tx8, tx9, iv3,backi6);
         sceneforD = new Scene(forAddD, 400, 600);
  
  /// شاشه الجداول

        ImageView imgView = new ImageView(new Image("Image/notification.png"));
        imgView.setX(170);
        imgView.setY(20);
        imgView.setFitHeight(60);
        imgView.setFitWidth(65);
        
        Text tView = new Text(155, 100, "المواعيد ");
        tView.setFill(Color.web("#998488"));
        tView.setStyle("-fx-font: 17 Calibri;");
         Line lView  = new Line(0,135,370,135);
        lView.setFill(Color.web("#657889"));
  
  ImageView backi9=new ImageView(new Image("Image/ba.png"));
        backi9.setFitHeight(40.0);
        backi9.setFitWidth(30.0);
        backi9.setLayoutX(20.0);
        backi9.setLayoutY(30.0);
        backi9.setPickOnBounds(true);
        backi9.setPreserveRatio(true);
         cboview.setEditable(true);
        cboview.setPrefWidth(250);
        cboview.setValue("عرض الوصفة لـ ");
        cboview.setVisibleRowCount(2);
               cboview.setStyle("-fx-font: 15 Calibri;");
         ObservableList <medicne> dataView =FXCollections.observableArrayList();
        cboview.setOnAction(e->{
            dataView.clear();
               Session session = HibernateUtil.getSessionFactory().openSession();
             Transaction tx2 = session.beginTransaction();
             List<medicne> list =null;
             String queryp ="from medicne";
             Query query = session.createQuery(queryp);
             list=query.list();
                for(medicne m:list){ 
                  if (cboview.getValue().equals(m.getUsername()) ){
                   medicne mm=new medicne(m.getName(),m.getEat(),String.valueOf(24-Integer.valueOf(m.getSleepT())/Integer.valueOf(m.getPeriod())));
                   dataView.add(mm);}
                  
                }
                tx2.commit();
                 session.close();});


   TableView<medicne> tableView = new TableView<medicne>(dataView);  
                tableView.setEditable(true); 
        tableView.setMaxSize(320, 400);
      

        TableColumn ViewNameCol = new TableColumn("اسم الدواء");  
        ViewNameCol.setMaxWidth(65);  
        ViewNameCol.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("name")); 

        TableColumn ViewEatCol = new TableColumn("إشتراط الأكل قبل الدواء");  
        ViewEatCol.setMinWidth(130);  
       ViewEatCol.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("eat")); 
       
          TableColumn ViewTimeCol = new TableColumn("الموعد");  
        ViewTimeCol.setMaxWidth(65);  
        ViewTimeCol.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("Time")); 

        TableColumn ViewcheckCol = new TableColumn("تم");  
       ViewcheckCol.setMaxWidth(60); 
  ViewcheckCol.setCellFactory(
           new PropertyValueFactory<medicne , String>("done")); 
ViewcheckCol.setCellFactory(TextFieldTableCell.forTableColumn());  
        ViewcheckCol.setOnEditCommit(  
            new EventHandler<CellEditEvent<medicne, String>>() {  
                @Override  
                public void handle(CellEditEvent<medicne, String> t) {  
                    ((medicne) t.getTableView().getItems().get(  
                        t.getTablePosition().getRow())  
                        ).setCheck(t.getNewValue());  
                }  
            }  
        );  
 

        tableView.getColumns().addAll(ViewNameCol,ViewTimeCol, ViewEatCol,ViewcheckCol);
        
        Text ttx = new Text( "  يشترط الأكل قبل تناول الدواء"+
                " (true) "
                + " \n"
              + "(false)"
             + " لا يشترط الأكل قبل تناول الدواء "
                );
        ttx.setStyle("-fx-font: 17 Calibri;");
        

        VBox Viewvbox = new VBox();  
        Viewvbox.setSpacing(5);  
        Viewvbox.setPadding(new Insets(10, 0, 0, 10)); 
        Viewvbox.getChildren().addAll(imgView,tView,lView,cboview,tableView,ttx);
        Viewvbox.setAlignment(Pos.CENTER);
        
        
        ImageView backee7 = new ImageView(backg);
        backee7.setFitWidth(400);
        backee7.setFitHeight(600); 
        
        Pane vieww = new Pane();
        vieww.getChildren().addAll(backee7,Viewvbox,backi9);

         
            View= new Scene(vieww, 400, 600);
  
  
  ///شاشه الهيستوري
    ImageView imghistory = new ImageView(new Image("Image/historyy.png"));
        imghistory.setX(170);
        imghistory.setY(20);
        imghistory.setFitHeight(60);
        imghistory.setFitWidth(65);
        
        Text thistory = new Text(155, 100, "التاريخ العلاجي ");
        thistory.setFill(Color.web("#998488"));
        thistory.setStyle("-fx-font: 17 Calibri;");
         Line lhistory  = new Line(0,135,370,135);
        lhistory.setFill(Color.web("#657889"));
        
        ImageView backi10=new ImageView(new Image("Image/ba.png"));
        backi10.setFitHeight(40.0);
        backi10.setFitWidth(30.0);
        backi10.setLayoutX(20.0);
        backi10.setLayoutY(30.0);
        backi10.setPickOnBounds(true);
        backi10.setPreserveRatio(true);
        cbohistory.setEditable(true);
        cbohistory.setPrefWidth(250);
        cbohistory.setValue("عرض ا لتا ريخ  لـ ");
        cbohistory.setVisibleRowCount(2);
               cbohistory.setStyle("-fx-font: 15 Calibri;");

         ObservableList<history> data =FXCollections.observableArrayList();
        cbohistory.setOnAction(e->{
            data.clear();
               Session session = HibernateUtil.getSessionFactory().openSession();
             Transaction tx2 = session.beginTransaction();
             List<history> list =null;
             String queryp ="from history";
             Query query = session.createQuery(queryp);
             list=query.list();
                for(history h:list){ 
                 if (cbohistory.getValue().equals(h.getUsername()) ){
                   history hh=new history(h.getName(),h.getNumcap(),h.getPeriod(),h.getEat());
                   data.add(hh);}
                   
                 
         ///  
                }
                tx2.commit();
                 session.close();});


         TableView<history> table = new TableView<history>(data);  
    

        table.setEditable(true);  
        table.setMaxSize(320, 500);
        
        TableColumn NameCol = new TableColumn("اسم الدواء");  
        NameCol.setMaxWidth(65);  
        NameCol.setCellValueFactory(  
                new PropertyValueFactory<history, String>("name"));   

        TableColumn numcapCol = new TableColumn("عدد الحبوب");  
        numcapCol.setMaxWidth(70);  
        numcapCol.setCellValueFactory(  
                new PropertyValueFactory<history, String>("numcap"));
        
         TableColumn periodCol = new TableColumn("المدة");  
        periodCol.setMaxWidth(60);  
       periodCol.setCellValueFactory(  
                new PropertyValueFactory<history, String>("period"));

       TableColumn EatCol = new TableColumn("إشتراط الأكل قبل الدواء");  
       EatCol.setMinWidth(125);  
       EatCol.setCellValueFactory(  
                new PropertyValueFactory<medicne, String>("eat"));
       
        table.getColumns().addAll(NameCol, periodCol, numcapCol,EatCol);
        
          Text ttxx = new Text(
            "  يشترط الأكل قبل تناول الدواء"+
                " (true) "
                + " \n"
              + "(false)"
             + " لا يشترط الأكل قبل تناول الدواء "
                );
        ttxx.setStyle("-fx-font: 17 Calibri;");

    
     
        VBox historyvbox = new VBox();  
        historyvbox.setSpacing(5);  
        historyvbox.setPadding(new Insets(10, 0, 0, 10)); 
        historyvbox.getChildren().addAll(imghistory,thistory,lhistory,cbohistory, table,ttxx);  
         historyvbox.setAlignment(Pos.CENTER);
         
        ImageView backee8 = new ImageView(backg);
        backee8.setFitWidth(400);
        backee8.setFitHeight(600); 
        
      
        
                Pane his = new Pane();
        his.getChildren().addAll(backee8,historyvbox,backi10);
        
           history = new Scene(his, 400, 600);
        
   ///
              backi5.setOnMouseClicked(e -> {
             primaryStage.setScene(HP);
             });
               backi8.setOnMouseClicked(e -> {
             primaryStage.setScene(HP);
             });
              
              
              backi2.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
                backi3.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
                  backi4.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
              backi6.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
                 backi7.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
                    backi9.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
               backi10.setOnMouseClicked(e -> {
             primaryStage.setScene(HP2);
             });
         
        primaryStage.setTitle("SE!");
        primaryStage.setScene(HP);
        primaryStage.getIcons().add(new Image("Image/صورة1.png"));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
