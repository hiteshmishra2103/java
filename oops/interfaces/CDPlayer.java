package oops.interfaces;

public class CDPlayer implements Media {
@Override
public void start(){
    System.out.println("Rock music on");
}

public void stop(){
    System.out.println("music stop!");
}
}
