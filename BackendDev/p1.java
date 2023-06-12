import java.beans.Statement;
import java.sql.ResultSet;

class ABC implements
ResultSet myRs=null;
myRs=myStmt.executeQuery("Select * from jdbc_id");
while(myRs.next()){
    System.out.println(myRs.getString("jdbc_id")+", "+);
    
}

void callFromFrontEnd(){
    Connection myConn=null;
    Statement myStmt=null;
    ResultSet myRs=null;

    try{

    }catch(Exception e){
        
    }
}